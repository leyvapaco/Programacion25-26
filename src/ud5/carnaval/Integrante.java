package ud5.carnaval;

public class Integrante {

	 private int numParticipante;
	 private String nombre;
	 private int edad;  
	 private String localidad; 
	 
	 
	 
	 public Integrante(int id, String nombre,int edad,String localidad){
		 this.edad = edad;
		 this.nombre = nombre;
		 this.localidad = localidad;
		 this.numParticipante = id;
	 }


	 @Override
	public String toString() {
		return "Integrante [num_participante=" + numParticipante + ", integrante=" + nombre + ", edad=" + edad
				+ ", localidad=" + localidad + "]";
	}

	
}


