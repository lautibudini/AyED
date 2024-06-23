package ejercicio5p5;


import ejercicio1p5.*;
import ejercicio1p5.adjList.*;
import java.util.*;
import ejercicio8.p1.Queue;



public class BancoItabu{
	
	
	private Vertex<Persona> buscarEmpleado(Graph<Persona> grafo, String Empleado) {
        // Me guardo los vertices del grafo en una lista
		List<Vertex<Persona>> vertices = grafo.getVertices();
        Iterator<Vertex<Persona>> it = vertices.iterator();
        // Inicializo en null por defecto.
        Vertex<Persona> persona = null;
        boolean sigo = true;
       // Mientras no lo encuentre y tenga mas vertices sigo.
        while ((it.hasNext()) && (sigo)) {
            Vertex<Persona> aux = it.next();
            if(aux.getData().getNombre().equals(Empleado)) {
                persona = aux;
                sigo = false;
            }
        }
        return persona;
    }
	
	
	public List<String> quedateEnCasa(Graph<Persona> grafo, String empleado, int separacion){
		// Creamos la lista , donde vamos a guardar el nombre de los jubilados.
		List<String>jubilados = new LinkedList<String>();
		// Al ser un grafo donde el dato es una clase, tenemos que implementar nuestro 'serach()'
		Vertex<Persona> emp = buscarEmpleado(grafo,empleado);
		if (grafo != null && !grafo.isEmpty() && emp!= null ) {
			helperQuedateEnCasa(grafo,empleado,separacion,jubilados,emp);
		}
		return jubilados;
	}
	
	
	private void helperQuedateEnCasa(Graph<Persona> grafo, String empleado, int separacion,List<String>jubilados, Vertex<Persona> inicio ) {
		boolean seguir = true; 
		int separacion_act = 0;
		boolean [] marcas = new boolean[grafo.getSize()];
		Queue <Vertex<Persona>> cola = new Queue<Vertex<Persona>>();
		//Marcamos el vertice inicial 'empleado' como ya visitado.
		marcas[inicio.getPosition()] = true; 
		cola.enqueue(inicio);
		cola.enqueue(null);
		while (!cola.isEmpty() && seguir) {
			// Guardamos el vertice actual.
			Vertex<Persona> aux = cola.dequeue();
			if ( aux != null) {
				// Debo verificar que la lista de jubilados todavia tenga espacio, sino ya corto
				if (jubilados.size()< 40) {
					// Debe ser un jubilado, que no haya cobrado y este en un rango menor o igual a la distancia del empleado
					if (aux.getData().getTipoPersona().equals("Jubilado") && !aux.getData().getCobro() && separacion_act<=separacion) {
						//Como cumple lo agregamos a la lista de los jubilados
						jubilados.add(aux.getData().getNombre());
					}
					//Procesamos los adyacentes.
					List<Edge<Persona>> ady = grafo.getEdges(aux);
					// Usamos un iterador ya que no queremos recorrer todos los hijos de no ser necesario.
					Iterator<Edge<Persona>> it = ady.iterator();
					while (it.hasNext() && seguir) {
						//Guardamos la arista.
						Edge<Persona> e = it.next();
						// Si no esta visistado, lo marcamos como true y encolamos el vertice
						if (!marcas[e.getTarget().getPosition()]) {
							marcas[e.getTarget().getPosition()] = true;
							cola.enqueue(e.getTarget());
						}
					}
				}else { // Corta xq no hay mas espacio
					seguir = false; 
				}
			}else {
				// Dos casos tenemos, que ya hayamos pasado esa distancia maxima permitida desde el vertice empleado o no.
				if (!cola.isEmpty()) {
					separacion_act++;
					// Si es mayor ya lo procesamos entonces, ponemos en false y no encolamos nada.
					if(separacion_act > separacion) {
						seguir = false;
					}else {
						// Si no lo procesamos lo encolamos a null para seguir.
						cola.enqueue(null);
					}
				}
			}
			
		}
	}
	

	
	
	public static void main(String[] args) {
        Graph<Persona> grafo = new AdjListGraph<>();
        Vertex<Persona> v1 = grafo.createVertex(new Persona("Empleado", "carla", "capital", true));
        Vertex<Persona> v2 = grafo.createVertex(new Persona("Jubilado", "marcos", "bosques", false));
        Vertex<Persona> v3 = grafo.createVertex(new Persona("Jubilado", "juti", "lp", false));
        Vertex<Persona> v4 = grafo.createVertex(new Persona("Empleado", "sofi", "lp", true));
        Vertex<Persona> v5 = grafo.createVertex(new Persona("Jubilado", "Ori", "bosques", true));
        Vertex<Persona> v6 = grafo.createVertex(new Persona("Empleado", "lola", "lp", false));
        Vertex<Persona> v7 = grafo.createVertex(new Persona("Jubilado", "chechu", "lp", false));
        Vertex<Persona> v8 = grafo.createVertex(new Persona("Jubilado", "sol", "lp", false));
        Vertex<Persona> v9 = grafo.createVertex(new Persona("Jubilado", "juan", "lp", false));
        
        
 
        grafo.connect(v1, v2);
        grafo.connect(v2, v1);
        grafo.connect(v2, v3);
        grafo.connect(v3, v2);
        grafo.connect(v1, v9);
        grafo.connect(v9, v1);
        grafo.connect(v9, v8);
        grafo.connect(v8, v9);
        
        grafo.connect(v1, v4);
        grafo.connect(v4, v1);
        grafo.connect(v1, v6);
        grafo.connect(v6, v1);
        grafo.connect(v4, v5);
        grafo.connect(v5, v4);
        grafo.connect(v5, v7);
        grafo.connect(v7, v5);
        
          
        BancoItabu prueba = new BancoItabu();
        
        System.out.println(prueba.quedateEnCasa(grafo, "carla", 2));
        // Res : [marcos, juan, juti, sol]
	}
	
	
	
}