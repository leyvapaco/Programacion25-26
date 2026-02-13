package ud4.tarea1;

import java.util.Scanner;

public class Texto {
	private int longMax;
	private StringBuffer sB;
	
	Texto(String Cadena, int longitud){
		this.sB = new StringBuffer(longitud);
		this.sB.append(Cadena);
		this.longMax = longitud;
	}
	
	public void addCaracterComienzo(char caracter) {
		if(this.sB.length() < this.longMax) {
			StringBuffer sBTemp = new StringBuffer();
			sBTemp.append(caracter);
			sBTemp.append(this.sB);
			this.sB = sBTemp;
		}
	}
	
	public void addCaracterFinal(char caracter) {
		if(this.sB.length() < this.longMax) {
			sB.append(caracter);
		}
	}
	
	public void addCadenaComienzo(String cadena) {
		if((this.sB.length()+cadena.length()) <= this.longMax) {
			StringBuffer sBTemp = new StringBuffer();
			sBTemp.append(cadena);
			sBTemp.append(this.sB);
			this.sB = sBTemp;
		}
	}
	
	public void addCadenaFinal(String cadena) {
		if((this.sB.length()+cadena.length()) <= this.longMax) {
			sB.append(cadena);
		}
	}
	
			
	public int contarVocales(String Cadena) {
		int numVocales = 0;
		for(int i = 0; i < this.sB.length(); i++) {
			char actual = this.sB.toString().toLowerCase().charAt(i);
			
			switch (actual) {
			case 'a', 'e', 'i', 'o', 'u':
				numVocales++;
			break;
			}
			
		}
		return numVocales;
	}

	@Override
	public String toString() {
		return "Texto [longitud=" + longMax + ", sB=" + sB + "]";
	}

	
}
