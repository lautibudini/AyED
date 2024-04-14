package ejercicio3.p1;

public class profesor{
	
	private String nombre;
	private String apellido; 
	private String email;
	private String facultad;
	private String catedra;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
		
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	
	public String tusDatos() {
		return "profesor:" + this.getNombre() + ", apellido:" + this.getApellido() + ", email:" + this.getEmail() + ", facultad:" + this.getFacultad()
				+ ", catedra:" + this.getCatedra();
	} 
	
	
	
	
	
}