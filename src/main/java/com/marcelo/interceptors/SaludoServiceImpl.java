package com.marcelo.interceptors;

import org.springframework.stereotype.Service;

@Service("saludoService")
public class SaludoServiceImpl implements SaludoService {

	@Override
	public String decirHola(String nombre, String palabraSaludo) {
		String saludo = palabraSaludo + " " + nombre;
		System.out.println(saludo);
		return saludo;
	}

}
