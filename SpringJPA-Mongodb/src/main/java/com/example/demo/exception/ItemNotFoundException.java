package com.example.demo.exception;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@SuppressWarnings("serial")
public class ItemNotFoundException extends Throwable {
	private String message;

}
