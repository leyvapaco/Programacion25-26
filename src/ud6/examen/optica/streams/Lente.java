package ud6.examen.optica.streams;

import java.io.Serializable;

public abstract class Lente{

	protected char pos; // Izquierda('I') o Derecha ('D')
	
	Lente(char pos){
		this.pos = pos;
	}
	
	public abstract void dimeTipoLente();
		
}
