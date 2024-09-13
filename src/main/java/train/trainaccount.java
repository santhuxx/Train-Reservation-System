package train;


import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/trainaccount")
public class trainaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String tname = request.getParameter("trainname");
		
		
			List<train> trainDetails = trainmethod.gettrain(tname);
			request.setAttribute("trainDetails", trainDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("trainaccount.jsp");
			dis.forward(request, response);
		
		
	}

}
