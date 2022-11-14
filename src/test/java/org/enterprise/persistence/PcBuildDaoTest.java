package org.enterprise.persistence;

import org.enterprise.entity.PcBuild;
import org.enterprise.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.enterprise.util.Database;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PcBuildDaoTest {
    PcBuildDao dao;

    @BeforeEach
    void setUp() {
        dao = new PcBuildDao();
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void getByIdTest() {
        PcBuild retrievedPcBuild = dao.getById(1);
        assertEquals("PowerColor Red Devil OC Radeon RX 6950 XT", retrievedPcBuild.getGpuModel());
    }

    @Test
    void saveOrUpdatePcBuildTest() {
        String newGpuModel = "XFX Speedster Merc 319 Radeon RX 6950 XT";
        PcBuild pcBuildToUpdate = dao.getById(1);
        pcBuildToUpdate.setGpuModel(newGpuModel);
        dao.saveOrUpdatePcBuild(pcBuildToUpdate);
        PcBuild retrievedPcBuild = dao.getById(1);
        assertEquals(newGpuModel, retrievedPcBuild.getGpuModel());
    }

    @Test
    void insertPcBuildTest() {
        UserDao userDao = new UserDao();
        User user = userDao.getById(1);
        PcBuild pcBuildToInsert = new PcBuild("7600X", "Radeon RX 7900 XTX",
                "Noctua NH-D15", "MSI MAG TOMAHAWK B650", "1000W PSU",
                "Cooler Master case", "Samsung 990 Pro 2 TB",
                "DDR5-5600 16 x 2 GB kit", user);
        int id = dao.insert(pcBuildToInsert);
        PcBuild insertedPcBuild = dao.getById(id);
        assertEquals("7600X", insertedPcBuild.getCpuModel());
    }

    @Test
    void deleteTest() {
        dao.delete(dao.getById(2));
        assertNull(dao.getById(2));

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }
}