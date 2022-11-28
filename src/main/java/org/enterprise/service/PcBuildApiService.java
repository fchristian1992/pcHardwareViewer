package org.enterprise.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.enterprise.entity.PcBuild;
import org.enterprise.entity.User;
import org.enterprise.persistence.GenericDao;

public class PcBuildApiService {
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Create a new book manually with the given parameters entered at the REST
     * API
     * CREATE.r.u.d
     */
    public String createPcBuild(String cpuModel, String gpuModel,
            String cpuCoolerModel, String motherboardModel, String psuModel,
            String caseModel, String dataStorageModel, String ramModel,
            User user) {
        // Create a new book object and populate it with the given parameters.
        PcBuild newBuild = new PcBuild(cpuModel, gpuModel, cpuCoolerModel,
                motherboardModel, psuModel, caseModel, dataStorageModel,
                ramModel, user);
        GenericDao<PcBuild> pcBuildDao = new GenericDao(PcBuild.class);

        pcBuildDao.insert(newBuild);
        logger.debug("Sending back new PC build info ..." + newBuild);

        ObjectMapper mapper = new ObjectMapper();
        String json = null;

        try {
            json = mapper.writeValueAsString(newBuild);
            logger.debug("ResultingJSONstring = " + json);
        } catch (JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }

    /**
     * Method to get a PC build by its id.
     * c.READ.u.d
     *
     * @param pcBuildId the id of the PC build to get.
     * @return the PC build with the given id.
     */
    public String getSpecificPcBuild(int pcBuildId) {
        // Create a new dao to get a PcBuild data response.
        GenericDao<PcBuild> pcBuildDao = new GenericDao(PcBuild.class);

        // Get the PC build with the given id.
        PcBuild retrievedPcBuild = pcBuildDao.getById(pcBuildId);

        logger.debug("Sending back PC build with id: " + pcBuildId + "..."
                + retrievedPcBuild);

        ObjectMapper mapper = new ObjectMapper();
        String json = null;

        try {
            json = mapper.writeValueAsString(retrievedPcBuild);
            logger.debug("ResultingJSONstring = " + json);
        } catch (JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }

    /**
     * Method to update a PC build with given info from the REST API.
     * c.r.UPDATE.d
     *
     * @return the PC build with the given id.
     */
    public String updatePcBuild(int buildId, String cpuModel, String gpuModel,
            String cpuCoolerModel, String motherboardModel, String psuModel,
            String caseModel, String dataStorageModel, String ramModel) {
        // Creat the new pcBuildDao.
        GenericDao<PcBuild> pcBuildDao = new GenericDao(PcBuild.class);

        // Get the PcBuild object by given bookId.
        PcBuild pcBuildToBeUpdated = pcBuildDao.getById(buildId);

        // Set the new values for the PC build.
        // If the value is null, then don't change it.
        if (cpuModel != null) {
            pcBuildToBeUpdated.setCpuModel(cpuModel);
        }
        if (gpuModel != null) {
            pcBuildToBeUpdated.setGpuModel(gpuModel);
        }
        if (cpuCoolerModel != null) {
            pcBuildToBeUpdated.setCpuCoolerModel(cpuCoolerModel);
        }
        if (motherboardModel != null) {
            pcBuildToBeUpdated.setMotherboardModel(motherboardModel);
        }
        if (psuModel != null) {
            pcBuildToBeUpdated.setPsuModel(psuModel);
        }
        if (caseModel != null) {
            pcBuildToBeUpdated.setCaseModel(caseModel);
        }
        if (dataStorageModel != null) {
            pcBuildToBeUpdated.setDataStorageModel(dataStorageModel);
        }
        if (ramModel != null) {
            pcBuildToBeUpdated.setRamModel(ramModel);
        }

        // Update the PC build.
        pcBuildDao.saveOrUpdate(pcBuildToBeUpdated);

        logger.debug("Sending back updated PC build info ..."
                + pcBuildToBeUpdated);

        ObjectMapper mapper = new ObjectMapper();
        String json = null;

        try {
            json = mapper.writeValueAsString(pcBuildToBeUpdated);
            logger.debug("ResultingJSONstring = " + json);
        } catch (JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }
}
