package org.enterprise.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.enterprise.entity.PcBuild;
import org.enterprise.entity.User;
import org.enterprise.persistence.GenericDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
    urlPatterns = {"/editPcParts"}
)

public class EditPcParts extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao<PcBuild> pcBuildDao = new GenericDao<>(PcBuild.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        try {
            HttpSession session = req.getSession();
            PcBuild pcBuildToBeEdited = (PcBuild) session.getAttribute(
                "pcBuild"
            );
            GenericDao<User> userDao = new GenericDao<>(User.class);

            if(req.getParameter("cpu_model") != null) {
                pcBuildToBeEdited.setCpuModel(req.getParameter("cpu_model"));
                pcBuildDao.saveOrUpdate(pcBuildToBeEdited);
            } else if(req.getParameter("gpu_model") != null) {
                pcBuildToBeEdited.setGpuModel(req.getParameter("gpu_model"));
                pcBuildDao.saveOrUpdate(pcBuildToBeEdited);
            } else if(req.getParameter("cpu_cooler_model") != null) {
                pcBuildToBeEdited.setCpuCoolerModel(req.getParameter(
                    "cpu_cooler_model"
                ));
                pcBuildDao.saveOrUpdate(pcBuildToBeEdited);
            } else if(req.getParameter("motherboard_model") != null) {
                pcBuildToBeEdited.setMotherboardModel(req.getParameter(
                    "motherboard_model"
                ));
                pcBuildDao.saveOrUpdate(pcBuildToBeEdited);
            } else if(req.getParameter("psu_model") != null) {
                pcBuildToBeEdited.setPsuModel(req.getParameter("psu_model"));
                pcBuildDao.saveOrUpdate(pcBuildToBeEdited);
            } else if(req.getParameter("case_model") != null) {
                pcBuildToBeEdited.setCaseModel(req.getParameter(
                    "case_model"
                ));
                pcBuildDao.saveOrUpdate(pcBuildToBeEdited);
            } else if(req.getParameter("data_storage_model") != null) {
                pcBuildToBeEdited.setDataStorageModel(req.getParameter(
                    "data_storage_model"
                ));
                pcBuildDao.saveOrUpdate(pcBuildToBeEdited);
            } else if(req.getParameter("ram_model") != null) {
                pcBuildToBeEdited.setRamModel(req.getParameter("ram_model"));
                pcBuildDao.saveOrUpdate(pcBuildToBeEdited);
            }

            session.setAttribute("pcBuild", pcBuildToBeEdited);
        } catch (Exception e) {
            logger.error(e);
        }

        resp.sendRedirect("/HardwareViewer_war/parts_list.jsp");
    }
}
