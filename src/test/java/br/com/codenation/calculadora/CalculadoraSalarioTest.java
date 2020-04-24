package br.com.codenation.calculadora;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraSalarioTest {

	@Test
	public void salarioLiquidoIsNotNull() {
		assertNotNull(new CalculadoraSalario().calcularSalarioLiquido(1000.0));
	}
	
	@Test
	public void salarioBruto1500Liquido1380() {
		long salarioLiquido = new CalculadoraSalario().calcularSalarioLiquido(1500.0);
		assertEquals(1380,salarioLiquido,0.0);
	}

}