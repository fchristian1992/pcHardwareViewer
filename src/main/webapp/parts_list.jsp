<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" value="Parts List" />
<html lang="en">
    <%@include file="head.jsp"%>

    <body>
        <div class="container">
            <%@include file="header.jsp"%>

            <main>
                <div class="row row-cols-2 row-cols-md-3 row-cols-lg-4">
                    <div class="col">
                        <div class="card program-box mb-3">
                            <h3 class="card-header text-center bg-warning">
                                CPU
                            </h3>

                            <img src="images/cpu-icon.png" class="card-img-top"
                                 alt="CPU">

                            <div class="card-body bg-light text-dark">
                                <p class="card-text text-center">
                                    ${pcBuild.cpuModel}
                                </p>

                                <div class="card-footer text-center">
                                    <form action="editPcParts" method="post">
                                        <label for="cpu_model">
                                            Edit part:
                                        </label>

                                        <input type="text" name="cpu_model"
                                               id="cpu_model"><br />

                                        <button type="submit" value="Submit">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col">
                        <div class="card program-box mb-3">
                            <h3 class="card-header text-center bg-warning">
                                GPU
                            </h3>

                            <img src="images/gpu-icon.png" class="card-img-top"
                                 alt="GPU">

                            <div class="card-body bg-light text-dark">
                                <p class="card-text text-center">
                                    ${pcBuild.gpuModel}
                                </p>

                                <div class="card-footer text-center">
                                    <form action="editPcParts" method="post">
                                        <label for="gpu_model">
                                            Edit part:
                                        </label>

                                        <input type="text" name="gpu_model"
                                               id="gpu_model"><br />

                                        <button type="submit" value="Submit">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col">
                        <div class="card program-box mb-3">
                            <h3 class="card-header text-center bg-warning">
                                CPU Cooler
                            </h3>

                            <img src="images/cpu-cooler-icon.png"
                                     class="card-img-top" alt="CPU Cooler">

                            <div class="card-body bg-light text-dark">
                                <p class="card-text text-center">
                                    ${pcBuild.cpuCoolerModel}
                                </p>

                                <div class="card-footer text-center">
                                    <form action="editPcParts" method="post">
                                        <label for="cpu_cooler_model">
                                            Edit part:
                                        </label>

                                        <input type="text"
                                               name="cpu_cooler_model"
                                               id="cpu_cooler_model"><br />

                                        <button type="submit" value="Submit">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col">
                        <div class="card program-box mb-3">
                            <h3 class="card-header bg-warning">Motherboard</h3>

                            <img src="images/motherboard-icon.png"
                                    class="card-img-top" alt="Motherboard">

                            <div class="card-body bg-light text-dark">
                                <p class="card-text">
                                    ${pcBuild.motherboardModel}
                                </p>

                                <div class="card-footer text-center">
                                    <form action="editPcParts" method="post">
                                        <label for="motherboard_model">
                                            Edit part:
                                        </label>

                                        <input type="text"
                                               name="motherboard_model"
                                               id="motherboard_model"><br />

                                        <button type="submit" value="Submit">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col">
                        <div class="card program-box mb-3">
                            <h3 class="card-header text-center bg-warning">
                                PSU
                            </h3>

                            <img src="images/psu-icon.png" class="card-img-top"
                                    alt="PSU">

                            <div class="card-body bg-light text-dark">
                                <p class="card-text text-center">
                                    ${pcBuild.psuModel}
                                </p>

                                <div class="card-footer text-center">
                                    <form action="editPcParts" method="post">
                                        <label for="psu_model">
                                            Edit part:
                                        </label>

                                        <input type="text" name="psu_model"
                                               id="psu_model"><br />

                                        <button type="submit" value="Submit">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col">
                        <div class="card program-box mb-3">
                            <h3 class="card-header text-center bg-warning">
                                Case
                            </h3>

                            <img src="images/pc-case-icon.png"
                                    class="card-img-top" alt="PC Case">

                            <div class="card-body bg-light text-dark">
                                <p class="card-text text-center">
                                    ${pcBuild.caseModel}
                                </p>

                                <div class="card-footer text-center">
                                    <form action="editPcParts" method="post">
                                        <label for="case_model">
                                            Edit part:
                                        </label>

                                        <input type="text" name="case_model"
                                               id="case_model"><br />

                                        <button type="submit" value="Submit">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col">
                        <div class="card program-box mb-3">
                            <h3 class="card-header text-center bg-warning">
                                Data Storage
                            </h3>

                            <img src="images/hdd-icon.png" class="card-img-top"
                                    alt="Data Storage">

                            <div class="card-body bg-light text-dark">
                                <p class="card-text text-center">
                                    ${pcBuild.dataStorageModel}
                                </p>

                                <div class="card-footer text-center">
                                    <form action="editPcParts" method="post">
                                        <label for="data_storage_model">
                                            Edit part:
                                        </label>

                                        <input type="text"
                                               name="data_storage_model"
                                               id="data_storage_model"><br />

                                        <button type="submit" value="Submit">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col">
                        <div class="card program-box mb-3">
                            <h3 class="card-header text-center bg-warning">
                                RAM
                            </h3>

                            <img src="images/ram-icon.png" class="card-img-top"
                                    alt="RAM">

                            <div class="card-body bg-light text-dark">
                                <p class="card-text text-center">
                                    ${pcBuild.ramModel}
                                </p>

                                <div class="card-footer text-center">
                                    <form action="editPcParts" method="post">
                                        <label for="ram_model">
                                            Edit part:
                                        </label>

                                        <input type="text" name="ram_model"
                                               id="ram_model"><br />

                                        <button type="submit" value="Submit">
                                            Submit
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </body>

    <%@include file="bootstrapScripts.jsp"%>
</html>