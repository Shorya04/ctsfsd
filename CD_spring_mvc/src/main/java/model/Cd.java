package model;

import java.io.Serializable;

public class Cd implements Serializable {
	
	private static final long serialVersionUID = -3414777255780882658L;
	
	private String cdName;
	private String cdType;
	private String year;
	
	public Cd() {
		super();
	}

	public Cd(String cdName, String cdType, String year) {
		super();
		this.cdName = cdName;
		this.cdType = cdType;
		this.year = year;
	}

	public String getCdName() {
		return cdName;
	}

	public void setCdName(String cdName) {
		this.cdName = cdName;
	}

	public String getCdType() {
		return cdType;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
	

}
