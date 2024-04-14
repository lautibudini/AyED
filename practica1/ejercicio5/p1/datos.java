package ejercicio5.p1;

public class datos{
	private int max;
	private int min;
	private double prom;
	
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}
	
	@Override
	public String toString() {
		return "maximo : " + max + ", minimo : " + min + ", promedio : " + prom;
	} 
	
	
	
}