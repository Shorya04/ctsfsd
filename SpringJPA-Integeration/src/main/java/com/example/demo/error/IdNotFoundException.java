package com.example.demo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuppressWarnings("serial")
public class IdNotFoundException extends Throwable {
	
	private String message;
	
	

}
