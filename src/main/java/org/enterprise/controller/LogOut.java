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
        urlPatterns = {"/logOut"}
)

public class LogOut extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao<PcBuild> pcBuildDao = new GenericDao<>(PcBuild.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("userName", null);

        resp.sendRedirect("/HardwareViewer_war/index.jsp");
    }
}