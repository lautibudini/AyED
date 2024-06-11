package ejercicio5p2;
import tp2.ejercicio1.*;
import ejercicio8.p1.*;

public class ProfundidadArbolBinario{
	
	BinaryTree<Integer> arbol; 
	
	public void setArbol (BinaryTree<Integer> data) {
		this.arbol = data; 
	}
	
	
	public int SumaElementosProfundidad(int n) {
		Queue <BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		BinaryTree<Integer> aux;
		int suma = 0;
		int nivel_act = 0; 
		boolean seguir = true; 
		cola.enqueue(arbol);
		cola.enqueue(null);
		
		while( (!cola.isEmpty()) && seguir) { 
			aux = cola.dequeue();
			if(aux == null) {
				if(!cola.isEmpty()) {
					nivel_act ++;
					if (nivel_act> n) { //Si ya pase el nivel , es xq lo procese entonces corto la iteracion.
						seguir = false;
					}
					cola.enqueue(null);
				}
			}
			else {
				if (nivel_act == n) {           // Si estoy en el nivel pedidio sumo los valores del mismo.
					suma += aux.getData();
				}
				if(aux.hasLeftChild()) {
					cola.enqueue(aux.getLeftChild());
				}
                if (aux.hasRightChild()) {
            	    cola.enqueue(aux.getRightChild());
				}	
			
		}
		
		}
		
		return suma; 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}