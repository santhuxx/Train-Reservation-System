package train;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/traininsert")
public class traininput extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		String tname = request.getParameter("tname");
		String ttype = request.getParameter("ttype");
		String tcount = request.getParameter("tcount");
		String tdetails = request.getParameter("tdetails");
		
		boolean isdone;
		
		isdone = trainmethod.inserttrain(tname, ttype, tcount, tdetails);
		
		if(isdone == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Train account added successfully!');");
			out.println("location='adminpage.jsp'");
			out.println("</script>");
			
		} else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your account created unsuccessfully');");
			out.println("location='traininsert.jsp'");
			out.println("</script>");
		}
		
		
	}

}