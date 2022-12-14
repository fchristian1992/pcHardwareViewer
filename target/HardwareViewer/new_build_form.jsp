<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" value="New Build" />
<html lang="en">
<%@include file="head.jsp"%>

<body>
<div class="container">
    <%@include file="header.jsp"%>

    <main>
        <div class="w-50 text-center">
            <form action="createNewBuild" method="post">
                <div class="mb-3">
                    <label for="cpu_model" class="form-label">CPU:</label>

                    <input type="text" class="form-control" id="cpu_model"
                           name="cpu_model">
                </div>

                <div class="mb-3">
                    <label for="gpu_model" class="form-label">GPU: </label>

                    <input type="text" class="form-control" id="gpu_model"
                           name="gpu_model">
                </div>

                <div class="mb-3">
                    <label for="cpu_cooler_model" class="form-label">
                        CPU cooler:
                    </label>

                    <input type="text" class="form-control"
                           id="cpu_cooler_model" name="cpu_cooler_model">
                </div>

                <div class="mb-3">
                    <label for="motherboard_model" class="form-label">
                        Motherboard:
                    </label>

                    <input type="text" class="form-control"
                           id="motherboard_model" name="motherboard_model">
                </div>

                <div class="mb-3">
                    <label for="psu_model" class="form-label">PSU:</label>

                    <input type="text" class="form-control" id="psu_model"
                           name="psu_model">
                </div>

                <div class="mb-3">
                    <label for="case_model" class="form-label">Case:</label>

                    <input type="text" class="form-control" id="case_model"
                           name="case_model">
                </div>

                <div class="mb-3">
                    <label for="data_storage_model" class="form-label">
                        Data storage:
                    </label>

                    <input type="text" class="form-control"
                           id="data_storage_model" name="data_storage_model">
                </div>

                <div class="mb-3">
                    <label for="ram_model" class="form-label">RAM:</label>

                    <input type="text" class="form-control" id="ram_model"
                           name="ram_model">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </main>
</div>
</body>

<%@include file="bootstrapScripts.jsp"%>
</html>