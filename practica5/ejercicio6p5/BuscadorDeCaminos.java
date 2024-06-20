package ejercicio6p5;

import ejercicio1p5.*;
import ejercicio1p5.adjList.*;
import java.util.*;


public class BuscadorDeCaminos{
	
	private Graph<String> bosque; 
	
	public BuscadorDeCaminos(Graph<String> bosque) {
        this.setBosque(bosque);
    }

    public Graph<String> getBosque() {
        return bosque;
    }

    public void setBosque(Graph<String> bosque) {
        this.bosque = bosque;
    }
    
    
    
    
    public List<List<String>> RecorridosMasSeguros(){
    	List<List<String>> caminos = new LinkedList<List<String>>();
    	if ( this.bosque != null && !this.bosque.isEmpty() ) {
    		//Si existen los dos vertices procedo
    		if( (this.bosque.search("Casa Caperucita")!= null) && (this.bosque.search("Casa Abuelita")!= null)) {
    			boolean [] marcas = new boolean[this.bosque.getSize()];
    			List<String> camAct = new LinkedList<String>();
    			Vertex<String> v = this.bosque.search("Casa Caperucita");
    			// Tiro el dfs con el vertice origen , el destino, cam Act , caminos, y el array de marcas
    			RecorridosMasSeguros(v,"Casa Abuelita",camAct,caminos,marcas);
    		}
    	}
    	
    	return caminos;
    }
    
   private void RecorridosMasSeguros(Vertex<String> act, String corte,List<String> camAct,List<List<String>> caminos,boolean [] marcas  ) {
	   //Marco como visitado en este camino actual
	   int i = act.getPosition();
	   marcas[i] = true; 
	   // Si entro a la recursion es xq cumple entonces agrego al camino actual
	   camAct.add(act.getData());
	   // Si llegue a mi destino agrego todo el camino actual
	   if(act.getData() == corte) {
		   caminos.add(new LinkedList<String>(camAct));
	   }
	   // Sino sigo recorriendo
	   else {
		   for(Edge<String> e : this.bosque.getEdges(act)) {
			   if( (!marcas[e.getTarget().getPosition()]) && e.getWeight()<5) {
				   RecorridosMasSeguros(e.getTarget(),corte,camAct,caminos,marcas);
			   }
		   }
	   }
	   //Cuando termina una recursion voy sacando el ultimo elemento de la lista actual, y desmarco este vertice 
	   // para armar otro camino.
	   camAct.remove(camAct.size()-1);
	   marcas[i] = false;
   }
    
   
   public static void main (String[] args) {
       Graph<String> bosque = new AdjListGraph<String>();
       Vertex<String> v1 = bosque.createVertex("Casa Caperucita");
       Vertex<String> v2 = bosque.createVertex("Claro 3");
       Vertex<String> v3 = bosque.createVertex("Claro 1");
       Vertex<String> v4 = bosque.createVertex("Claro 2");
       Vertex<String> v5 = bosque.createVertex("Claro 5");
       Vertex<String> v6 = bosque.createVertex("Claro 4");
       Vertex<String> v7 = bosque.createVertex("Casa Abuelita");
       bosque.connect(v1, v2, 4);
       bosque.connect(v2, v1, 4);
       bosque.connect(v1, v3, 3);
       bosque.connect(v3, v1, 3);
       bosque.connect(v1, v4, 4);
       bosque.connect(v4, v1, 4);
       bosque.connect(v2, v5, 15);
       bosque.connect(v5, v2, 15);
       bosque.connect(v3, v5, 3);
       bosque.connect(v5, v3, 3);
       bosque.connect(v4, v3, 4);
       bosque.connect(v3, v4, 4);
       bosque.connect(v4, v5, 11);
       bosque.connect(v5, v4, 11);
       bosque.connect(v4, v6, 10);
       bosque.connect(v6, v4, 10);
       bosque.connect(v4, v3, 4);
       bosque.connect(v3, v4, 4);
       bosque.connect(v5, v7, 4);
       bosque.connect(v7, v5, 4);
       bosque.connect(v6, v7, 9);
       bosque.connect(v7, v6, 9);
       BuscadorDeCaminos bosquee = new BuscadorDeCaminos(bosque);
       
       
       System.out.println(bosquee.RecorridosMasSeguros());
       
       //  Debe retornar una lista con caminos:
       //1) Casa Caperucita- Claro 1 - Claro 5 - Casa Abuelita.
       //2) Casa Caperucita- Claro 2 - Claro 1 - Claro 5 - Casa Abuelita.
       
      
       
       // Retorna : 
       // [[Casa Caperucita, Claro 1, Claro 5, Casa Abuelita], 
       // [Casa Caperucita, Claro 2, Claro 1, Claro 5, Casa Abuelita]]
       
   }
	
	
	
}