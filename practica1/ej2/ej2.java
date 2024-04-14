package practica1.ej2;

import java.util.Scanner;

public class ej2{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		
		System.out.println("ingres el valor de n : ");
		int n = s.nextInt();
		
		int [] vector = metodos.arreglo(n);
		
		System.out.println(" los primeros " + n + " multiplos de "+ n + " son : ");
		metodos.imprimirlo(vector);
		
		s.close();
		
		
	}
}