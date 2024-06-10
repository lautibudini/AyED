package ejercicio2p3;

import ejercicio1p3.GeneralTree;
import java.util.*; 
import ejercicio8.p1.Queue;

public class RecorridosAG{
	

	
	
	
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a, Integer n){
		//Me pasa como parametro un arbol con numeros enteros y tengo q devolver una lista con los numeros
		//impares mayores q n , recorriendo el arbol en pre orden.
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		if (!a.isEmpty()) {  
			preordenHelper(a,n,lista);}
		return lista; 
	}

	private void preordenHelper(GeneralTree <Integer> a, Integer n, LinkedList <Integer> lista) {
		
		if ( (a.getData() % 2 != 0) && (a.getData() > n ) )  {
			lista.add(a.getData());
		}
		if ( a.hasChildren() ) {
			// si tiene hijos, en una lista los guardo e itero uno por uno. 
			List<GeneralTree<Integer>> hijos = a.getChildren();
			for (GeneralTree<Integer> hijo : hijos  ) {
				preordenHelper(hijo,n,lista);
			}
		}
	}
	
	
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n){
		//Me pasa como parametro un arbol con numeros enteros y tengo q devolver una lista con los numeros
	   //impares mayores q n , recorriendo el arbol en in orden
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		if (!a.isEmpty()) {  
			inordenHelper(a,n,lista);}
		return lista;
	}
	
	
	private void inordenHelper(GeneralTree <Integer> a, Integer n, LinkedList<Integer> lista) {
		
		// Primero como es en in-orden debemos procesar el primer hijo de la izq mas bajo del arbol
		List<GeneralTree<Integer>> hijos = a.getChildren();
		if (a.hasChildren() ) {
			inordenHelper(hijos.get(0),n,lista);
		}
		
		
		if (a.getData() % 2 != 0 && a.getData() > n) {
			lista.add(a.getData());
		}
		
		for (int i = 1; i< hijos.size(); i++) {
			inordenHelper(hijos.get(i),n,lista); 
		}
	}

	
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n){
		LinkedList<Integer> lista = new LinkedList<Integer>();
		if (!a.isEmpty()) {  
			postordenHelper(a,n,lista);}
		return lista;
	}
	
	private void postordenHelper(GeneralTree <Integer> a, Integer n, LinkedList<Integer> lista) {
		
		List<GeneralTree<Integer>> hijos = a.getChildren();
		
		for (GeneralTree<Integer> nodo : hijos ) {
			postordenHelper(nodo,n,lista);
		}
		if (a.getData() % 2 != 0 && a.getData() > n){
				lista.add(a.getData()); 
			
		}
	}
	
	
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a,Integer n){
		// Como no necesito saber los distintos niveles, solo encolo por niveles, sin separacion. 
		
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		LinkedList<Integer> lista = new LinkedList<Integer>(); 
		GeneralTree<Integer> actual; 
		
		
		// Debo preguntar en el main si no es vacio 
		cola.enqueue(a); //encolo el nodo del arbol 
		
		while (!cola.isEmpty()) {
			
			// Me guardo el dato nodo en actual.
			actual = cola.dequeue();
			
			// Me fijo si el dato del nodo cumple con lo pedidio para agregarlo a la lista 
			if (actual.getData() > n && actual.getData()%2 !=0) {
				lista.add(actual.getData()); 
			}
			
			if (actual.hasChildren()) 
			   {
				List<GeneralTree<Integer>> hijos = actual.getChildren(); 
				for(GeneralTree<Integer> hijo : hijos) 
				{
					cola.enqueue(hijo);
				}
				
			
			   }
				
		}
		
		return lista; 
	}

}