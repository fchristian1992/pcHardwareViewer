package org.enterprise.restful;

import org.enterprise.entity.User;
import org.enterprise.persistence.GenericDao;
import org.enterprise.service.PcBuildApiService;
import org.enterprise.service.UserApiService;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

public class HardwareViewerRestful {
    UserApiService userRelatedData = new UserApiService();
    PcBuildApiService pcBuildRelatedData = new PcBuildApiService();

    //**************************************************************************
    //                        USER RESTFUL METHODS
    //**************************************************************************
    /**
     * Create a new user and add to database.
     * CREATE.r.u.d
     *
     * http://localhost:8080
     * @version 1.5 Working
     *
     * @param username
     * @param password
     * @return A JSON object with the new users info
     */
    @POST
    @Path("users/add")
    @Produces("application/json")
    public Response restfulCreateUser(
            @QueryParam("username") String username,
            @QueryParam("password") String password) {
        // Call createUser method from UserApiService to create a new user.
        String newUserJson = userRelatedData.createUser(username, password);

        // Return the new user to the requester.
        return Response.status(200).entity(newUserJson).build();
    }

    /**
     * Get a specific user by inputting an id
     * c.READ.u.d
     *
     * http://localhost:8080/
     * @version 1.5 Working
     *
     * @param userId
     * @return json specific user
     */
    @GET
    @Path("users/{userId}")
    @Produces("application/json")
    public Response restfulGetSpecificUser(@PathParam("userId") int userId) {
        // Get a specific user based on id provided.
        String specificReader = userRelatedData.getSpecificUser(userId);

        // Send the results out to the GET
        return Response.status(200).entity(specificReader).build();
    }

    /**
     * Update a user's information
     * c.r.UPDATE.d
     *
     * http://localhost:8080/
     * @version 1.5 Working
     *
     * @param
     * @return the response
     */
    @PUT
    @Path("users/update/{userId}")
    @Produces("application/json")
    public Response restfulUpdateUser(
            @PathParam("userId") int userId,
            @QueryParam("username") String username,
            @QueryParam("password") String password) {
        // Take userId and new parameters and send to update user method.
        // Return new user info.
        String updatedUser = userRelatedData.updateUser(userId, username,
                password);

        // Return the response to the GET.
        return Response.status(200).entity(updatedUser).build();
    }

    /**
     * Delete a user.
     * c.r.u.DELETE
     *
     * http://localhost:8080/
     * @version 1.5 Working
     *
     * @return the response
     */
    @DELETE
    @Path("users/delete/{userId}")
    @Produces("application/json")
    public Response restfulDeleteUser(@PathParam("userId") int userId) {
        // Call on delete user method to delete the user.
        String message = userRelatedData.deleteUser(userId);

        // Return the result to the requester.
        return Response.status(200).entity(message).build();
    }

    //**************************************************************************
    //                      PCBUILD RESTFUL METHODS
    //**************************************************************************
    /**
     * Create a new PcBuild and add to the database manually.
     * CREATE.r.u.d
     *
     * http://localhost:8080/
     * @version 1.5 Working
     *
     * @param cpuModel         the cpu model
     * @param gpuModel         the gpu model
     * @param cpuCoolerModel   the cpu cooler model
     * @param motherboardModel the motherboard model
     * @param psuModel         the psu model
     * @param caseModel        the case model
     * @param dataStorageModel the data storage model
     * @param ramModel         the ram model
     * @param userId           the user
     * @return A JSON object with the new PC build info.
     */
    @POST
    @Path("pcbuild/add")
    @Produces("application/json")
    public Response restfulCreatePcBuild(
            @QueryParam("cpu_model") String cpuModel,
            @QueryParam("gpu_model") String gpuModel,
            @QueryParam("cpu_cooler_model") String cpuCoolerModel,
            @QueryParam("motherboard_model") String motherboardModel,
            @QueryParam("psu_model") String psuModel,
            @QueryParam("case_model") String caseModel,
            @QueryParam("data_storage_model") String dataStorageModel,
            @QueryParam("ram_model") String ramModel,
            @QueryParam("userId") int userId) {
        GenericDao<User> dao = new GenericDao<>(User.class);
        User user = dao.getById(userId);

        // Send PcBuild info to create PcBuild method and return the new
        // PcBuild info.
        String newPcBuild = pcBuildRelatedData.createPcBuild(cpuModel,
                gpuModel, cpuCoolerModel, motherboardModel, psuModel, caseModel,
                dataStorageModel, ramModel, user);

        // Return the new PcBuild to the requester.
        return Response.status(200).entity(newPcBuild).build();
    }

    /**
     * Get a specific PcBuild by pcBuildId
     * c.READ.u.d
     *
     * http://localhost:8080/
     * @version 1.5 Working
     *
     * @param buildId
     * @return
     */
    @GET
    @Path("pcbuild/{buildId}")
    @Produces("application/json")
    public Response restfulGetSpecificPcBuild(@PathParam("buildId") int buildId) {
        // Get a specific PcBuild based on id provided.
        String specificPcBuild = pcBuildRelatedData.getSpecificPcBuild(buildId);

        // Send the results out to the GET
        return Response.status(200).entity(specificPcBuild).build();
    }

    /**
     * Update a PcBuild in the database.
     * c.r.UPDATE.d
     *
     * http://localhost:8080/
     * @version 1.0 Working
     *
     * @param cpuModel         the cpu model
     * @param gpuModel         the gpu model
     * @param cpuCoolerModel   the cpu cooler model
     * @param motherboardModel the motherboard model
     * @param psuModel         the psu model
     * @param caseModel        the case model
     * @param dataStorageModel the data storage model
     * @param ramModel         the ram model
     * @return A JSON object with the new PC build info.
     */
    @PUT
    @Path("pcbuild/update/{buildId}")
    @Produces("application/json")
    public Response restfulUpdatePcBuild(
            @PathParam("buildId") int buildId,
            @QueryParam("cpu_model") String cpuModel,
            @QueryParam("gpu_model") String gpuModel,
            @QueryParam("cpu_cooler_model") String cpuCoolerModel,
            @QueryParam("motherboard_model") String motherboardModel,
            @QueryParam("psu_model") String psuModel,
            @QueryParam("case_model") String caseModel,
            @QueryParam("data_storage_model") String dataStorageModel,
            @QueryParam("ram_model") String ramModel) {
        // Update the PcBuild in the database.
        String updatedPcBuildOutput = pcBuildRelatedData.updatePcBuild(buildId,
                cpuModel, gpuModel, cpuCoolerModel, motherboardModel, psuModel,
                caseModel, dataStorageModel, ramModel);

        // Return the new PcBuild to the requester.
        return Response.status(200).entity(updatedPcBuildOutput).build();
    }

    /**
     * Delete a PcBuild
     * c.r.u.DELETE
     *
     * http://localhost:8080/
     * @version 0.5 Needs Work
     *
     * @param buildId
     * @return
     */
    @DELETE
    @Path("pcbuild/delete/{buildId}")
    @Produces("application/json")
    public Response restfulDeletePcBuild(@PathParam("buildId") int buildId) {
        String json = pcBuildRelatedData.deletePcBuild(buildId);

        // Send the results out to the GET
        return Response.status(200).entity(json).build();
    }
}
