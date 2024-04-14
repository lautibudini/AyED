package ejercicio7.p1;
import java.util.ArrayList;
import java.util.LinkedList;

public class metodosExtra{
  
	
	
	// Punto F - Escribir un metodo que devuelva verdadero o falso si la secuencia almacenada en la lista es o no capicua.
	
	public boolean esCapicua(ArrayList<Integer> list){
		boolean res = false; //por defecto
		int it = list.size() / 2; 
		int auxf = list.size() - 1; 
		for (int i =0; i <it; i++) {
			//list.get(aux) != list.get(auxf) podria ir dentro del if ? o solo con equals?
			if (!list.get(i).equals(list.get(auxf))) {
				return res;
			}
			auxf --; 
		}
		// si llego aca es xq es capicua
		res = true; 
		return res; 
	}
	
	
	//falta el punto g
	
	//Punto h- Implementar un metodo recursivo que invierta el orden de los elem de un ArrayList.
	
	public void invertirArrayList(ArrayList<Integer> list) {
		//hago una lista con los mismos elementos
		ArrayList<Integer> copia = new ArrayList<Integer>();
		
		//Recorro la lista desde el final hasta el principo
		int tamanio;
		for (tamanio = (list.size()-1);tamanio >= 0; tamanio--) {
			copia.add(list.get(tamanio));
		}

		//limpio y reemplazo las listas.
		list.clear();
		list.addAll(copia);
	}
	
	
	//Punto i - Implementar un metodo recursivo que calcule la suma de los elem de una linkedList.
	
   public int sumarLinkedList(LinkedList<Integer> lista) {
	   if (lista.isEmpty()) {
		   return 0; //caso base , retorna 0
	   }else {
		   // elimina y retorna el primer elem de la lista + la recursion.
		   return   lista.remove() + sumarLinkedList(lista);	   }
	   
   }
	
	
	//punto j -  Implementar un metodo combinar ordenado q reciba dos listas de numeros ordenados y devuelva una sola.
   
    public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> l1, ArrayList<Integer>l2) {
    	
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	
    	
    	while ( (!l1.isEmpty()) && (!l2.isEmpty()) ) {
    		//si mi primer elem de l1 es mas chico q l2, entonces elimino y retono para agregarlo a la nueva lista.
    		if (l1.get(0) <l2.get(0)) {
    			Integer num = l1.remove(0);
    			res.add(num);
    		}else {
    			Integer num = l2.remove(0);
    			res.add(num);
    		}
    	}
        // puede ser que salga o xq ya termino o xq una de las listas tiene menos elementos.
    	// como en una lista van a quedar elementos y ya esta ordenada, se agrega todo de una.
    	if (l1.isEmpty()) {
    		res.addAll(l1);
    	}else {
    		if (l2.isEmpty()){
    			res.addAll(l2);
    		}
    	}
    		
    	return res;
    	
    	
    	
  
    }
	 
	
}