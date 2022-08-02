package br.vom.fucturs.aula2.confing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.vom.fucturs.aula2.bean.CalculadoraFGTS;

@Configuration
@ComponentScan(basePackages = "br.vom.fucturs.aula2")
public class ServiceConfing {
	
	//@Bean
	public CalculadoraFGTS getCalculadoraFGTS() {
		return new CalculadoraFGTS();
	}
	
	

}
