package br.vom.fucturs.aula2.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("INSS")
public class CalculadoraINSS implements Calculadora{
	
	//construtor
	public CalculadoraINSS() {
		System.out.println("contruindo calculadora INSS");
	}
	
	public Double calcular(Double salario) {
		return salario + 11.00;
	}

}
