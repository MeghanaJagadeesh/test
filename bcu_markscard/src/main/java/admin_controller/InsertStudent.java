package admin_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import StudentDto.Student;
import admin_dao.AdminDao;
@WebServlet("/insert")
public class InsertStudent extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String regno=req.getParameter("reg");
		String name=req.getParameter("name");
		String fname=req.getParameter("fname");
		String college_name=req.getParameter("college_name");
		String exam_Month=req.getParameter("exam_Month");
		String Sem=req.getParameter("Sem");
		
		Student student=new Student();
		
		student.setRegNo(regno);
		student.setName(name);
		student.setFname(fname);
		student.setCollegeName(college_name);
		student.setExamination(exam_Month);
		student.setSem(Sem);
		
		AdminDao dao=new AdminDao();
		dao.insert(student);
	}

}
