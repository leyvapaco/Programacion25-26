package ud4.animales2;

import ud4.animales2.Serpiente.Especies;
import ud4.visibilidad.Gato;

public class Principal {
	
	public static void main(String[] args) {
		Perro perro1 = new Perro();
		Pato  pato1= new Pato(); 
		Serpiente serp1= new Serpiente();
		Gato gato1= new Gato();
		gato1.comunicate();
		//gato1.respira=true; No tengo acceso directo al atributo
		//Accedo al método protected de Mamifero:
		System.out.println("Gato respira?:"+gato1.isRespira());
			
		Animal.getVidas();
		Mamifero.getVidas();
		Oviparo.getVidas();
		
		System.out.println("---------");
		
		System.out.println(perro1.getClass().getSimpleName());
		perro1.setNombre("Pulgoso");
		perro1.setEdad(7);
		perro1.setNumeroChip(12123123);
		perro1.setCola(true);
		perro1.olfatear();
		perro1.comunicate();
		perro1.reproducete();
		
		System.out.println("---------");

		System.out.println(pato1.getClass().getSimpleName());
		pato1.setNombre("Lucas");
		pato1.comunicate();
		pato1.hacerNido();
		pato1.reproducete();

		System.out.println("---------");
		
		Serpiente.muestraEspecies();
		System.out.println(serp1.getClass().getSimpleName());
		serp1.setNombre("Bichaca");
		serp1.comunicate();
		serp1.reproducete();
		serp1.morder(Especies.VIBORA,pato1); //Pobre pato...
		System.out.println("Me llamo: "+serp1.getNombre());

		Animal.getVidas();
	}

}
