package br.vom.fucturs.aula2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadorResumo {
	
	@Autowired
	private CalculadoraFGTS fgts; //injetar
	
	@Autowired
	private CalculadoraINSS inss;
	
	public void exibirResumo(Double salario) {
		
		var rinss = inss.calcular(salario);
		var resultado = fgts.calcular(salario);
		
		System.out.println(resultado);
		
	
	}

}
