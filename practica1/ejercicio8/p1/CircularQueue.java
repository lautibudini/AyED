package ejercicio8.p1;

public class CircularQueue<T> extends Queue<T>{
	
	//desencola el primer dato y lo vuelve a encolar. 
	public T shift(){
		
		if (!super.isEmpty()) {
			T d = super.dequeue();
			super.enqueue(d);
			return d;
		}else {
			return null;
		}
	}
}