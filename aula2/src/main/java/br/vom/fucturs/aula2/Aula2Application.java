package br.vom.fucturs.aula2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.vom.fucturs.aula2.bean.CalculadorResumo;
import br.vom.fucturs.aula2.bean.CalculadoraFGTS;
import br.vom.fucturs.aula2.confing.ServiceConfing;

@SpringBootApplication
public class Aula2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Aula2Application.class, args);
		
		var contexto = new AnnotationConfigApplicationContext(ServiceConfing.class);
		
		var fgts = contexto.getBean(CalculadoraFGTS.class);
		
		System.out.println(fgts.calcular(1.90));
		
		var resumo = contexto.getBean(CalculadorResumo.class);
		
		resumo.exibirResumo(1.90);
		
		
	}

}
