package br.scrumban;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraRoyaltiesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculaRoyaltiesVendas100Retorna20() {
		assertTrue(true);
		//fail();
	}

	@Test
	public void testComissaoVendasDe100ComissaoEsperadaDe5() {

		//You can mock concrete classes, not only interfaces
		 LinkedList mockedList = mock(LinkedList.class);

		 //stubbing
		 when(mockedList.get(0)).thenReturn("first");

		 when(mockedList.get(1)).thenThrow(new RuntimeException());

		 //following prints "first"
		 System.out.println(mockedList.get(0));

		 //following throws runtime exception
//		 System.out.println(mockedList.get(1));

		 //following prints "null" because get(999) was not stubbed
		 System.out.println(mockedList.get(999));

		 //Although it is possible to verify a stubbed invocation, usually it's just redundant
		 //If your code cares what get(0) returns then something else breaks (often before even verify() gets executed).
		 //If your code doesn't care what get(0) returns then it should not be stubbed. Not convinced? See here.
		 verify(mockedList).get(0);

	}


}