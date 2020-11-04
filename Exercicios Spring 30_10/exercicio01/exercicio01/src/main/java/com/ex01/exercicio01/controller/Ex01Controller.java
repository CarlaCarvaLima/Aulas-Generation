package com.ex01.exercicio01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex01")

public class Ex01Controller {

	@GetMapping
	public String ex01() {
		return "Habilidade: Comunicação  Mentalidade: Persistência";
	}

}



