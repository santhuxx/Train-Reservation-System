package com.station;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateStationServlet")
public class UpdateStationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("cusid");
		String stno = request.getParameter("stno");
		String stname = request.getParameter("stname");
		String district = request.getParameter("district");
		String phone = request.getParameter("phone");

		
		boolean isTrue;
		
		isTrue = StationDBUtil.updatestation(id, stno,stname, district, phone);
		
		if(isTrue == true) {
			
			List<Station> cusDetails = StationDBUtil.getStationDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("stationaccount.jsp");
			dis.forward(request, response);
		}
		else {

			List<Station> cusDetails = StationDBUtil.getStationDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("stationaccount.jsp");
			dis.forward(request, response);
		}
	}


}
