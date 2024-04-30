package ejercicio2p3;

import ejercicio1p3.GeneralTree;
import java.util.*; 


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
}