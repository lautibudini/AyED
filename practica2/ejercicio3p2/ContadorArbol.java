package ejercicio3p2;
import tp2.ejercicio1.BinaryTree;
import java.util.LinkedList;

public class ContadorArbol {
	
	private BinaryTree<Integer> ab; 
	
	public ContadorArbol(BinaryTree<Integer> a) {
		this.ab = a; 
	}
	
	public void InOrden(BinaryTree<Integer> data , LinkedList<Integer> l ){
		if (!data.isEmpty()) { //puedo no ponerlo y anda, pero se usa en la catedra
			if (data.hasLeftChild()) {
				InOrden(data.getLeftChild(),l);
			}
			if(data.getData() % 2 == 0) {
				l.add(data.getData());
			}
			if (data.hasRightChild()) {
				InOrden(data.getRightChild(),l);
			}
		}
	}
	
	public void PostOrden(BinaryTree<Integer> data , LinkedList<Integer> l) {
		if(!data.isEmpty()) {
			if (data.hasLeftChild()) {
				PostOrden(data.getLeftChild(),l);
			}
			if (data.hasRightChild()) {
				PostOrden(data.getRightChild(),l);
			}
			if (data.getData() % 2 == 0) {
				l.add(data.getData());
			}
		}
	}
	
	
	public LinkedList<Integer> numerosPares() {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		//InOrden(ab,lista); 
		PostOrden(ab,lista);
		return lista;
	}

}
