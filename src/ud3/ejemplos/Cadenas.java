package ud3.ejemplos;

public class Cadenas {
public static void main(String[] args) {
	String cad1="Patatas fritas";
	String cad2="Patatas FRITAS";	
	int valor=0;
	
	System.out.println(cad1+" "+cad2);
	
	System.out.println(cad1.length());
	/*
	for (int i=1;i<=cad1.length();i++)
		System.out.println("Hola");*/
	
	System.out.println(cad1.indexOf('a'));
	System.out.println(cad1.lastIndexOf('a'));	
	System.out.println(cad1.charAt(1));
	System.out.println(cad1.substring(8,14));
	System.out.println(cad1.toUpperCase());
	System.out.println(cad1.toLowerCase());
	System.out.println(cad1.equals(cad2));
	System.out.println(cad1.equalsIgnoreCase(cad2));
	System.out.println(cad1.compareToIgnoreCase(cad2));
	cad2=cad1.valueOf(8);
	System.out.println(cad2);
	
}
}
