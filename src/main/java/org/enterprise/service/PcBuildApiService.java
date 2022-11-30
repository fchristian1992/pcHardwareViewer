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
    ObjectMapper mapper = new ObjectMapper();

    /**
     * Create a new PcBuild with the given parameters
     * CREATE.r.u.d
     *
     * @param cpuModel         the cpu model
     * @param gpuModel         the gpu model
     * @param cpuCoolerModel   the cpu cooler model
     * @param motherboardModel the motherboard model
     * @param psuModel         the psu model
     * @param caseModel        the case model
     * @param dataStorageModel the data storage model
     * @param ramModel         the ram model
     * @param user             the user
     * @return
     */
    public String createPcBuild(String cpuModel, String gpuModel,
            String cpuCoolerModel, String motherboardModel, String psuModel,
            String caseModel, String dataStorageModel, String ramModel,
            User user) {
        // Create a new PCBuild object and populate it with the given parameters
        PcBuild newBuild = new PcBuild(cpuModel, gpuModel, cpuCoolerModel,
                motherboardModel, psuModel, caseModel, dataStorageModel,
                ramModel, user);
        GenericDao<PcBuild> pcBuildDao = new GenericDao<>(PcBuild.class);

        pcBuildDao.insert(newBuild);
        logger.debug("Sending back new PC build info ..." + newBuild);

        String json = null;

        try {
            json = mapper.writeValueAsString(newBuild);

            logger.debug("ResultingJSONstring = " + json);
        } catch(JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }

    /**
     * Method to get a PcBuild by its id.
     * c.READ.u.d
     *
     * @param pcBuildId the id of the PcBuild to get.
     * @return the PcBuild with the given id.
     */
    public String getSpecificPcBuild(int pcBuildId) {
        // Create a new dao to get a PcBuild data response.
        GenericDao<PcBuild> pcBuildDao = new GenericDao<>(PcBuild.class);

        // Get the PcBuild with the given id.
        PcBuild retrievedPcBuild = pcBuildDao.getById(pcBuildId);

        logger.debug("Sending back PC build with id: " + pcBuildId + "..."
                + retrievedPcBuild);

        String json = null;

        try {
            json = mapper.writeValueAsString(retrievedPcBuild);

            logger.debug("ResultingJSONstring = " + json);
        } catch(JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }

    /**
     * Method to update a PcBuild with given info
     * c.r.UPDATE.d
     *
     * @param buildId          the PcBuild ID
     * @param cpuModel         the cpu model
     * @param gpuModel         the gpu model
     * @param cpuCoolerModel   the cpu cooler model
     * @param motherboardModel the motherboard model
     * @param psuModel         the psu model
     * @param caseModel        the case model
     * @param dataStorageModel the data storage model
     * @param ramModel         the ram model
     * @return the PC build with the given id.
     */
    public String updatePcBuild(int buildId, String cpuModel, String gpuModel,
            String cpuCoolerModel, String motherboardModel, String psuModel,
            String caseModel, String dataStorageModel, String ramModel) {
        // Creat the new pcBuildDao.
        GenericDao<PcBuild> pcBuildDao = new GenericDao(PcBuild.class);

        // Get the PcBuild object by given buildId.
        PcBuild pcBuildToBeUpdated = pcBuildDao.getById(buildId);

        // Set the new values for the PC build.
        // If the value is null, then don't change it.
        if(cpuModel != null) {
            pcBuildToBeUpdated.setCpuModel(cpuModel);
        }
        if(gpuModel != null) {
            pcBuildToBeUpdated.setGpuModel(gpuModel);
        }
        if(cpuCoolerModel != null) {
            pcBuildToBeUpdated.setCpuCoolerModel(cpuCoolerModel);
        }
        if(motherboardModel != null) {
            pcBuildToBeUpdated.setMotherboardModel(motherboardModel);
        }
        if(psuModel != null) {
            pcBuildToBeUpdated.setPsuModel(psuModel);
        }
        if(caseModel != null) {
            pcBuildToBeUpdated.setCaseModel(caseModel);
        }
        if(dataStorageModel != null) {
            pcBuildToBeUpdated.setDataStorageModel(dataStorageModel);
        }
        if(ramModel != null) {
            pcBuildToBeUpdated.setRamModel(ramModel);
        }

        // Update the PcBuild.
        pcBuildDao.saveOrUpdate(pcBuildToBeUpdated);
        logger.debug("Sending back updated PC build info ..."
                + pcBuildToBeUpdated);

        String json = null;

        try {
            json = mapper.writeValueAsString(pcBuildToBeUpdated);

            logger.debug("ResultingJSONstring = " + json);
        } catch(JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }

    /**
     * Method to delete a PcBuild by its id.
     * c.r.u.DELETE
     *
     * @param buildId the id of the PcBuild to update.
     * @return the PcBuild with the given id.
     */
    public String deletePcBuild(int buildId) {
        boolean success = false;

        // Create a new dao to get a PcBuild data response.
        GenericDao<PcBuild> pcBuildDao = new GenericDao<>(PcBuild.class);

        // Get the PcBuild with the given id.
        PcBuild pcBuildToDelete = pcBuildDao.getById(buildId);

        // Delete the PcBuild
        if(pcBuildToDelete != null) {
            pcBuildDao.delete(pcBuildToDelete);

            success = true;
        }

        logger.debug("Was PcBuild deleted: " + success);

        // If the PcBuild was deleted, return the PcBuild data back to user.
        if(success) {
            String json = null;

            try {
                json = mapper.writeValueAsString(pcBuildToDelete);

                logger.debug("ResultingJSONstring = " + json);
            } catch(JsonProcessingException e) {
                logger.error("JSON Processing Exception: " + e);
            }

            return json;
        } else {
            return "There was an error deleting the book.";
        }
    }
}
