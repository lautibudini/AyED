package ejercicio2p3; 

import java.util.*;
import ejercicio1p3.GeneralTree; 

public class pruebas{
	
	
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
        GeneralTree<Integer> a2 = new GeneralTree<Integer>(4,children2);
        
        
        List<GeneralTree<Integer>> children3 = new LinkedList<GeneralTree<Integer>>();
        children3.add(new GeneralTree<Integer>(90));
        children3.add(new GeneralTree<Integer>(25));
        children3.add(new GeneralTree<Integer>(5));
        GeneralTree<Integer> a3 = new GeneralTree<Integer>(11,children3);
		
        
        List<GeneralTree<Integer>> children = new LinkedList<GeneralTree<Integer>>();
        children.add(a1);
        children.add(a2);
        children.add(a3);
        
        GeneralTree<Integer> a = new GeneralTree<Integer>(19,children);
        
        
        //                             19
        //                         /    |    \ 
       //                        7       4     11  
       //                     / | \    / | \   / | \  
      //                    17  20 15 12 28 6 90 25 5
        
      
	
        
        
        RecorridosAG recorridos = new RecorridosAG();
        
        System.out.println("los numeros impares mayores que 10 son en pre : " + recorridos.numerosImparesMayoresQuePreOrden(a,10).toString() );
        System.out.println("los numeros impares mayores que 10 son en in : " + recorridos.numerosImparesMayoresQueInOrden(a,10).toString() );
        System.out.println("los numeros impares mayores que 10 son en post : " + recorridos.numerosImparesMayoresQuePostOrden(a,10).toString() );
	}
}
