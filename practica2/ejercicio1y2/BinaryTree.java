package practica2.ejercicio1y2;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	
	//inicializa un árbol con el dato pasado como parámetro y ambos hijos nulos.

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	
	
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	
	//agrega un hijo como hijo izquierdo o derecho del árbol.
	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	
	
	//eliminan el hijo correspondiente.
	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	
	//indica si el árbol está vacío
	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	
    // indica si no tiene hijos.

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
	
	
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	
	
	@Override
	public String toString() {
		return this.getData().toString();
	}

	
	
	//Ejercicio 2 completar estos metodos. 
	
	public  int contarHojas() {
	    int cantH = 0;
		
	    if (this.isLeaf()) {
			return 1; //si no tiene hijos retorno 1
		}else
			//si tiene hijo izquierdo , se posiciona en ese hijo y hace la recursion, hasta llegar a la hoja
			if(this.hasLeftChild()) {
				cantH += this.getLeftChild().contarHojas();			}
		    
		    //si tiene hijo derecho , se posiciona en ese hijo y hace la recursion, hasta llegar a la hoja
		    if (this.hasRightChild()) {
		    	cantH += this.getRightChild().contarHojas();
		    }
		return cantH; 
		
	}
		
		
    	 
    public BinaryTree<T> espejo(){
	   
       BinaryTree <T> espejo = new BinaryTree<T>(this.getData());
       
       if (this.hasLeftChild()) {
    	   espejo.addRightChild(this.getLeftChild().espejo());
       }
       if(this.hasRightChild()) {
    	   espejo.addLeftChild(this.getRightChild().espejo());
    	   }
  
 	   return espejo;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		
   }
		
}
