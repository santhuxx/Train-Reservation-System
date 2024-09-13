package train;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/trainupdateservelet")
public class trainupdateservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		String tid = request.getParameter("tid");
		String tname = request.getParameter("tname");
		String ttype = request.getParameter("ttype");
		String tcount = request.getParameter("tcount");
		String tdetails = request.getParameter("tdetails");
		
		boolean isTrue;
		
		isTrue = trainmethod.updatetrain(tid, tname, ttype, tcount, tdetails);
		
		if(isTrue == true) {
			
			List<train> trainDetails = trainmethod.gettrainDetails(tid);
			request.setAttribute("trainDetails", trainDetails);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Train account updated successfully!');");
			out.println("location='viewtrainacc.jsp'");
			out.println("</script>");
			
		}
		else {
			List<train> trainDetails = trainmethod.gettrainDetails(tid);
			request.setAttribute("trainDetails", trainDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("trainupdate.jsp");
			dis.forward(request, response);
		}
	}

}