package entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * The type User.
 */
@Entity(name = "User")
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "builds", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int buildId;

    public User() {}

    /**
     * Instantiates a new User.
     *
     * @param userId   the user id
     * @param username the username
     * @param password the password
     * @param buildId  the build id
     */
    public User(int userId, String username, String password, int buildId) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.buildId = buildId;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}