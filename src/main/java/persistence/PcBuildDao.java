package persistence;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import entity.PcBuild;

/**
 * The type Pc build dao.
 */
public class PcBuildDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets a PC build by id.
     *
     * @param id the id
     * @return the by id
     */
    public PcBuild getById(int id) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<PcBuild> query = builder.createQuery(PcBuild.class);
        Root<PcBuild> root = query.from(PcBuild.class);
        Expression<String> propertyPath = root.get("id");
        query.where(builder.equal(propertyPath, id));
        PcBuild pcBuild = session.createQuery(query).getSingleResult();
        session.close();
        return pcBuild;
    }

    /**
     * Save or update PC build.
     *
     * @param pcBuild the pc build
     */
    public void saveOrUpdatePcBuild(PcBuild pcBuild) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(pcBuild);
        transaction.commit();
        session.close();
    }

    /**
     * Adds a PC build
     *
     * @param pcBuild the pc build
     * @return PC build id
     */
    public int insert(PcBuild pcBuild) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int) session.save(pcBuild);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Deletes a pc build
     *
     * @param pcBuild the pc build
     */
    public void delete(PcBuild pcBuild) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(pcBuild);
        transaction.commit();
        session.close();
    }
}
