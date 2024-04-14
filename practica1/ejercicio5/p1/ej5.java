package ejercicio5.p1;

public class ej5{
	
	public static void main(String[] args ) {
		
		int [] vec = {3,50,10,30,10};
		
		//devuelva los datos utilizando el retun.
		datos d = metodos.metodoA(vec);
		System.out.println(d.toString());	
		
	    //devuelva los datos utilizando parametros.
		
		datos c = new datos();
		metodos.metodoB(vec, c);
	    System.out.println(c.toString());
	    
	    //No usar parametros ni el return. 
	    //No se si esta bien, no encontre otra forma. 
	    
	    metodos.metodoC(vec);
	    
	}
}
