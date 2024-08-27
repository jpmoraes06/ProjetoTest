package com.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.test.calculos.Calculadora;


class CalculadoraTest {

	@Test
	@DisplayName(" Teste 5 + 5 = 10")
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double sum = calc.sum(valor1, valor2);
		double resultado = calc.sum(valor1, valor2);
		//Assert
		assertEquals(esperado,  "5 + 5 nao gerou o valor 10");
		
	}
	@Test
	@DisplayName(" Teste  5 / 5 = 1")
	void testDiv() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 1D;
		
		//Act
		double div = calc.div(valor1, valor2);
		double resultado = calc.div(valor1, valor2);
		//Assert
		assertEquals(esperado,resultado,  "5 + 5 nao gerou o valor 10");
		
	}
	@Test
	@DisplayName(" Teste  5 * 5 = 25")
	void testMulti() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 25D;
		
		//Act
		double multi = calc.multi(valor1, valor2);
		double resultado = calc.multi(valor1, valor2);
		//Assert
		assertEquals(esperado,resultado, "5 * 5 nao gerou o valor 25");
		
	}
	@Test
	@DisplayName(" Teste  5 - 5 = 0")
	void testSub() {
		//Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 0D;
		
		//Act
	
		double sub = calc.sub(valor1, valor2);
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado,resultado,  "5 - 5 nao gerou o valor 0");
		
	}
	
}
