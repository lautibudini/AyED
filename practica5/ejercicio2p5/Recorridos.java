package ejercicio2p5;

import ejercicio1p5.*;
import ejercicio1p5.adjList.*;
import java.util.*;
import ejercicio8.p1.Queue;


public class Recorridos{
	
	
			//Metodo que retorna una lista con los datos del grafo, con recorrido dfs (En profundidad)
			
			public List<String> dfs(Graph<String> grafo){
				List<String> resultado = new LinkedList<String>();
				if (grafo != null && !grafo.isEmpty()) {
					//array de visitados
					boolean [] marcas = new boolean[grafo.getSize()];
					// Recorremos y preguntamos por todas las posiciones para ver si queda alguno sin visitar y largar el dfs
					for (int i = 0; i<grafo.getSize();i++) {
						if(!marcas[i]) {
							helperDfs(i,grafo,marcas,resultado);
						}
					}
				}
				return resultado;
			}
			
			
		   private void helperDfs(int i, Graph<String> grafo,boolean [] marcas,List<String> resultado ) {
			   // El vertice que recibo lo marco como visitado.
			   marcas[i] = true;
			   Vertex<String> aux = grafo.getVertex(i);
			   //Agrego el dato a la lista que debo retornar.
			   resultado.add(aux.getData());
			   // Recorro sus adyacentes en caso de tenerlos.
			   List<Edge<String>> ady = grafo.getEdges(aux);
			   for(Edge<String> e : ady) {
				   int pos = e.getTarget().getPosition(); 
				   //Si no esta marcado tiro el dfs con ese vertice
				   if (!marcas[pos]) { 
					   helperDfs(pos,grafo,marcas,resultado);
				   }
			   }
			   
			   
			   
		   }
	
   
		   // Recorrido en amplitud del grafo con el recorrido bfs (iterativo).
		   
		   public List<String> bfs(Graph<String> grafo){
			   List<String> resultado = new LinkedList<String>();
			   if (grafo != null && !grafo.isEmpty()) {
				   boolean[] marcas = new boolean[grafo.getSize()];
				   for (int i =0; i< grafo.getSize(); i++) {
					   if (!marcas[i]) {
						   helperBfs(i,grafo,marcas,resultado);
					   }
				   }
			   }
			   return  resultado;
		   }
	
   
          private void helperBfs(int i,Graph<String> grafo, boolean[] marcas, List<String> resultado) {
        	  Queue<Vertex<String>> cola = new Queue<Vertex<String>>(); 
        	  Vertex<String> vertice = grafo.getVertex(i);
        	  // Marco como visitado el vertice con el cual se llamo al bfs.
        	  marcas[i] = true;
        	  //Encolo el vertice para luego procesarlo.
        	  cola.enqueue(vertice);
        	  // No hace falta encolar null.
        	  while(!cola.isEmpty()) {
        		  //Desencolo un elemento, en este caso siempre son vertices ya que no tenemos que separar por niveles.
        		  Vertex<String> act = cola.dequeue();
        		  //Lo agregamos a la lista que devolvemos.
        		  resultado.add(act.getData());
        		  //Procesamos sus adyacentes. Si no fueron visitados, los marca y encola.
        		  for(Edge<String> e : grafo.getEdges(act)) {
        			  if(!marcas[e.getTarget().getPosition()]) {
        				  marcas[e.getTarget().getPosition()] = true;
        				  cola.enqueue(e.getTarget());
        			  }
        		  }
        	  }
        	  
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
       
       
       Recorridos prueba = new Recorridos();
       
       
       //Pruebo los recorridos con el grafo del ejercicio6.
       
       System.out.println(prueba.dfs(bosque));
       //  El dfs retorna :
       //[Casa Caperucita, Claro 3, Claro 5, Claro 1, Claro 2, Claro 4, Casa Abuelita]
       
      
       System.out.println(prueba.bfs(bosque));
       //  El bfs retorna :
       //  [Casa Caperucita, Claro 3, Claro 1, Claro 2, Claro 5, Claro 4, Casa Abuelita]
       
       
       
   }
   
   
   
   
   
   
   
   
}