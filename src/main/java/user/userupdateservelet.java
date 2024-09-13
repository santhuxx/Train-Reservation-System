package user;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/userupdateservelet")
public class userupdateservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	
	
		String id = request.getParameter("cusid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = usermethod.updateuser(id, name, email, phone, username, password);
		
		if(isTrue == true) {
			
			
			List<user> userDetails = usermethod.getuserDetails(id);
			request.setAttribute("userDetails", userDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your account successfully updated');");
			out.println("location='home.jsp'");
			out.println("</script>");
			
			
			
				
		}
		else {
			List<user> userDetails = usermethod.getuserDetails(id);
			request.setAttribute("userDetails", userDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your account update unsuccessfully!');");
			out.println("location='viewuseracc.jsp'");
			out.println("</script>");
			
		}
	}

}