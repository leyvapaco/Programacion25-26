package ud7.tarea5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public  class CalificacionPruebas implements Serializable{
	private static final long serialVersionUID = 4L;

	Scanner sc = new Scanner(System.in);
	static LinkedHashMap<Integer, ArrayList<Double>> listadoCalificaciones=new LinkedHashMap<Integer, ArrayList<Double>>();
	

	public void InsertaNotas() 	
	{
		try {
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\pruebaficheros\\ids_aspirantes.dat"));
			
			for (int i=1;i<3;i++){
				
				Integer idAspirante=in.read();
				listadoCalificaciones.put(idAspirante, new ArrayList<Double>());
			
				System.out.println("Introduce nota "+i+" para el aspirante:"+idAspirante);
				double nota=sc.nextDouble();
				listadoCalificaciones.get(in.read()).add(nota);
				in.close();
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	
	}
	
static void guardarFichero(){
		
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:\\pruebaficheros\\calificaciones.dat"));
			
			out.writeObject(listadoCalificaciones);
			out.flush();
			out.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
		
}

