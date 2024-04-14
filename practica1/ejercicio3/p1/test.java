package ejercicio3.p1;
public class test{
	
	public static void main(String[] args) {
		
		estudiante [] ve = new estudiante[2];
		profesor [] vp = new profesor[3];
		
		estudiante e1  = new estudiante();
		estudiante e2  = new estudiante();
		
		e1.setNombre("candela");
		e1.setApellido("caceres");
		e1.setComision(2);
		e1.setEmail("candelacaceres@algo.com");
		e1.setDireccion("los hornos");
		
		e2.setNombre("agustina");
		e2.setApellido("cabello");
		e2.setComision(1);
		e2.setEmail("agustinacabello@algo.com");
		e2.setDireccion("lp");
		
		
		profesor p1 = new profesor();
		profesor p2 = new profesor();
		profesor p3 = new profesor();
		
		p1.setNombre("Augusto");
		p1.setApellido("jank");
		p1.setCatedra("tarde -a");
		p1.setEmail("agustojank@algo.com");
		p2.setFacultad("informatica unlp");
		
		p2.setNombre("carla");
		p2.setApellido("vanden");
		p2.setCatedra("tarde -b");
		p2.setEmail("carlavanden@algo.com");
		p2.setFacultad("informatica unlp");
		
		p3.setNombre("norma");
		p3.setApellido("gome");
		p3.setCatedra("mañana -c");
		p3.setEmail("normagome@algo.com");
		p3.setFacultad("informatica unlp");
		
		ve[0] = e1;
		ve[1] = e2;
		
		vp[0] = p1;
		vp[1] = p2;
		vp[2] = p3;
		
		System.out.println(" alumnos : ");
		for (int i = 0; i<ve.length; i++) {
			System.out.println(ve[i].tusDatos());
		}
		
		System.out.println(" profesores : ");
		for ( profesor p : vp) {
			System.out.println(p.tusDatos());
		}
		
		
		
		
	}
}