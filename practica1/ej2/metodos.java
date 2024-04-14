package practica1.ej2;

public class metodos{
	
	public static int[] arreglo(int n) {
		int [] vector = new int[n];
		
		for (int i = 0; i<vector.length; i++) {
			vector[i] = n*(i+1);
		}
		return vector; 
	}
	
	public static void imprimirlo(int[] vector ) {
		for (int i = 0; i< vector.length; i++) {
			System.out.println(vector [i] + " - ");
		}
	}
}