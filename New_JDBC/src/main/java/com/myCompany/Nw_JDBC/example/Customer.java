package com.myCompany.Nw_JDBC.example;

import java.io.Serializable;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor




public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3797493904531914542L;
	private String customerUID;
	private  int customer_id;
	private String first_name;
	private String last_name;
	private String email;
	public Customer(String customerUID,String first_name, String last_name, String email) {
		super();
		this.customerUID=this.customerUID;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email=email;
	}
	@Override
	public String toString() {
		return "Customer [customerUID=" + customerUID + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + "]";
	}
	
	
	
	
}
