package paraRecordar;

import java.util.LinkedList;
import java.util.List;

public class javaRecordatorio{
	
	// RESUMEN DE SINTAXIS DE JAVA

	
	// CLASES.
	    
	    public class nombreDeLaClase{
	    	// DETRO LOS PROCEDIMIENTOS:
	    	
			    	public void metodoPublicoNoDevuelveNada(int parametroInt) {
			    		// CODIGO.
			    	}
			    	
			    	private int metodoPrivadoDevuelveUnInt() { //NO RECIBE NADA
			    		return 20; 
			    	}
	    	
	    	
	    	
	    	
	    	// LA CLASE MAIN:
			    	public static void main(String[] args) {
			    		//CODIGO DEL PROGRAMA PRINCIPAL
			    	}
	    }
	
	
	// VARIABLES.

			// TIPOS PRIMITIVOS : Siempre se declara primero el tipo luego el nombre, y despues si le damos un valor inicial.
		
			
			boolean varB = true;
			
			char varC;
			
			int varI;
			
			double varD = 1.5;
			
			String varS = "cadena";
			
			// Podemos incrementar o decrementar de esta forma :  nombre_var++ , nombre_var--
			
			
			
			// OPERADORES
			
			// OP. ARITMETICOS: 
			
			double suma = varD + varD;
			
			double resta = varD - varD;
			
			double multiplicacion = varD * varD;
			
			double division = varD / varD;
			
			double resto = varD % varD;
			
			
			// OP. LOGICOS : 
			
			boolean igual = varD == varD;
			
			boolean distintos = varD != varD;
			
			boolean mayor = varD > varD;
			
			boolean menor = varD < varD;
			
		    and = varD && varD;
			
			or = varD || varD;
			
		    not = ! varD;
    
    
    
    
    
    
    
    
    
    
    // ESTRUCTURAS DE CONTROL. 
    
    
    
			    // DE SELECCION.
			 
			    if (var1 > var2) {
			    	// Codigo.
			    }
			    else {
			    	// Codigo.
			    }
				
				
			    // DE ITERACION PRE-CONDICIONAL.
			    
			    while (var1 > var2) {
			    	//Codigo.
			    }
				
			    // DE ITERACION POST-CONDICIONAL.
			    
			    do{
			    	//Codigo
			    } while(var1>var2);
			    
			    
			    // REPETICION.
			    
			    for( int i = 0; i<numero ; i++) {
			    	//Codigo.
			    }
	
	
			    
			    
			    
			    
	// ESTRUCTURAS DE DATOS.
			    
			   
			    // ARREGLOS: 
			    
			    int [] nombre = new int[10];  // para instanciar el arreglo debemos hacer un new y pasarle su tamaño.
			    
			    for (int indice = 0; i<10 ; i++) {          // i<nombre.length , si no sabemos el tamaño.
			    	System.out.println(nombre[indice]);
			    }
			    
			    
    
               // MATRICES: 
			    
			   // FILAS X COLUMNAS
			    
			   int [][] matriz = new int [10][10];
			   
			   for (int fila = 0; fila<10;fila++) {
				   for (int columna = 0; columna<10; columna++) {
					   System.out.println( matriz[fila][columna]);
				   }
			   }
    
    
    
              // HAY VARIAS FORMAS DE REPRESENTAR UNA LISTA.     
			   
			   
			   
			  
			  // LA COMUN Y TRADICIONAL ES LA LINKEDLIST O LISTA ENLAZADA:
			   
			  // DEBEMOS IMPORTAR LA LIBRERIA NECESARIA : import java.util.LinkedList; y import java.util.List;
			   
			  List<String> lista = new LinkedList<String>(); // Lo que hacemos es primero declarar la forma generica de la lista y luego crear el tipo de lista q queremos.
			  
			  
			  // OPERACIONES : 
					  lista.add("A");
					  lista.add("B");
					  
					  
					  lista.add(1, "C"); // Inserta "C" en la posición 1 (desplazando "B" hacia la derecha)
					  
					  String elemento = lista.get(0); // Devuelve "A"
		
					  lista.remove(1); // Elimina el elemento en la posición 1 ("C")
					  
					  int tamaño = lista.size(); // Devuelve el tamaño de la lista
					  
					  boolean vacía = lista.isEmpty(); // Devuelve false si la lista no está vacía
					  
					  // podemos agregar a una lista otra lista entera del mismo tipo : list.addAll(nombre_de_esa_lista);
					  
					  lista.clear(); // Elimina todos los elementos de la lista
					  
					  boolean contiene = lista.contains("A"); // Devuelve true si "A" está en la lista
			  
			  

    
    
 
    
    
	
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
}



