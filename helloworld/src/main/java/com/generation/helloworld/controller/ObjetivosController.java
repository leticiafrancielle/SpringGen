package com.generation.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String bsmsGen() {
		return "OBJETIVOS DE APRENDIZAGEM: Melhorar habilidade de Comunicação, Proatividade e Responsabilidade Pessoal";

	}
}
