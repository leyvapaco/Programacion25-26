package ud6.fiesta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Fiesta {
	
	public static void imprimir(List<Invitado> lista) {
        for (Invitado elemento : lista)
            System.out.print(elemento.toString()+"\n");
        System.out.println();
    }
	
	public static void imprimirOrdenadaAscendente(List<Invitado>  lista) {
        Collections.sort(lista);
        imprimir(lista);
    }
	
	public static void imprimirOrdenadaDescendente(List<Invitado>  lista) {
        Collections.sort(lista,Collections.reverseOrder());
        imprimir(lista);
    }
	
	
	public static void main(String[] args) {
		
		Invitado [] miArrayInvitados =new Invitado[3];
		List <Invitado> miListaInvitados =new ArrayList<Invitado>();
		
		Invitado p1=new Invitado("Mario",21);
		Invitado p2=new Invitado("Ana",20);
		Invitado p3=new Invitado("Rocío",18);
		 
		//Añado los invitados a un array
		miArrayInvitados[0]=p1;
		miArrayInvitados[1]=p2;
		miArrayInvitados[2]=p3;
		
		//Añado también los invitados a una lista
		miListaInvitados.add(p1);
		miListaInvitados.add(p2);
		miListaInvitados.add(p3);
		
		//Convertir una lista en un set. LinkedHashSet respeta el orden de inserción
	    System.out.println("\n¿En qué orden se han apuntado mis invitados?");
		Set <Invitado> miLinkedHashSetInvitados =new LinkedHashSet<>(miListaInvitados);
		System.out.println(miLinkedHashSetInvitados);
		
		//Dice Ana que si Héctor no va, ella tampoco. Y además, que debe ser el primero de la lista.
		Invitado p4=new Invitado("Héctor",19);
		
		//Crear una Lista enlazada a partir de un Array:
		LinkedList <Invitado> miLinkedListInvitados =new LinkedList<Invitado>(Arrays.asList(miArrayInvitados));
		
		miLinkedListInvitados.addFirst(p4);
		
		System.out.println("\nITERO EL ARRAY POR INDICE DE ELEMENTOS");	
		for (int i=0; i<miArrayInvitados.length; i++)
			System.out.println(miArrayInvitados[i].getNombre());
		
		//Cuatro formas equivalentes de iterar por una lista:
		
		//UNO
		System.out.println("\nITERO LA LISTA POR INDICE DE ELEMENTOS");	
		System.out.println("\nBUCLE CLASICO:");	
		for (int i=0; i<miListaInvitados.size(); i++)
			System.out.println(miListaInvitados.get(i).getNombre());
		
		//DOS
		System.out.println("\nFOR EACH  - me permitirá iterar por valores:");	
		for (Invitado inv:miListaInvitados)
			System.out.println(inv.getNombre());
	
		//TRES
		System.out.println("\nEquivalente a lo anterior: Expresión LAMBDA FOR EACH:");    
	    miListaInvitados.forEach(inv -> System.out.println(inv.getNombre()));

	    //CUATRO
	    System.out.println("\nUso un ITERATOR - me permitirá iterar por valores");    
	    Iterator<Invitado> it = miListaInvitados.iterator();

	    while (it.hasNext()) {
	        Invitado inv = it.next();
	        System.out.println(inv.getNombre());
	    }
	    
	    //Probamos los métodos para imprimir una lista
	    
		System.out.println("\n\n------------ArrayList:");	
		imprimir(miListaInvitados);
		
		System.out.println("------------ArrayList (ordenado ascendente):");	
		
		imprimirOrdenadaAscendente(miListaInvitados);
		
		System.out.println("------------ArrayList (ordenado descendente):");	
		
		imprimirOrdenadaDescendente(miListaInvitados);
		
		System.out.println("------------LinkedList:");	
		imprimir(miLinkedListInvitados);

		System.out.println("------------LinkedList (ordenado ascendente):");
		imprimirOrdenadaAscendente(miLinkedListInvitados);
		
		System.out.println("------------LinkedList (ordenado descendente):");
		imprimirOrdenadaDescendente(miLinkedListInvitados);
		
		
		System.out.println("------------TreeSet (invitados ordenados por edad):");
		Set <Invitado> miTreeSetInvitados =new TreeSet<Invitado>(miLinkedListInvitados);
		System.out.println(miTreeSetInvitados);
		
		//¿Puedo añadir de nuevo a Héctor al SET?
		System.out.println("¿Puedo añadir de nuevo a Héctor al SET?:"+miTreeSetInvitados.add(p4));
						
	    System.out.println("\n¿Está invitado Mario?:"+miTreeSetInvitados.contains(p1));   
	    
	    System.out.println("\nRocío dice que al final no viene que tiene mucho que estudiar, así queda la fiesta:");
	    miTreeSetInvitados.remove(p3); 
	    System.out.println(miTreeSetInvitados);
	    
	    System.out.println("\n¿Hay algún invitado que se llame Ana?");
	    Iterator<Invitado> it2 = miListaInvitados.iterator();

	    //En un SET, no podemos comparar por índice, debemos hacerlo por valor
	    while (it2.hasNext()) {
	        Invitado inv = it2.next();
	        if (inv.getNombre().equals("Ana"))
	        	System.out.println("sí");
	    }	
	}

}
