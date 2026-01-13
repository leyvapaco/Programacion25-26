package ud4.animales2;

public abstract class Mamifero extends Animal {
	static int vidas=0; //Para poder saber cuántas vidas de Mamíferos tenemos
	

	Mamifero(){
		super(); //Llama al constructor del padre
		vidas++; //Incrementamos las vidas (de los Mamiferos)
	}
	
	@Override //Recomendable incluir @Override para indicar que estamos sobreescribiendo un método
	public void reproducete() { //Implementamos el método abstracto reproducete() de la clase Animal
		System.out.println("Reproduciendome (mamifero)");
	}

	public static void getVidas() {
		System.out.println("Mamiferos creados: "+vidas);
	}
}
