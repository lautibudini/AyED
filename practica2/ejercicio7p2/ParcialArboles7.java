package ejercicio7p2;
import tp2.ejercicio1.*;

class ParcialArboles7{
	
	BinaryTree<Integer> arbol; 
	
	
	public void setArbol(BinaryTree<Integer> a) {
		this.arbol = a;
	}
	
	
	public BinaryTree<Integer> buscar(int num, BinaryTree<Integer> arbol){
		BinaryTree<Integer> dato = arbol; 
		
		// si mi raiz es igual a mi numero = raiz correcta       o     esta vacia, retorno= null                                   
		
		if(dato.isEmpty() || dato.getData()== num) {
			return dato;}
		
		 
		if(dato.hasLeftChild()) {
			   
			BinaryTree<Integer> izq = buscar(num,dato.getLeftChild());
			if (izq != null) {
				return izq; 
			}
			}
			
		if(dato.hasRightChild()) {
			    
			BinaryTree<Integer> der =buscar(num,dato.getRightChild());
			if (der != null) {
				return der; 
			}
			}
		
		
	     return null;
			
	}
	
	
	public int contar(BinaryTree<Integer> arboll) {
		int unhijo =0; 
		if (arboll.hasLeftChild()) {
			unhijo += contar(arboll.getLeftChild());
		}
		if (arboll.hasRightChild()) {
			unhijo += contar(arboll.getRightChild()); 
		}
		if((arboll.hasLeftChild() && !arboll.hasRightChild()) || (!arboll.hasLeftChild() && arboll.hasRightChild())) {
			unhijo ++;
		}
		
		return unhijo; 
	}
	
	
	
	public boolean isLeftTree(int num) {
		boolean aux = false;  

		// si viene vacio entonces no entro.
		if  (!this.arbol.isEmpty()) {
			// busco el nodo.
			BinaryTree<Integer> nodo = buscar(num,this.arbol);
			
			// si lo econtro <>  null
			if (nodo!= null) {
				int hi = 0; 
				int hd = 0; 
				if (nodo.hasLeftChild()) {
					hi = contar(nodo.getLeftChild());
				}
				
				if (nodo.hasRightChild()) {
					hd = contar(nodo.getRightChild());
				}
				
				if (hi>hd) {
					aux = true; 
				}
				
				
			}
		}
		
		return aux;
	}
	
	
	
}