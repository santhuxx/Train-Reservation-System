package com.station;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteStationServlet")
public class DeleteStationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("cusid");
		boolean isTrue;
		
		isTrue = StationDBUtil.deleteStation(id);
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("stationinsert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Station> cusDetails = StationDBUtil.getStationDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("stationaccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}
