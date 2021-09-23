package com.oliva.operaciones;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class OperacionesController {
	
	@RequestMapping(value="/suma/{n1}/{n2}")
	public String suma(@PathVariable("n1") int n1,@PathVariable("n2") int n2) {
		int suma = n1 + n2;
		return "La suma es: "+suma;
	}
}
