package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		
		if (salarioBase < 1039) {
			return 0l;
		}
		
		salarioBase = calcularInss(salarioBase);
		salarioBase = calcularIrrf(salarioBase);
		return Math.round(salarioBase);
	}
	
	private double calcularInss(double salarioBase) {
		if (salarioBase <= 1500) {
			salarioBase = salarioBase - (salarioBase * 0.08);
		} else if (salarioBase > 1500 && salarioBase <= 4000) {
			salarioBase = salarioBase - (salarioBase * 0.09);
		} else if (salarioBase > 4000) {
			salarioBase = salarioBase - (salarioBase * 0.11);
		}
		return salarioBase;
	}
	
	private double calcularIrrf(double salarioBase) {
		if (salarioBase < 3000) {
			salarioBase = salarioBase - 0.00;
		} else if (salarioBase > 3000 && salarioBase <= 6000) {
			salarioBase = salarioBase - (salarioBase * 0.075);
		} else if (salarioBase > 6000) {
			salarioBase = salarioBase - (salarioBase * 0.15);
		}
		return salarioBase;
	}

}