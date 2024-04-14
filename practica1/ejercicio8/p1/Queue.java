package ejercicio8.p1;
import java.util.*;

public class Queue<T> extends Sequence{
	
	// declaramos la lista de objeto T. data
	List<T> data; 
	
	//metodo constructor 
	public Queue() {
		this.data = new ArrayList<T>();
	}
	
	//agrega un dato al final
	public void enqueue(T dato) {
		data.add(dato);
	}
	
	// elimina y retorna el primer elem de la cola
	public T dequeue() {
		return data.remove(0);
	}
	
	//retorna el primer elemento 
	public T head() {
		return data.get(0);
	}
	
	//retorna el tamaño de la cola
	public int size(){
		return data.size();
	}
	
	//retorna si esta vacia 
	public boolean isEmpty() {
		return data.size()== 0; 
	}
	
	
	//metodo to string de la cola 
	public String toString() {
		String aux = "[";
		for(T d : data) {
			aux = aux + d + "-"; 
		}
		aux = aux + "]"; 
		return aux; 
	}
	
	
	
}