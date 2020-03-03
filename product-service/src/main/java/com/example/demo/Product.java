package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table
@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;

}
