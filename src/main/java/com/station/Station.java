package com.station;

public class Station {
	private int id;
	private String stno;
	private String stname;
	private String district;
	private String phone;


	
	
	public Station(int id, String stno, String stname, String district, String phone) {
		super();
		this.id = id;
		this.stno = stno;
		this.stname = stname;
		this.district = district;
		this.phone = phone;


	}


	public int getId() {
		return id;
	}


	public String getStno() {
		return stno;
	}


	public String getStname() {
		return stname;
	}


	public String getDistrict() {
		return district;
	}


	public String getPhone() {
		return phone;
	}



	
	
}
