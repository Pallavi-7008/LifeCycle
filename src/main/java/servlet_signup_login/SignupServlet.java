package servlet_signup_login;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/signup")

public class SignupServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			

		Student student =new Student();
		student.setEmail(req.getParameter("email"));
		student.setGender(req.getParameter("gender"));
		student.setMobile(Long.parseLong (req.getParameter("mobile")));
		student.setName(req.getParameter("name"));
		student.setPassword(req.getParameter("password"));
		
		Studentdao dao=new Studentdao();
		dao.save(student);
		resp.getWriter().print("<h1>data saved successfully</h1>");
		req.getRequestDispatcher("login.html").include(req, resp);
		
		
		
		
	}
		
		
		
		
	}
	
	

	
