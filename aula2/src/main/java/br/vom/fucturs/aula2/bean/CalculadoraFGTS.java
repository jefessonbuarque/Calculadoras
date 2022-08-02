package br.vom.fucturs.aula2.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//segunda de declarar o bean utilizar @Component
@Component

//@Primary
@Qualifier("FGTS")
public class CalculadoraFGTS implements Calculadora{

	// construtor
	public CalculadoraFGTS() {
		System.out.println("Contruindo CalaculadoraFGTS");

	}
	
	public Double calcular(Double salario) {
		return salario + 10.00;

	}

}
