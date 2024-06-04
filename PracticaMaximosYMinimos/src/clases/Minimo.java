package clases;

public class Minimo {
	
	
	/**
	 * Metodo que devuelve el numero menor de 2 numeros pasados por parametros 
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int MinimoDe2EnterosPositivos(int a, int b) {
		if(a<0 || b<0) {
			throw new IllegalArgumentException("Numero negativo");
		}
		
		int resultado;
		if(a<b) {
			resultado = a;
		}
		else {
			resultado = b;
		}
		return resultado;
	}
	
	
	/**
	 * Metodo que devuelve el numero menos de 3 numeros pasados por parametros 
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int MinimoDe3EnterosPositivos(int a, int b, int c) {
		if(a<0 || b<0 || c<0) {
			throw new IllegalArgumentException("Numero negativo");
		}
		int resultado;
		
		if(a<b || a<c) {
			resultado = a;
		}
		else if(b<a || b<c) {
			resultado = b;
		}
		else {
			resultado = c;
		}
		
		return resultado;
	
		
	}

}
