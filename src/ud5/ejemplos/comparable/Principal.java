package ud5.ejemplos.comparable;

import java.util.Arrays;



public class Principal {
public static void main(String[] args) {
	
	final int MAX_CLI=5;
	Cliente[] clientes= new Cliente[MAX_CLI];
	
	Cliente cli1=new Cliente("23.346.431B","Berta",21,100.0);	
	Cliente cli2=new Cliente("23.346.431A","Charo",19,200.0);
	Cliente cli3=new Cliente("23.346.431C","Alonso",23,300.0);
	Cliente cli4=new Cliente("23.346.431D","Darío",14,400.0);
	Cliente cli5=new Cliente("23.346.431E","Eva",25,500.0);

	clientes[0]=cli1;
	clientes[1]=cli2;
	clientes[2]=cli3;
	clientes[3]=cli4;
	clientes[4]=cli5;
	
	// Probamos el equals con dos clientes
	boolean sonIguales;	
	sonIguales=cli1.equals(cli2);	
	System.out.println(sonIguales);
		
	// Probamos el compareTo que implementa Comparable directamente sobre 2 objetos
	System.out.println(cli4.compareTo(cli5));
	
	// Mostramos array en el orden natural (el introducido)
	System.out.println(Arrays.toString(clientes));
		
		
	// Usando COMPARABLE: Mostramos array en el orden definido por el compareTo de la clase Cliente (por DNI)
	Arrays.sort(clientes);
	System.out.println(Arrays.toString(clientes));
	
	Producto p1=new Producto("Martillo",3.50);
	Producto p2=new Producto("Clavo",0.15);
	System.out.println("Este es el producto más caro:");
	System.out.println(p1.compareTo(p2)>0?p1.nombre:p2.nombre);

	// Usando COMPARATOR:Comparamos por DNI y mostramos array
	
	ClienteDNIComparator comparadorDNI= new ClienteDNIComparator();

	Arrays.sort(clientes,comparadorDNI);
	
	System.out.println(Arrays.toString(clientes));
	
		
	//Usando COMPARATOR: Comparamos por edad y mostramos array
	
	ClienteEdadComparator comparadorEdad= new ClienteEdadComparator();

	Arrays.sort(clientes,comparadorEdad);
	
	System.out.println(Arrays.toString(clientes));

	// Usando COMPARATOR:Comparamos por nombre y mostramos array
	
	ClienteNombreComparator comparadorNombre= new ClienteNombreComparator();

	Arrays.sort(clientes,comparadorNombre);
	
	System.out.println(Arrays.toString(clientes));
	
	System.out.println(Arrays.toString(clientes));
	System.out.println("\n****Lista de clientes mayores de edad*****");
	
	for(Cliente cli:clientes) {
	
	System.out.println( cli.getEdad()>18 ? cli.toString(): "---menor de edad----"); //Mostramos solo los mayores de edad
	// System.out.println(cli.toString());} //cli es un elemento del array de clientes
	}
		
}
}
