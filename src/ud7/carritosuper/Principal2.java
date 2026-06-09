package ud7.carritosuper;


import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import java.io.File;


public class Principal2 {
		
	public static void main(String[] args) {
		
		Set <Cliente> clientes =new TreeSet<Cliente>();
		List <Articulo> articulos =new LinkedList<Articulo>();
		Map <Integer,String> cp= new HashMap<Integer,String>();
		Stack <String> domicilio =  new Stack<String>();
		
		Cliente c1=new Cliente("Juan",23);
		Cliente c2=new Cliente("Ana",24);
		
		
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
	    try {
	        SAXParser saxParser = saxParserFactory.newSAXParser();
	        MyHandler handler = new MyHandler();
	        saxParser.parse(new File("C:\\Users\\leyva\\eclipse-workspace\\daw1\\src\\u7\\carritosuper\\Articulos.XML"), handler);
	        //Get Employees list
	        List<Articulo> artList = handler.getArtList();
	        //print employee information
	        for(Articulo art : artList) {
	            System.out.println(art);
	            articulos.add(art);}
	    } catch (ParserConfigurationException | SAXException | IOException e) {
	        e.printStackTrace();
	    }
	    
			/*
			
		Articulo a1=new Articulo("001","Lápiz",4.50);
		Articulo a2=new Articulo("002","Goma",3.20);
		Articulo a3=new Articulo("003","Sacapuntas",2.70);
		
		*/
			
		clientes.add(c1);
		clientes.add(c2);	
		clientes.add(c2); //duplicado
		System.out.println(clientes);
/*
		articulos.add(a3);
		articulos.add(a1);
		articulos.add(a2);*/
		System.out.println(articulos);

		cp.put(41927,"Mairena del Aljarafe");
		cp.put(41950,"Castilleja de la Cuesta");
		cp.put(41110,"Bollullos de la Mitación");
		System.out.println(cp);
		
		domicilio.push("1ºF");
		domicilio.push("Nº12");
		domicilio.push("Avda Pablo Picasso");
		domicilio.push("Mairena del Aljarafe");

		
		System.out.println(domicilio.pop());
		System.out.println(domicilio);
		System.out.println(domicilio.peek());//Muestra el tope de la pila
		
						
		System.out.println("\n-1-----------\n");		
		Iterator<Cliente> it = clientes.iterator();
		
	    while(it.hasNext()) {
	      Cliente obj = (Cliente) it.next();
	      System.out.println(obj);
	    }
	    
		
		System.out.println("\n-2----------\n");	
		Iterator<Articulo> it2 = articulos.iterator();
		 
	    while(it2.hasNext()) {
	      Articulo obj = (Articulo) it2.next();
	      System.out.println(obj);
	    }
			    
        //Iterador de mapa
		System.out.println("\n-3-----------\n");	
		Iterator<Map.Entry<Integer,String>> it3 = cp.entrySet().iterator();
		 
	    while(it3.hasNext()) {
	      Map.Entry <Integer,String> entry = it3.next();
	      System.out.println("Clave: "+entry.getKey()+" Valor: "+entry.getValue());
	    }

	    System.out.println("\n-4-----------\n");
	    Carrito carrito=new Carrito(c1,cp.get(41927),domicilio);
	    carrito.add_articulos(articulos);
	    System.out.println(carrito.toString());
		
	}

}
