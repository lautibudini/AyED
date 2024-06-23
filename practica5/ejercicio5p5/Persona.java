package ejercicio5p5;


public class Persona{
	
	private String nombre;
	private String direccion; 
	private String tipoPersona;
	private boolean cobro;
	
	
	public Persona(String tipo, String nombre, String domicilio, boolean cobro) {
        this.setTipoPersona(tipo);
        this.setNombre(nombre);
        this.setDireccion(domicilio);
        this.setCobro(cobro);
    }
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public boolean getCobro() {
		return cobro;
	}
	public void setCobro(boolean cobro) {
		this.cobro = cobro;
	}
	
	
	
	
	
}