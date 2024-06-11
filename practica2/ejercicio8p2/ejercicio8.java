package ejercicio8p2;
import tp2.ejercicio1.*;

public class ejercicio8{
	
	/* Una solucion : 
	 * public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
       
		// Mi idea es ir recorriendo nodo por nodo viendo si son iguales.
	   // algun momento difieren retorna falso, sino corta cuando no tenga mas nodos en el arbol 1
		
		
		
		//caso base es verificar si no son iguales.
		if(arbol1.getData() != arbol2.getData()) {
            return false;
        } 
        boolean res = true;
        if(arbol1.hasLeftChild()) {
            if(arbol2.hasLeftChild()) {
            	// le paso y compara
                res = res && esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild()); 
            } else {return false;} // ya que el arbol1 tiene hi y arbol2 no.
        }
        if(arbol1.hasRightChild()) {
            if(arbol2.hasRightChild()) {
            	//paso y compara
                res = res && esPrefijo(arbol1.getRightChild(), arbol2.getRightChild()); 
            	
            } else { return false;} // ya que arbol1 tiene hd y arbol2 no 
        }
        return res;
	
	}*/
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		
		if (arbol1 == null || arbol1.isEmpty() || arbol1 == null || arbol1.isEmpty()) {
			return false;
		}else {
		return HelperEsPrefijo(arbol1,arbol2);	
		}
		
	}
	
	private boolean HelperEsPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		boolean res = true; // Por defecto siempre se crea en verdadero en lass recursiones
		BinaryTree<Integer> nodo1; 
		BinaryTree<Integer> nodo2; 
		nodo1= arbol1; 
		nodo2= arbol2; 
		if (nodo1.getData() != nodo2.getData()) {  // Si los datos no coinciden y no cumple y retorna false.
			return false; 
		}
		if(nodo1.hasLeftChild()) {
            if(nodo2.hasLeftChild()) {
            	// ya que cumple con tener hijo, llamo a la recursion 
                res =HelperEsPrefijo(nodo1.getLeftChild(), nodo2.getLeftChild()); 
            } 
            else{
            	return false;} // ya que el arbol1 tiene hijo y arbol2 no, no son iguales y retorna false
        }
		// Lo mismo con el derecho
		if(nodo1.hasRightChild()) {
            if(nodo2.hasRightChild()) {
                res =HelperEsPrefijo(nodo1.getRightChild(), nodo2.getRightChild()); 
            } 
            else{
            	return false;}
        }
		// Res por defecto retorna true, si en algun momento no cumple. Toma el valor de false q se retorno en alguna iteracion.
		return res; 
	}
	
	
      public static void main (String[] args) {
		
		
		//       arbol 1. 
		
		//          65
		//         /  \
		//       37    81
		//        \     \
		//        47     93
		
		
        BinaryTree<Integer>arbol1= new BinaryTree<Integer>(65);
        BinaryTree<Integer>hi = new BinaryTree<Integer>(37);
        BinaryTree<Integer>hd = new BinaryTree<Integer>(81);
        BinaryTree<Integer> hid = new BinaryTree<Integer>(47);
        BinaryTree<Integer> hdd = new BinaryTree<Integer>(93);
        
        arbol1.addLeftChild(hi);
        hi.addRightChild(hid);
        arbol1.addRightChild(hd);
        hd.addRightChild(hdd);
		
		
		
		
		//      arbol 2. 
		
		//          65
		//         /   \
		//       37     81
		//      /  \   /   \
		//    22   47  7    93
		
		
        BinaryTree<Integer>arbol2= new BinaryTree<Integer>(65);
        BinaryTree<Integer>hi2 = new BinaryTree<Integer>(37);
        BinaryTree<Integer>hd2 = new BinaryTree<Integer>(81);
        BinaryTree<Integer> hid2 = new BinaryTree<Integer>(47);
        BinaryTree<Integer> hdd2 = new BinaryTree<Integer>(93);
        BinaryTree<Integer> hii2 = new BinaryTree<Integer>(22);
        BinaryTree<Integer> hdi2 = new BinaryTree<Integer>(7);
        
        
        arbol2.addLeftChild(hi2);
        hi2.addRightChild(hid2);
        arbol2.addRightChild(hd2);
        hd2.addRightChild(hdd2);
        hd2.addLeftChild(hdi2);
        hi2.addLeftChild(hii2);
        
        
        // programa 
        ejercicio8 e = new ejercicio8();
        
        System.out.println(" el arbol 1 es pre-fijo del arbol 2 : " +  e.esPrefijo(arbol1, arbol2) ); // tiene que dar true
        System.out.println(" el arbol 2 es pre-fijo del arbol 1 : " +  e.esPrefijo(arbol2, arbol1) ); // Tiene que dar false
        
        
        
        
        
		
		
	}
	
}