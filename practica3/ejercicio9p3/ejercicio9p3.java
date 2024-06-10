package ejercicio9p3; 

import java.util.LinkedList;
import java.util.List;
import ejercicio1p3.GeneralTree;
import ejercicio8.p1.Queue; 


public class ejercicio9p3{
	
	
	public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
		GeneralTree<Integer> aux; 
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		cola.enqueue(arbol);
		while(!cola.isEmpty()) {
			aux = cola.dequeue();
			if (aux.hasChildren()) {
				int min = Integer.MAX_VALUE; 
				List<GeneralTree<Integer>> hijos = aux.getChildren();
				for(GeneralTree<Integer> hijo : hijos) {
					if(hijo.getData() < min) {
						min = hijo.getData();
					}
					cola.enqueue(hijo);
				}
			    if (aux.getData() != min) {
			    	return false;
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
        System.out.println("Es  de seleccion 1 ? : " + esDeSeleccion(ab)); 
        
        
        
        
        List<GeneralTree<Integer>> children12 = new LinkedList<GeneralTree<Integer>>();
        GeneralTree<Integer> a12 = new GeneralTree<Integer>(7,children12);
        
        List<GeneralTree<Integer>> children22 = new LinkedList<GeneralTree<Integer>>();
        GeneralTree<Integer> a23 = new GeneralTree<Integer>(4,children22);
     
        List<GeneralTree<Integer>> childrenn = new LinkedList<GeneralTree<Integer>>();
        childrenn.add(a12);
        childrenn.add(a23);
        
        GeneralTree<Integer> abb = new GeneralTree<Integer>(4,childrenn);
        System.out.println("Es de seleccion el arbol 2: " + esDeSeleccion(abb)); // Debe retornar true. 
        
        
        //                             4
        //                           /    |  
       //                          7       4     
	
	}
	
	
	
	
	
	
}