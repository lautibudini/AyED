package ejercicio11p3; 

import java.util.LinkedList;
import java.util.List;
import ejercicio1p3.GeneralTree;
import ejercicio8.p1.Queue; 

public class ejercicio11p3 {
	
	public static boolean cumpleNiveles(GeneralTree<Integer> arbol) {
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		GeneralTree<Integer> aux; 
		cola.enqueue(arbol);
		cola.enqueue(null);
		int nivel_act = 0;
		int nivel_ant = 0; 
		while (!cola.isEmpty()) {
			aux = cola.dequeue();
			if (aux != null) {
				nivel_act +=1; 
				if (aux.hasChildren()) {
					List<GeneralTree<Integer>> hijos = aux.getChildren();
					for (GeneralTree<Integer> hijo : hijos) {
						cola.enqueue(hijo);
					}
					
				}
			}
			else {
				if (nivel_act != nivel_ant +1) {
					return false;
				}
				else {
					if(!cola.isEmpty()) {
						nivel_ant = nivel_act; 
						nivel_act = 0;
						cola.enqueue(null);
					}
				}
			}
		}
		return true; 
	}
	
	public static void main(String[] args) {
		
     
    	List<GeneralTree<Integer>> children1 = new LinkedList<GeneralTree<Integer>>();
        children1.add(new GeneralTree<Integer>(17));
        children1.add(new GeneralTree<Integer>(20));
        children1.add(new GeneralTree<Integer>(15));
        GeneralTree<Integer> a1 = new GeneralTree<Integer>(7,children1);
        
        List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
        children2.add(new GeneralTree<Integer>(12));
        children2.add(new GeneralTree<Integer>(28));
        children2.add(new GeneralTree<Integer>(6));
        GeneralTree<Integer> a22 = new GeneralTree<Integer>(4,children2);
        
        
        List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
        children3.add(new GeneralTree<Integer>(90));
        children3.add(new GeneralTree<Integer>(25));
        children3.add(new GeneralTree<Integer>(5));
        GeneralTree<Integer> a3 = new GeneralTree<Integer>(11,children3);
		
        
        List<GeneralTree<Integer>> children = new LinkedList<GeneralTree<Integer>>();
        children.add(a1);
        children.add(a22);
        children.add(a3);
        
        GeneralTree<Integer> ab = new GeneralTree<Integer>(19,children);
        System.out.println("Es creciente el arbol 1: " + cumpleNiveles(ab)); // Debe retornar false. 
        
        
        //                             19
        //                         /    |    \ 
       //                        7       4     11  
       //                     / | \    / | \   / | \  
      //                    17  20 15 12 28 6 90 25 5
        
        
        List<GeneralTree<Integer>> children12 = new LinkedList<GeneralTree<Integer>>();
        GeneralTree<Integer> a12 = new GeneralTree<Integer>(7,children12);
        
        List<GeneralTree<Integer>> children22 = new LinkedList<GeneralTree<Integer>>();
        GeneralTree<Integer> a23 = new GeneralTree<Integer>(4,children22);
     
        List<GeneralTree<Integer>> childrenn = new LinkedList<GeneralTree<Integer>>();
        childrenn.add(a12);
        childrenn.add(a23);
        
        GeneralTree<Integer> abb = new GeneralTree<Integer>(19,childrenn);
        System.out.println("Es creciente el arbol 1: " + cumpleNiveles(abb)); // Debe retornar true. 
        
        
        //                             19
        //                           /    |  
       //                          7       4      
        
        
        
        
	}
	
}

