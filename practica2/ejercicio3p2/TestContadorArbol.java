package ejercicio3p2;
import tp2.ejercicio1.*;
import java.util.LinkedList; 

public class TestContadorArbol{
	
	public static void main(String[] args) {
		
		BinaryTree<Integer> ab = new BinaryTree<Integer>(10);
		BinaryTree<Integer> nodo1 = new BinaryTree<Integer>(9);
		BinaryTree<Integer> nodo2 = new BinaryTree<Integer>(8);
		BinaryTree<Integer> nodo3 = new BinaryTree<Integer>(6);
		BinaryTree<Integer> nodo4 = new BinaryTree<Integer>(5);
		BinaryTree<Integer> nodo5 = new BinaryTree<Integer>(2);
		
		ab.addLeftChild(nodo1);
		nodo1.addLeftChild(nodo3);
		nodo3.addLeftChild(nodo2);
		ab.addRightChild(nodo5);
		nodo5.addRightChild(nodo4);
		
		LinkedList<Integer> result;
		
		
		//Al ser una clase debo instanciarla y ahi puedo usar sus metodos
		//En este caso se pedia q tenga una arbol dentro de la clase por eso lo paso como parametro, y q pueda recorrelo
		ContadorArbol c = new ContadorArbol(ab); 
		
		result = c.numerosPares();
		
		System.out.println(result.toString());
		
	}
}