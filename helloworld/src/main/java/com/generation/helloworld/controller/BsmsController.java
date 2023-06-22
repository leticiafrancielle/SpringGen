package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class BsmsController {

	@GetMapping
	public String bsmsGen() {
		return "BSMS: Orientação ao futuro, Responsabilidade Pessoal, Mentalidade de Crescimento, Persistência, Trabalho em Equipe, Orientação ao detalhe, Proatividade, Comunicação.";
	}
}
