package ud4.animales2;

public abstract class Oviparo extends Animal {
	static int vidas=0; //Para poder saber cuántas vidas de Oviparos tenemos
			
	Oviparo(){
		super();
		vidas++;	
	}
	
	@Override //Recomendable incluir @Override para indicar que estamos sobreescribiendo un método
	public void reproducete() {
		System.out.println("Poniendo huevos");
	}

	public static void getVidas() {
		System.out.println("Oviparos creados: "+vidas);
	}

}
