package ejercicio4p2;
import tp2.ejercicio1.*;

public class RedBinariaLlena{
	
	public static int retardoReenvio(BinaryTree<Integer> arbol) {
		int hi = 0, hd= 0, max; 
		
		if (arbol.isLeaf()) {
			return arbol.getData();
		}else {
			if (arbol.hasLeftChild()) {
				hi = retardoReenvio(arbol.getLeftChild());
			}
			if (arbol.hasRightChild()) {
				hd = retardoReenvio(arbol.getRightChild());
			}
			max = Math.max(hi, hd);
			return max + arbol.getData();
		}
	}
	
	public static void main(String[] args) {
		
        //      14
   //         /    \
   //        53     2
   //       / \    / \
   //      12  9  33 102
		
		
		
		// declaracion del arbol
		BinaryTree<Integer> catorce = new BinaryTree<Integer>(14);
		BinaryTree<Integer> cincuentaYTres = new BinaryTree<Integer>(53);
		BinaryTree<Integer> dos =new BinaryTree<Integer>(2);
		BinaryTree<Integer> doce =new BinaryTree<Integer>(12);
		BinaryTree<Integer> nueve = new BinaryTree<Integer>(9);
		BinaryTree<Integer> treintaYTres =new BinaryTree<Integer>(33);
		BinaryTree<Integer> cientoDos =new BinaryTree<Integer>(102);
	
        catorce.addLeftChild(cincuentaYTres);
        catorce.addRightChild(dos);
        cincuentaYTres.addLeftChild(doce);
        cincuentaYTres.addRightChild(nueve);
        dos.addLeftChild(treintaYTres);
        dos.addRightChild(cientoDos);
		
		//
        System.out.println("El mayor retardo es de "+ retardoReenvio(catorce) +" segs");
		
		
	}
}