package practica1.ej1;

public class metodos {
	
	public static void metodoA(int a, int  b) {
		for (int i = a; i <=b ; i++) {
			System.out.println(i);
		}
	}
	
	public static void metodoB(int a, int b) {
		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}
	
	public static void metodoC(int a, int b) {
		if (a<=b) {
			System.out.println(a);
			a++;
			metodoC(a,b);
		}
	}
	
	
	
}