package college_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import College_dao.CollegeDao;
import StudentDto.Student;
import college_dto.MarksDetails;
@WebServlet("/insert_marks")
public class Insert_marks extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int phy7=Integer.parseInt(req.getParameter("phy7"));
		int phy7_practical=Integer.parseInt(req.getParameter("phy7_prac"));
		int phy8=Integer.parseInt(req.getParameter("phy8"));
		int phy8_parctical=Integer.parseInt(req.getParameter("phy8_prac"));
		int maths7=Integer.parseInt(req.getParameter("maths7"));
		int maths7_practical=Integer.parseInt(req.getParameter("maths_prac7"));
		int maths8=Integer.parseInt(req.getParameter("maths8"));
		int maths8_practical=Integer.parseInt(req.getParameter("maths_prac8"));
		int comp_sc7=Integer.parseInt(req.getParameter("comp_sc7"));
		int comp_sc7_practical=Integer.parseInt(req.getParameter("comp_sc7_prac"));
		int comp_sc8=Integer.parseInt(req.getParameter("comp_sc8"));
		int comp_sc8_practical=Integer.parseInt(req.getParameter("comp_sc8_prac"));
		int banking_finance=Integer.parseInt(req.getParameter("banking_finance"));
		String regno=req.getParameter("regno");
		
		MarksDetails marks=new MarksDetails();
		marks.setPhy7(phy7);
		marks.setPhy7_practical(phy7_practical);
		marks.setPhy8(phy8);
		marks.setPhy8_practical(phy8_parctical);
		marks.setMaths7(maths7);
		marks.setMaths7_practical(maths7_practical);
		marks.setMaths8(maths8);
		marks.setMaths8_practical(maths8_practical);
		marks.setComp_sc7(comp_sc7);
		marks.setComp_sc7_practical(comp_sc7_practical);
		marks.setComp_sc8(comp_sc8);
		marks.setComp_sc8_practical(comp_sc8_practical);
		marks.setBanking_finance(banking_finance);
		marks.setRegno(regno);
		CollegeDao dao=new CollegeDao();
		dao.insert(marks);
		
	}
}
