package com.ex02.exercicio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex02")

public class ex02Controller {

	@GetMapping
	public String ex02() {
		return "Preciso estudar mais banco de dados no MySQL";
	}

}