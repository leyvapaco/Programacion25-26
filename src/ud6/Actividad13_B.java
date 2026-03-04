package ud6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ud6.fiesta.Invitado;

public class Actividad13_B {
	
	public static void main(String[] args) {
		
        List<Invitado> 
        manoloSL = new ArrayList <>();
        
		Invitado i1=new Invitado("Ana",22);
		Invitado i2=new Invitado("Pablo",20);
		Invitado i3=new Invitado("Rocío",18);
        
        manoloSL.add(i1);
        manoloSL.add(i2);
        manoloSL.add(i3);
        
        List<Invitado> pizzaSinGluten = new ArrayList <> () ;
        
		Invitado i4=new Invitado("Jorge",23);
		Invitado i5=new Invitado("José Manuel",21);
		Invitado i6=new Invitado("Alonso",19);
        
        pizzaSinGluten.add(i4);
        pizzaSinGluten.add(i5);
        pizzaSinGluten.add(i6);
        
        Collections.sort(manoloSL);
        Collections.sort(pizzaSinGluten);
        
        List<Invitado> fusion = fusionarListas(manoloSL, pizzaSinGluten);

        System.out.println("Lista 1: " + manoloSL);
        System.out.println("Lista 2: " + pizzaSinGluten);
        System.out.println("Lista fusionada ordenada por edad: " + fusion);
    }

	public static <T extends Comparable<T>> List<T> fusionarListas(
	        List<T> lista1, List<T> lista2) {

	    List<T> resultado = new ArrayList<>();
	    int i = 0, j = 0;

	    while (i < lista1.size() && j < lista2.size()) {
	        T elem1 = lista1.get(i);
	        T elem2 = lista2.get(j);

	        if (elem1.compareTo(elem2) <= 0) {
	            resultado.add(elem1);
	            i++;
	        } else {
	            resultado.add(elem2);
	            j++;
	        }
	    }

	    while (i < lista1.size()) {
	        resultado.add(lista1.get(i));
	        i++;
	    }

	    while (j < lista2.size()) {
	        resultado.add(lista2.get(j));
	        j++;
	    }

	    return resultado;
	}


}
