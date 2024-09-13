package user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/userdeleteservelet")
public class userdeleteservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		String id = request.getParameter("cusid");
		boolean isdone;
		
		isdone = usermethod.deleteuser(id);
		
		if (isdone == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your account successfully deleted');");
			out.println("location='userSignUp.jsp'");
			out.println("</script>");
			
		}
		else {
			
			List<user> userDetails = usermethod.getuserDetails(id);
			request.setAttribute("userDetails", userDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your account delete unsuccessfully');");
			out.println("location='useraccount.jsp'");
			out.println("</script>");
			
		}
		
		
		
	}

}