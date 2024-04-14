package ejercicio8.p1;

public class DoubleEndedQueue<T> extends Queue<T>{
	
	//encola al principio un elemento
	public void enqueueFirst(T dato) {
		data.add(0, dato);
		
	}
}