package user;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/userinsert")
public class userinput extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		boolean isdone;
		
		isdone = usermethod.insertuser(name, email, phone, username, password);
		
		if(isdone == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your account successfully created');");
			out.println("location='Login.jsp'");
			out.println("</script>");
			
		} else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your account created unsuccessfully');");
			out.println("location='Login.jsp'");
			out.println("</script>");
		}
		
		
	}

}