package ejercicio5.p1;

public class metodos{
	
	public static datos metodoA(int[] vec) {
		int min = 99999;
		int max = -1;
		int suma = 0; 
		
		for (int i =0 ; i<vec.length ; i++ ) {
			if (vec[i]> max ) {
				max = vec[i];
			}
			if (vec[i] < min) {
				min = vec[i];
			}
			suma += vec[i];
		}
		
		double prom = suma / (vec.length);
		datos d = new datos();
		
		d.setMax(max);
		d.setMin(min);
		d.setProm(prom);
		
		return d;
	}
	
	
	public static void metodoB(int[] vec , datos d) {
		int min = 99999;
		int max = -1;
		int suma = 0; 
		
		for (int i =0 ; i<vec.length ; i++ ) {
			if (vec[i]> max ) {
				max = vec[i];
			}
			if (vec[i] < min) {
				min = vec[i];
			}
			suma += vec[i];
		}
		
		double prom = suma / (vec.length);
		
		d.setMax(max);
		d.setMin(min);
		d.setProm(prom);
		
	}
	
	public static void metodoC(int[] vec) {
		int min = 99999;
		int max = -1;
		int suma = 0; 
		
		for (int i =0 ; i<vec.length ; i++ ) {
			if (vec[i]> max ) {
				max = vec[i];
			}
			if (vec[i] < min) {
				min = vec[i];
			}
			suma += vec[i];
		}
		
		double prom = suma / (vec.length);
		datos d = new datos();
		
		d.setMax(max);
		d.setMin(min);
		d.setProm(prom);
		
		System.out.println(d.toString());
	}
	
}