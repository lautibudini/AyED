package ejercicio7.p1;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicio3.p1.*;

//import java.util.List;

public class TestArrayList{
	
	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("ingrese cuantos elementos desea agregar a la lista : ");
		int cant = escaner.nextInt();
		
		for (int i = 0; i<cant ; i++) {
			System.out.println("ingrese un numero: ");
			int num = escaner.nextInt();
			numeros.add(num);
		}
		
		System.out.println("contenido del arrayList");
		for (int num : numeros) {
			System.out.println(num);
		}
		
		escaner.close();
		
		metodoD();
		
		
		
	}


	//metodos 
	
	//inciso d
	
	public static void metodoD() {
		//creo la arraylist de estudiantes y la cargo. importe el contenido del punto 3 q tiene la clase estudiante. 
		ArrayList<estudiante> estudiantes = new ArrayList<estudiante>(); 
		
		estudiante e1  = new estudiante();
		estudiante e2  = new estudiante();
		estudiante e3  = new estudiante();
		
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
		
		e3.setNombre("lautaro");
		e3.setApellido("budini");
		e3.setComision(2);
		e3.setEmail("lautarobudini@algo.com");
		e3.setDireccion("Bosques");
		
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		
		//genero una copia de la arrayList anterior mandando como parametro estudiantes.
		
		ArrayList<estudiante> copia = new ArrayList<estudiante>(estudiantes);
		
		//imprimo el contenido de las dos 
		
		System.out.println("lista original : ");
		for (estudiante e : estudiantes ) {
			System.out.println(e.tusDatos());
		}
		
		System.out.println("lista copiada : ");
		
		for (estudiante e : copia ) {
			System.out.println(e.tusDatos());
		}
		
		
		//modifico un dato de algun estudiante
		
		e2.setDireccion("lp centro");
		copia.get(1).setComision(10);		
		
		//imprimo el contenido de las dos 
		
				System.out.println("lista original : ");
				for (estudiante e : estudiantes ) {
					System.out.println(e.tusDatos());
				}
				
				System.out.println("lista copiada : ");
				
				for (estudiante e : copia ) {
					System.out.println(e.tusDatos());
				}
		
		
				
		// inciso de agregar un nuevo estudiante verificando que no este en la lista 
				
	
	    System.out.println("ingrese un estudiante y sera agregado a la lista si no existe : ");
	    
	    Scanner escaner = new Scanner(System.in);
	    
	    estudiante nuevo = new estudiante();
	    
	    String nom = escaner.next();
	    String ap = escaner.next();
	    int co = escaner.nextInt();
	    String mail = escaner.next();
	    String dir = escaner.next();
	    
	    nuevo.setNombre(nom);
		nuevo.setApellido(ap);
		nuevo.setComision(co);
		nuevo.setEmail(mail);
		nuevo.setDireccion(dir);
	   
		escaner.close();
		
		boolean esta = false; 
		int i = 0;
		
		while (( i < estudiantes.size()) && (!esta)){
			if (estudiantes.get(i).equals(nuevo)) {
				System.out.println("ya existe el estudiante, no se puede agregar ");
				esta = true; 
			}
		}
		
		if (esta == false) {
			estudiantes.add(nuevo);
			System.out.println("ya se agrego correctamente el estudiante ");
		}
				
	}





}