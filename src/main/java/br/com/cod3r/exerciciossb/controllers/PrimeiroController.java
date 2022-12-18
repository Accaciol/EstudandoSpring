package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	
	@GetMapping(path = "/")
	public String index() {
		return "Spring funcionando";
	}
	
	@GetMapping(path = "/ola")
	public String ola() {
		return "Spring get";
	}
	
	
	
	@GetMapping(path = "/saudacao")
	public String saudacao() {
		return "Spring post";
	}
}
