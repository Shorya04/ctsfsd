package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Data;
@Data
@Document
public class Item {

	@Id
	private String id;
	private String itemName;
	private double price;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy" )
	private LocalDate billDate;
	private String isbn;
	//private Product product;
}
