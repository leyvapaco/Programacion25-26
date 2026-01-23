package ud4.tarea1;

import java.util.Scanner;

import ud4.tarea1.ferroviaria.JefeEstacion;
import ud4.tarea1.ferroviaria.Locomotora;
import ud4.tarea1.ferroviaria.Maquinista;
import ud4.tarea1.ferroviaria.Mecanico;
import ud4.tarea1.ferroviaria.Tren;
import ud4.tarea1.ferroviaria.Vagon;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CuentaCorrienteEj3 cuenta1 = new CuentaCorrienteEj3("Yazmine Lamal", "43215933J");

		
		System.out.println("¿Que actividad desea comprobar? (1-10)");
		int opciones = sc.nextInt();
		
		switch (opciones) {
		case 1:
			
			//ACTIVIDAD 1 
			cuenta1.mostrarInfo();
			
			//INGRESO DE DINERO
			System.out.println("\n----Ingreso 50----");
			cuenta1.ingresar(50);
			System.out.println("Saldo:"+cuenta1.getSaldo());
			
			
			//RETIRO DE DINERO
			System.out.println("\n----Retirada 50 ----");
			if (cuenta1.retirar(50))
			{
				System.out.println("Saldo:"+cuenta1.getSaldo());
			} else
				System.out.println("Operación denegada: Saldo insuficiente");
			
			//RETIRO DE DINERO
			System.out.println("\n----Retirada 50 ----");
			if (cuenta1.retirar(50))
			{
				System.out.println("Saldo:"+cuenta1.getSaldo());
			} else
				System.out.println("Operación denegada: Saldo insuficiente");
			
			//RETIRO DE DINERO
			System.out.println("\n----Retirada 1 ----");
			if (cuenta1.retirar(1))
			{
				System.out.println("Saldo:"+cuenta1.getSaldo());
			} else
				System.out.println("Operación denegada: Saldo insuficiente");
			
			
			//INFORMACIÓN DE LA CUENTA
			System.out.println("\n---Cuenta 1----");
			cuenta1.mostrarInfo();
		
			break;
			
		case 2:
			
			//ACTIVIDAD 2
			CuentaCorrienteEj3 cuenta2 = new CuentaCorrienteEj3(45);
			CuentaCorrienteEj3 cuenta3 = new CuentaCorrienteEj3(30, -10, "13834353X");

			System.out.println("----Cuenta 2----");
			cuenta2.mostrarInfo();
			
			//RETIRO DE DINERO
			System.out.println("\n----Retirada 50 cuenta 2 ----");
			if (cuenta2.retirar(50))
			{
				System.out.println("Saldo:"+cuenta2.getSaldo());
			} else
				System.out.println("Operación denegada: Saldo insuficiente");
			
			
			System.out.println("\n----Cuenta 3----");
			cuenta3.mostrarInfo();
			
			//RETIRO DE DINERO
			System.out.println("\n----Retirada 50 cuenta 3 ----");
			if (cuenta3.retirar(50))
			{
				System.out.println("Saldo:"+cuenta3.getSaldo());
			} else
				System.out.println("Operación denegada: Saldo insuficiente");
			
			break;
			
		case 3:
			
			//ACTIVIDAD 1 
			//cuenta1.saldo=1000;
			//cuenta1.limite=1000;
			cuenta1.nombre="Juan";
			cuenta1.DNI="24.231.231W";
			cuenta1.mostrarInfo();
			break;
			
		case 4:
			
			//ACTIVIDAD 4
			CuentaCorrienteEj3 cuenta5 = new CuentaCorrienteEj3("Juan Alberto", "93254233J");
			System.out.println("Nombre del Banco: "+cuenta5.getBanco());
			
			cuenta5.setBanco("Banca Rota");
			System.out.println("Nombre del Banco: "+cuenta5.getBanco());
			break;
		
		case 5:
			
			//ACTIVIDAD 5
			String cadenaEjemplo = "ola";
			Texto texto1 = new Texto(cadenaEjemplo, 10);
			System.out.println(texto1.toString());
			
			texto1.addCaracterComienzo('M');
			System.out.println(texto1.toString());
			
			texto1.addCaracterFinal('n');
			System.out.println(texto1.toString());
			
			texto1.addCadenaComienzo("Estos");
			System.out.println(texto1.toString());
			
			texto1.addCadenaFinal("Mucho");
			System.out.println(texto1.toString());
			
			System.out.println("Número de vocales: "+texto1.contarVocales(cadenaEjemplo));
			
			break;
			
		
		case 6:
			
			//ACTIVIDAD 6
			
			Banco Banco1 = new Banco("Banca Rota", "Sevilla");
			Banco Banco2 = new Banco("Banco El Palo", "Malaga");
			
			//INFO DE LOS BANCOS
			System.out.println("Nombre del banco: "+Banco1.getNombre());
			System.out.println("Capital: "+Banco1.getCapital());
			System.out.println("Dirección: "+Banco1.getDireccionCentral());
			
			System.out.println("\nNombre del banco: "+Banco2.getNombre());
			System.out.println("Capital: "+Banco2.getCapital());
			System.out.println("Dirección: "+Banco2.getDireccionCentral());
			
			//CAMBIO DE ATRIBUTOS
			Banco1.setCapital(6000000);
			Banco1.setDireccionCentral("Madrid");
			
			//COMPROBACIÓN DEL CAMBIO DE ATRIBUTOS
			System.out.println("\n");
			System.out.println("---ATRIBUTOS CAPITAL Y DIRECCIÓN CAMBIADOS:");
			System.out.println("Capital: "+Banco1.getCapital());
			System.out.println("Dirección: "+Banco1.getDireccionCentral());
			
			CuentaCorrienteEj6 cuenta6 = new CuentaCorrienteEj6("Yazmine Lamal", "43215933J");
			cuenta6.mostrarInfo();//Cuenta no vinculada a banco
			cuenta6.setBanco(Banco1);
			cuenta6.mostrarInfo();
			cuenta6.setBanco(Banco2);
			cuenta6.mostrarInfo();		
			
			break;
			
			
		case 7: 
			
			//ACTIVIDAD 7
			Sintonizador sinto = new Sintonizador();
			
			System.out.println(sinto.display());
			sinto.down(); //LA FRECUENCIA DEBE CAMBIAR A 180
			System.out.println(sinto.display());
			sinto.up(); //LA FRECUENCIA DEBE VOLVER A 80
			System.out.println(sinto.display());
			sinto.up();
			sinto.up();
			sinto.up(); //DESPUES DE 3 SUBIDAS, LA FRECUENCIA DEBE SER DE 81.5
			System.out.println(sinto.display());
			
			break;
			
		case 8:
			
			//ACTIVIDAD 8
			Bombilla bombilla1 = new Bombilla(true);
			Bombilla bombilla2 = new Bombilla(false);
			Bombilla bombilla3 = new Bombilla(true);
			Bombilla bombilla4 = new Bombilla(false);
			
			System.out.println("--PRUEBA GENERAL--");
			bombilla1.getEstado();
			bombilla4.getEstado();
			bombilla3.getEstado();
			bombilla2.getEstado();
			//APAGADO DE LOS PLOMOS
			Bombilla.apagaGeneral();
			
			System.out.println("--PRUEBA CON LOS PLOMOS APAGADOS--");
			bombilla1.getEstado();
			bombilla4.getEstado();
			bombilla3.getEstado();
			bombilla2.getEstado();
			//REPARACIÓN DE LOS PLOMOS
			Bombilla.enciendeGeneral();
			
			System.out.println("--PRUEBA CON LOS PLOMOS REPARADOS--");
			bombilla1.getEstado();
			bombilla4.getEstado();
			bombilla3.getEstado();
			bombilla2.getEstado();
			break;
			
					
		case 10:
			
			//ACTIVIDAD 10
			int hora = 23;
			int minutos = 58;
			int segundos = 50;
			
			Hora hora1 = new Hora(hora, minutos, segundos);
			//Son las 23:58:50 y sumo 9 segundos 
			hora1.sumarSegundos(9);	
			System.out.println("Hora resultante:"+hora1.toString());
			
			//Sumo 2 segundos 
			hora1.sumarSegundos(2);	
			System.out.println("Hora resultante:"+hora1.toString());
			
			//Sumo 60 segundos 
			hora1.sumarSegundos(60);	
			System.out.println("Hora resultante:"+hora1.toString());
			
			//Sumo 60 segundos 
			hora1.sumarSegundos(60);	
			System.out.println("Hora resultante:"+hora1.toString());
			
			break;
		default:
			break;
		}
		
		
		
	sc.close();	
	}
}
