package admin_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin_dao.AdminDao;

@WebServlet("/fetch")
public class fetch extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String regno = req.getParameter("regno");
		AdminDao dao = new AdminDao();
		Object obj = dao.fetch(regno);
	}

}
