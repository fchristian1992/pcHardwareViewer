package persistence;

import entity.PcBuild;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Database;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PcBuildDaoTest {
    PcBuildDao dao;

    @BeforeEach
    void setUp() {
        dao = new PcBuildDao();
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void getById() {
        PcBuild retrievedPcBuild = dao.getById(1);
        assertEquals("PowerColor Red Devil OC Radeon RX 6950 XT", retrievedPcBuild.getGpuModel());
    }

    @Test
    void saveOrUpdatePcBuild() {
    }

    @Test
    void insert() {
    }

    @Test
    void delete() {
    }
}