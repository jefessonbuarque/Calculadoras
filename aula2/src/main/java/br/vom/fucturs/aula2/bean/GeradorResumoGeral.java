package br.vom.fucturs.aula2.bean;


import org.springframework.stereotype.Component;

@Component
public class GeradorResumoGeral {
	
private Calculadora gts;
	
	public GeradorResumoGeral() {
		
	}
	
	public void exibirResumo(Double  salario) {
		System.out.println(gts.calcular(salario));
	}

}
