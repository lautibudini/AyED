package ejercicio4.p1;

public class SwapValores {
	
  public static void swap1 (int x, int y) {
	  if (x < y) {
      int tmp = x ;
      x = y ;
      y = tmp;  } 
	  }

  public static void swap2 (Integer x, Integer y) {
	  if (x < y) {
      int tmp = x ;
      x = y ;
      y = tmp;  }
	  }
 
  public static void main(String[] args) {
	  int a = 1, b = 2;
      Integer c = 3, d = 4;
      swap1(a,b);
      swap2(c,d);
      System.out.println("a=" + a + " b=" + b) ;
      System.out.println("c=" + c + " d=" + d) ;  
      }
  
  // no cambia los valores, deberia devolver esos valores y assignarlos en el pp. 
  /*
   * En java los parametros se pasan por valor, por ende no cambia el valor fuer de la funcion.
   * Pero si pasamos objetos como parametros, podemos modificar el estado del objeto dentro de esa funcion 
   * y seran visibles por fuera. 
   */
}
