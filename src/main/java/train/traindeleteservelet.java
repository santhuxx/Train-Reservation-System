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




@WebServlet("/traindeleteservelet")
public class traindeleteservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		String tid = request.getParameter("tid");
		boolean isdone;
		
		isdone = trainmethod.deletetrain(tid);
		
		if (isdone == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Train account successfully deleted');");
			out.println("location='traininsert.jsp'");
			out.println("</script>");
			
		}
		else {
			
			List<train> trainDetails = trainmethod.gettrainDetails(tid);
			request.setAttribute("trainDetails", trainDetails);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("traindelete.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}