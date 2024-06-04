package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import clases.Minimo;

import org.junit.jupiter.api.Test;

import clases.Maximos;

class TestMinimos {

	@Test
	void test2valor1menor() {
		
		int esperado = 2;
		int obtenido = Maximos.Maximo2EnterosPositivos(2, 3);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test2valor2menor() {
		
		int esperado = 2;
		int obtenido = Maximos.Maximo2EnterosPositivos(5, 2);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test3valor1menor() {
		
		int esperado = 2;
		int obtenido = Maximos.MaximoDe3EnterosPositivos(2, 5, 4);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test3valor2menor() {
		
		int esperado = 1;
		int obtenido = Maximos.MaximoDe3EnterosPositivos(2, 1, 9);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test3valor3menor() {
		
		int esperado = 3;
		int obtenido = Maximos.MaximoDe3EnterosPositivos(5, 8, 3);
		
		assertEquals(esperado,obtenido);
		
	}
	
		@Test
		void test2valoresError() {
			Exception exception = assertThrows(IllegalArgumentException.class,
					() -> Minimo.MinimoDe2EnterosPositivos(-1, 2));
			
			String esperado = "Numero negativo";
			String obtenido = exception.getMessage();
			assertEquals(esperado,obtenido);
		}
		
		@Test
		void test3valoresError() {
			Exception exception = assertThrows(IllegalArgumentException.class,
					() -> Minimo.MinimoDe3EnterosPositivos(1, 2, -5));
			
			String esperado = "Numero negativo";
			String obtenido = exception.getMessage();
			assertEquals(esperado,obtenido);
		}
}
