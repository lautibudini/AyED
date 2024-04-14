package ejercicio5p2;
import tp2.ejercicio1.*;
import ejercicio8.p1.*;

public class ProfundidadArbolBinario{
	
	BinaryTree<Integer> arbol; 
	
	public void setArbol (BinaryTree<Integer> data) {
		this.arbol = data; 
	}
	
	public int SumaElementosProfundidad(int n) {
		int suma = 0; 
		int nivel = -1;
		
		Queue <BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		BinaryTree<Integer> arbolito; 
		
		cola.enqueue(null); //encolamos null para que entre con un dato null y sepamos que es el nivel cero 
		cola.enqueue(arbol);//encolamos la raiz 
		
		
		// mientras tenga elementos y no llegue al nivel itero.
		while (!cola.isEmpty() && nivel <= n)  {
			arbolito  = cola.dequeue();
			//si no termine o no empiezo un nivel
			if (arbolito != null) {
			    suma+= arbolito.getData();
				if(arbolito.hasLeftChild()) {
					cola.enqueue(arbolito.getLeftChild());
				}
                if (arbolito.hasRightChild()) {
            	    cola.enqueue(arbolito.getRightChild());
            }
	        // si es null , me fijo si todavia tengo elementos en la cola para seguir sumando.
			}else if (!cola.isEmpty()){
				// encolar un null ya que estamos en otro nivel.
				cola.enqueue(null);
				nivel++; 
			}
		}
		
		
		return suma;
	}
	
}