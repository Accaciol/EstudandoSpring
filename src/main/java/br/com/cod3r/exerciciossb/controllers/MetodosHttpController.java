package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

	@GetMapping
	public String get() {
		return "Req Get";
	}
	
	@PostMapping
	public String post() {
		return "Req post";
	}
	
	@PutMapping
	public String put() {
		return "Req put";
	}
	
	@PatchMapping
	public String patch() {
		return "Req Patch";
	}
	

	@DeleteMapping
	public String delete() {
		return "Req delete";
	}
	
}
