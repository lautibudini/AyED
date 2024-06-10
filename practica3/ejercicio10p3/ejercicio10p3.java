package ejercicio10p3; 

import java.util.LinkedList;
import java.util.List;
import ejercicio1p3.GeneralTree;

public class ejercicio10p3{
	
	private static List<Integer>Resolver(GeneralTree<Integer> arbol){
		List<Integer>CamAct = new LinkedList<Integer>();    
		List<Integer>CamMax = new LinkedList<Integer>();
		int nivel =0;
		int puntajeMax =0;
		int puntaje= 0; 
		HelperResolver(arbol, CamAct, CamMax, nivel, puntajeMax, puntaje);
		return CamMax; 
		
	}
	
	private static int  HelperResolver(GeneralTree<Integer> a, List<Integer>camact, List<Integer>cammax,  int nivel, int puntajemax, int puntaje) {
		int num = a.getData();
		if (num != 0) {               // Si es un uno, sumo el valor del nivel y lo agrego a la cola
			puntaje += num*nivel;
			camact.add(num);
		} 
		if (a.isLeaf()) {            // En caso de ser hoja, lo que hago es fijarme si es el camino maximo y de ser asi reemplazo.
			if(puntaje > puntajemax) {
				cammax.removeAll(cammax); 
				cammax.addAll(camact);
				puntajemax = puntaje; 
			}
		}
		else {                      // Si no es hoja y tiene hijos los proceso. 
			if(a.hasChildren()) {
				List<GeneralTree<Integer>> hijos = a.getChildren();
				for(GeneralTree<Integer> hijo : hijos) {
					// Debo guardar el puntaje maximo de esta forma ya que sino lo pierdo cuando vuelve de la recursion. 
					puntajemax = HelperResolver(hijo,camact, cammax, nivel + 1 ,puntajemax,puntaje); // Al nivel lo paso asi, para que lo envie como el siguiente.
				}
			}
		}
		if(num != 0) { // En caso de ser 1 , desencola el ultimo para poder armar un nuevo recorrido.
	    camact.remove(camact.size()-1);}
	return puntajemax; 
	}
	
	
	public static void main(String[] args) {
        List<GeneralTree<Integer>> subChildren1 = new LinkedList<>();
        subChildren1.add(new GeneralTree<>(1));
        subChildren1.add(new GeneralTree<Integer>(1));
        subChildren1.add(new GeneralTree<>(1));
        GeneralTree<Integer> subA = new GeneralTree<>(1, subChildren1);
        List<GeneralTree<Integer>> subChildren2 = new LinkedList<>();
        subChildren2.add(subA);
        subChildren2.add(new GeneralTree<>(1));
        GeneralTree<Integer> a1 = new GeneralTree<>(0, subChildren2);
        
        List<GeneralTree<Integer>> subChildren3 = new LinkedList<>();
        subChildren3.add(new GeneralTree<>(1));
        GeneralTree<Integer> subB = new GeneralTree<>(0, subChildren3);
        List<GeneralTree<Integer>> subChildren4 = new LinkedList<>();
        subChildren4.add(subB);
        GeneralTree<Integer> subC = new GeneralTree<>(0, subChildren4);
        List<GeneralTree<Integer>> subChildren5 = new LinkedList<>();
        subChildren5.add(new GeneralTree<>(1));
        subChildren5.add(subC);
        GeneralTree<Integer> a2 = new GeneralTree<>(1, subChildren5);
        
        List<GeneralTree<Integer>> subChildren6 = new LinkedList<>();
        subChildren6.add(new GeneralTree<>(0));
        subChildren6.add(new GeneralTree<>(0));
        GeneralTree<Integer> subD = new GeneralTree<>(0, subChildren6);
        List<GeneralTree<Integer>> subChildren7 = new LinkedList<>();
        subChildren7.add(subD);
        GeneralTree<Integer> subE = new GeneralTree<>(0, subChildren7);
        List<GeneralTree<Integer>> subChildren8 = new LinkedList<>();
        subChildren8.add(subE);
        GeneralTree<Integer> a3 = new GeneralTree<>(1, subChildren8);
        
        List<GeneralTree<Integer>> arbol = new LinkedList<>();
        arbol.add(a1);
        arbol.add(a2);
        arbol.add(a3);
        
        GeneralTree<Integer> a = new GeneralTree<>(1, arbol);
        System.out.println(Resolver(a));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}