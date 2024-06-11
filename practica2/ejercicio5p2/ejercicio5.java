package ejercicio5p2;
import tp2.ejercicio1.*;

public class ejercicio5 {
    public static void main(String[] args) {
        //           14
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

        ProfundidadArbolBinario prof = new ProfundidadArbolBinario();
        
        prof.setArbol(catorce);
        
        
        System.out.println("La suma del nivel 0 es: "+prof.SumaElementosProfundidad(0));
        System.out.println("La suma del nivel 1 es: "+prof.SumaElementosProfundidad(1));
        System.out.println("La suma del nivel 2 es: "+prof.SumaElementosProfundidad(2));
    }
}