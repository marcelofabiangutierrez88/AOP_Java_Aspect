package com.marcelo.interceptors;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SaludoServiceLoggingAspect {

	private Log log = LogFactory.getLog(this.getClass());

	@Before("execution(String SaludoService.decirHola(..))")
	public void logAntes(JoinPoint joinPoint) {
		String nombreMetodo = joinPoint.getSignature().getName();
		String argumentos = Arrays.toString(joinPoint.getArgs());
		log.info("Antes: " + nombreMetodo + " con los parametros " + argumentos);
	}
	@After("execution(String SaludoService.decirHola(..))")
	public void logDespues(JoinPoint joinPoint) {
		String nombreMetodo = joinPoint.getSignature().getName();
		String argumentos = Arrays.toString(joinPoint.getArgs());
		log.info("Despues: " + nombreMetodo + " con los parametros " + argumentos);
	}

}
