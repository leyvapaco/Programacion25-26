package ud7tarea4b;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

	
	public static void main (String[] arg) {
		
		
		System.out.println("seleccione la opcion:");
		System.out.println("1 - Cargar desde Fichero");
		System.out.println("2 - Insertar manualmente");
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = sc.nextInt();
		LinkedHashMap<String,Empleado> listaEmpleados = new LinkedHashMap<String, Empleado>();
		switch(opcion) {
		
		case 1:
			
			try {
				
				ObjectInputStream in = new ObjectInputStream (new FileInputStream("C:\\empleados\\empleados.dat"));
				
				
				while(true) {
					
					listaEmpleados.put(((Empleado) in.readObject()).getDni(), (Empleado) in.readObject());
					in.close();
				}
				
			}catch(IOException | ClassNotFoundException e ) {
				System.out.println(e.getMessage());
			};break;
			
		case 2:
			String continuar;
			do {
				
				System.out.println("Introduce el Dni del empleado:");
				String dni= sc.nextLine().toUpperCase();
				System.out.println("Introduce el nombre del empleado:");
				String nombre = sc.nextLine();
				System.out.println("Introduce la edad del empleado:");
				int edad = sc.nextInt();
				System.out.println("Introduce la estatura del empleado:");
				int estatura=sc.nextInt();
				System.out.println("Introduce el sueldo del empleado:");
				int sueldo= sc.nextInt();
				
			
				listaEmpleados.put(dni, new Empleado(nombre, dni, edad, estatura,sueldo));
				
				System.out.println("Desea continuar: S/N");
				continuar = sc.next();
				}while (!continuar.equalsIgnoreCase("n"));
					
			for(Empleado empleado: listaEmpleados.values()){	
			try {
				
				ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("C:\\empleados\\empleados.dat",true));
				
				
				out.writeObject(empleado);
				
				out.flush();
				out.close();
			}catch(IOException e){
				System.out.println(e.getMessage());
			}};break;
			
					
		}
		boolean finaliza = false;
		do {
			
		System.out.println("1 - Visualizar listado de empleados");
		System.out.println("2 -Borrar empleado/s");
		System.out.println("3 - Visualizar empleado");
		System.out.println("4 - Modificar empleado");
		System.out.println("5 - Insertar empleado");
		System.out.println("0 - Salir del programa");
		
		
		System.out.println("Selecione una Opcion:");
		
		int opcionMain = sc.nextInt();
		
		switch(opcionMain) {
		
		case 1:
			
			/* si solo quiere sacar los empleados
			for(Empleado emp : listaEmpleados.values()) {
				
				emp.toString();
			}
			*/
			 //para sacar la relacion clave empleado
			listaEmpleados.toString();break;
			
		case 2:
			String continuar="";
			do {
			System.out.println("Introduzca el dni del empleado a borrar");
			String keyDni= sc.nextLine().toUpperCase();
			
			if(listaEmpleados.containsKey(keyDni)) 
				listaEmpleados.remove(keyDni);
			else
				System.out.println("Ese dni no se encuentra en la lista");
			
			System.out.println("¿Desea seguir eliminando empleados? S/N");
			
			continuar=sc.next();
			
			}while(continuar.equalsIgnoreCase("n"));break;
			
		case 3:
			System.out.println("Introduzca el dni del empleado a consultar");
			String keyDni= sc.nextLine().toUpperCase();
			
			if(listaEmpleados.containsKey(keyDni)) 
				listaEmpleados.get(keyDni).toString();
			else
				System.out.println("Ese dni no se encuentra en la lista");
			break;
			
		case 4:
			
			System.out.println("Introduzca el dni del empleado a modificar");
			String keyDni1= sc.nextLine().toUpperCase();
			System.out.println("Introduce el nombre del empleado:");
			String nombre = sc.nextLine();
			System.out.println("Introduce la edad del empleado:");
			int edad = sc.nextInt();
			System.out.println("Introduce la estatura del empleado:");
			int estatura=sc.nextInt();
			System.out.println("Introduce el sueldo del empleado:");
			int sueldo= sc.nextInt();
			/* creando un nuevo empleado
			listaEmpleados.replace(keyDni1, new Empleado(nombre, keyDni1, edad, estatura, sueldo));
			*/
			
			
			// modificando los datos
			listaEmpleados.get(keyDni1).setNombre(nombre);
			listaEmpleados.get(keyDni1).setEdad(edad);
			listaEmpleados.get(keyDni1).setEstatura(estatura);
			listaEmpleados.get(keyDni1).setSueldo(sueldo);
			
		case 5:
			
			System.out.println("Introduce el Dni del empleado:");
			String dni= sc.nextLine().toUpperCase();
			System.out.println("Introduce el nombre del empleado:");
			String nombre1 = sc.nextLine();
			System.out.println("Introduce la edad del empleado:");
			int edad1 = sc.nextInt();
			System.out.println("Introduce la estatura del empleado:");
			int estatura1=sc.nextInt();
			System.out.println("Introduce el sueldo del empleado:");
			int sueldo1= sc.nextInt();
			
		
			listaEmpleados.put(dni, new Empleado(nombre1, dni, edad1, estatura1,sueldo1));
			
		case 0:
			System.out.println("Fin del programa");
			finaliza = true;
			
			for(Empleado empleado: listaEmpleados.values()){	
				try {
					
					ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("C:\\empleados\\empleados.dat",true));
					
					
					out.writeObject(empleado);
					
					out.flush();
					out.close();
				}catch(IOException e){
					System.out.println(e.getMessage());
				}};
			
			
			break;
			
		default:
			System.out.println("Opcion no valida");break;
		}
		
		
		
		}while(!finaliza);
}
}