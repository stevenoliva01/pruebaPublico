package com.oliva.operaciones;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class PruebaController {
	@RequestMapping(value="/hola")
	public String suma() {
		System.out.println("Agregando una Línea");
		return "Hola Mundo";
	}
}
