package br.vom.fucturs.aula2.bean;

public class CalculadoraMulta {
	
	public CalculadoraMulta() {
		System.out.println("contruindo calculadora Multa");
	}
	
	public Double calcular(Double salario) {
		return salario + 11.00;
	}
	

}
