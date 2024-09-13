package com.station;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StationInsert")
public class StationInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String stno = request.getParameter("stno");
		String stname = request.getParameter("stname");
		String district = request.getParameter("district");
		String phone = request.getParameter("phone");

		
		boolean isTrue;
		
		isTrue = StationDBUtil.insertstation(stno,stname, district, phone);
		
		if(isTrue == true) {
			
			String stName = request.getParameter("stname");
			
			
			isTrue = StationDBUtil.validate(stName);
			
			if (isTrue == true) {
				List<Station> cusDetails = StationDBUtil.getStation(stName);
				request.setAttribute("cusDetails", cusDetails);
				
				RequestDispatcher dis = request.getRequestDispatcher("stationaccount.jsp");
				dis.forward(request, response);
				
			} else {
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
