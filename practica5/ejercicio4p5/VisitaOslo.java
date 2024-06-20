package ejercicio4p5;

import ejercicio1p5.*;
import ejercicio1p5.adjList.*;
import java.util.*;


public class VisitaOslo{
	
	
	public List<String> PaseoEnBici(Graph<String> lugares, String destino, int MaxTiempo, List<String> lugaresRestringidos){
		// Declaramos una unica lista ya que cuando encontramos el camino termina.
		List<String> camAct = new LinkedList<String>();
		if (lugares != null && !lugares.isEmpty()) {
			boolean[] marcas = new boolean[lugares.getSize()];
			int tiempoAct = 0; 
			PaseoEnBici(lugares.search("Ayuntamiento"),lugares,destino,MaxTiempo,lugaresRestringidos,marcas,camAct,tiempoAct);
		}
		return camAct;
		
	}
	
	public boolean PaseoEnBici(Vertex<String> act,Graph<String> lugares, String destino, int MaxTiempo, List<String> lugaresRestringidos, boolean[] marcas,List<String> camAct, int tiempoAct ){
		// Usamos un booleano para saber cuando cortar y no seguir iternado.
		boolean seguir = false;
		int i = act.getPosition();
		marcas[i] = true;
		camAct.add(act.getData());
		if (  act.getData() == destino  ) {
			return true;
			}
		else {
			// Uso el iterator xq no quiero seguir procesando los vertices restantes si encuentro ya el primer camino.
			List<Edge<String>> ady = lugares.getEdges(act);
	        Iterator<Edge<String>> it = ady.iterator();
	        while(it.hasNext() && !seguir) {
	              Edge<String> v = it.next();
	              //Debe no estar marcado, no debo pasarme de tiempo y no ser un lugar restringido.
	              if(!marcas[v.getTarget().getPosition()] && v.getWeight()+ tiempoAct <= MaxTiempo && ! lugaresRestringidos.contains(v.getTarget().getData())) {
	                  seguir = PaseoEnBici(v.getTarget(),lugares,destino,MaxTiempo,lugaresRestringidos,marcas,camAct,tiempoAct+ v.getWeight());
	              }
	        }
	    }
		// Si no llegue todavia a mi destino debo sacar el ultimo elemento y desmarcar el que procese.
		if (!seguir) {
		  marcas[i] = false;
		  camAct.remove(camAct.size()-1);
		}
		return seguir;
	}
	
	
	
	public static void main(String[] args) {
        Graph<String> lugares = new AdjListGraph<String>();
        Vertex<String> v1 = lugares.createVertex("Holmenkollen");
        Vertex<String> v2 = lugares.createVertex("Parque Vigeland");
        Vertex<String> v3 = lugares.createVertex("Galería Nacional");
        Vertex<String> v4 = lugares.createVertex("Parque Botánico");
        Vertex<String> v5 = lugares.createVertex("Museo Munch");
        Vertex<String> v6 = lugares.createVertex("FolkMuseum");
        Vertex<String> v7 = lugares.createVertex("Palacio Real");
        Vertex<String> v8 = lugares.createVertex("Ayuntamiento");
        Vertex<String> v9 = lugares.createVertex("El Tigre");
        Vertex<String> v10 = lugares.createVertex("Akker Brigge");
        Vertex<String> v11 = lugares.createVertex("Museo Fram");
        Vertex<String> v12 = lugares.createVertex("Museo Vikingo");
        Vertex<String> v13 = lugares.createVertex("La Opera");
        Vertex<String> v14 = lugares.createVertex("Museo del Barco Polar");
        Vertex<String> v15 = lugares.createVertex("Fortaleza Akershus");   
        
        lugares.connect(v1, v2, 30);
        lugares.connect(v2, v1, 30);
        lugares.connect(v2, v3, 10);
        lugares.connect(v3, v2, 10);
        lugares.connect(v3, v4, 15);
        lugares.connect(v4, v3, 15);
        lugares.connect(v4, v5, 1);
        lugares.connect(v5, v4, 1);
        
        lugares.connect(v5, v9, 15);
        lugares.connect(v9, v5, 15);
        lugares.connect(v9, v13, 5);
        lugares.connect(v13, v9, 5);
        lugares.connect(v13, v15, 10);
        lugares.connect(v15, v13, 10);
        
        lugares.connect(v2, v6, 20);
        lugares.connect(v6, v2, 20);
        lugares.connect(v6, v7, 5);
        lugares.connect(v7, v6, 5);
        lugares.connect(v7, v8, 5);
        lugares.connect(v8, v7, 5);
        lugares.connect(v6, v10, 30);
        lugares.connect(v10, v6, 30);
        lugares.connect(v10, v8, 20);
        lugares.connect(v8, v10, 20);
        lugares.connect(v8, v4, 10);
        lugares.connect(v4, v8, 10);
        lugares.connect(v8, v9, 15);
        lugares.connect(v9, v8, 15);
        
        lugares.connect(v6, v11, 5);
        lugares.connect(v11, v6, 5);
        lugares.connect(v10, v12, 30);
        lugares.connect(v12, v10, 30);
        lugares.connect(v11, v14, 5);
        lugares.connect(v14, v11, 5);
        lugares.connect(v12, v14, 5);
        lugares.connect(v14, v12, 5);
        
        List<String> lugaresRestringidos = new LinkedList<String>();
        lugaresRestringidos.add("Akker Brigge");
        lugaresRestringidos.add("Palacio Real");
        VisitaOslo clase = new VisitaOslo();
        List<String> camino = clase.PaseoEnBici(lugares, "Museo Vikingo", 120, lugaresRestringidos);
        
        System.out.println(camino);
        
        //Resultado : [Ayuntamiento, Parque Botánico, Galería Nacional, Parque Vigeland, FolkMuseum, Museo Fram, Museo del Barco Polar, Museo Vikingo]
        
        // Opcion 1 : 
        //Ayuntamiento, El Tigre, Museo Munch, Parque Botánico, Galería Nacional, Parque Vigeland, 
        //FolkMuseum, Museo Fram, Museo del Barco Polar, Museo Vikingo. El recorrido se hace en 91 
        //minutos.
        
        // Opcion 2 : 
        //Ayuntamiento, Parque Botánico, Galería Nacional, Parque Vigeland, FolkMuseum, Museo 
        //Fram, Museo del Barco Polar, Museo Vikingo. El recorrido se hace en 70 minutos.

    }
	
	
	
}