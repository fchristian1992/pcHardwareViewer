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
        urlPatterns = {"/createNewBuild"}
)

public class CreateNewBuild extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("in doPost");
        GenericDao<User> userDao = new GenericDao<>(User.class);
        GenericDao<PcBuild> pcBuildDao = new GenericDao<>(PcBuild.class);
        HttpSession session = null;
        PcBuild pcBuild = null;

        try {
            session = req.getSession();
            String username = (String) session.getAttribute("userName");
            User user = userDao.getBySpecificProperty(
                    "username",
                    username
            ).get(0);
            pcBuild = new PcBuild(
                req.getParameter("cpu_model"),
                req.getParameter("gpu_model"),
                req.getParameter("cpu_cooler_model"),
                req.getParameter("motherboard_model"),
                req.getParameter("psu_model"),
                req.getParameter("case_model"),
                req.getParameter("data_storage_model"),
                req.getParameter("ram_model"),
                user
            );

            pcBuildDao.insert(pcBuild);
            session.setAttribute("pcBuild", pcBuild);
        } catch (Exception e) {
            logger.error(e);
        }

        resp.sendRedirect("/HardwareViewer_war/parts_list.jsp");
    }
}