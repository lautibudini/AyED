package ejercicio7p2;
import tp2.ejercicio1.*;

class ejercicio7{
	
	
	public static void main(String[] args) {
		
		//           14
        //         /    \
        //        53     2
        //       / \    / \
        //      12  9  33 102
		//          /
		//         8
		ParcialArboles7 c = new ParcialArboles7();
		
		BinaryTree<Integer> arbol = new BinaryTree<Integer>(14);
		BinaryTree<Integer> cincuentaYTres = new BinaryTree<Integer>(53);
		BinaryTree<Integer> dos =new BinaryTree<Integer>(2);
		BinaryTree<Integer> doce =new BinaryTree<Integer>(12);
		BinaryTree<Integer> nueve = new BinaryTree<Integer>(9);
		BinaryTree<Integer> treintaYTres =new BinaryTree<Integer>(33);
		BinaryTree<Integer> cientoDos =new BinaryTree<Integer>(102);
		BinaryTree<Integer> ocho =new BinaryTree<Integer>(8);
		//BinaryTree<Integer> nada =new BinaryTree<Integer>(null);
	
        arbol.addLeftChild(cincuentaYTres);
        arbol.addRightChild(dos);
        cincuentaYTres.addLeftChild(doce);
        cincuentaYTres.addRightChild(nueve);
        dos.addLeftChild(treintaYTres);
        nueve.addLeftChild(ocho);
        dos.addRightChild(cientoDos);
		
		
		
		c.setArbol(arbol);
		
		boolean resultado = c.isLeftTree(53);
		
		System.out.println("resultado : "+ resultado);
	}
}