package controller;

public class Fibonacci {

	public Fibonacci() {
		super();
	}
	
	public static int Fibonacci(int n) { 
	    // Condi��o de parada: 
	    // Se n for igual a 0 ou 1, retorna n
	    if (n == 0 || n == 1) {
	        return n; 
	    }
	
	    // Rela��o de chamada dos passos: 
	    // Calcula o n-�simo termo da s�rie como a soma dos dois anteriores
	    return Fibonacci(n-1) + Fibonacci(n-2); 
	
	}
	
}
