package com.example.demo.model;

import com.example.demo.enumeration.Brand;
import com.example.demo.enumeration.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
	 
	private String brand;
	private String category;
	private Product product;

}
