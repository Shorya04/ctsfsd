package com.example.demo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException{

	private String message;
}
