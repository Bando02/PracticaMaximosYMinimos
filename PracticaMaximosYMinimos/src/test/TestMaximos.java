package test;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import clases.Maximos;
import clases.Minimo;

import org.junit.jupiter.api.Test;

class TestMaximos {

	@Test
	void test2valor1mayor() {
		
		int esperado = 2;
		int obtenido = Maximos.Maximo2EnterosPositivos(2, 1);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test2valor2mayor() {
		
		int esperado = 2;
		int obtenido = Maximos.Maximo2EnterosPositivos(1, 2);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test3valor1mayor() {
		
		int esperado = 5;
		int obtenido = Maximos.MaximoDe3EnterosPositivos(5, 2, 1);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test3valor2mayor() {
		
		int esperado = 5;
		int obtenido = Maximos.MaximoDe3EnterosPositivos(2, 5, 1);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test3valor3mayor() {
		
		int esperado = 5;
		int obtenido = Maximos.MaximoDe3EnterosPositivos(4, 2, 5);
		
		assertEquals(esperado,obtenido);
		
	}
	
	@Test
	void test2valoresError() {
		Exception exception = assertThrows(IllegalArgumentException.class,
				() -> Maximos.MaximoDe2EnterosPositivos(-1, 2));
		
		String esperado = "Numero negativo";
		String obtenido = exception.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void test3valoresError() {
		Exception exception = assertThrows(IllegalArgumentException.class,
				() -> Maximos.MaximoDe3EnterosPositivos(1, -2, 2));
		
		String esperado = "Numero negativo";
		String obtenido = exception.getMessage();
		assertEquals(esperado,obtenido);
	}
}