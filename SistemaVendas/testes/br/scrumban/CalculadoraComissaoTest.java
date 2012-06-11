package br.scrumban;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraComissaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testComissaoVendasDe100ComissaoEsperadaDe5() {
		Double totalVendas = 100.0;
		
		Double esperado = 5.0;
		
		Double resultadoObtido = new CalculadoraComissao().calculaComissao(totalVendas);
		
		assertEquals( esperado, resultadoObtido);
	}

	@Test
	public void testComissaoVendasDe200ComissaoEsperadaDe10() {
		Double totalVendas = 200.0;
		
		Double esperado = 10.0;
		
		Double resultadoObtido = new CalculadoraComissao().calculaComissao(totalVendas);
		
		assertEquals( esperado, resultadoObtido);
	}


	@Test
	public void testComissaoVendasDeZeroComissaoEsperadaDeZero() {
		Double totalVendas = 0.0;
		
		Double esperado = 0.0;
		
		Double resultadoObtido = new CalculadoraComissao().calculaComissao(totalVendas);
		
		assertEquals( esperado, resultadoObtido);
	}

	@Test
	public void testComissaoVendasDe10MilComissaoEsperadaDe600() {
		Double totalVendas = 10000.0;
		
		Double esperado = 500.0;
		
		
		Double resultadoObtido = new CalculadoraComissao().calculaComissao(totalVendas);
		
		assertEquals( esperado, resultadoObtido);
	}

	@Test
	public void testComissaoVendasDe100MilComissaoEsperadaDe600() {
		Double totalVendas = 100000.0;
		
		Double esperado = 6000.0;
		
		Double resultadoObtido = new CalculadoraComissao().calculaComissao(totalVendas);
		
		assertEquals( esperado, resultadoObtido);
	}

}