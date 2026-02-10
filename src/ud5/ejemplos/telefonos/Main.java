package ud5.ejemplos.telefonos;

public class Main {
    public static void main(String[] args) {

    	Android android = new Android("Samsung", "Galaxy S24");
        IPhone iphone = new IPhone("iPhone 15");
        Telefono fijo = new TelefonoFijo();

        android.encender();
        android.llamar("123456789");
        android.cargar();
        ((ConGPS) android).activarGPS();
        ((ConBluetooth) android).activarBluetooth();

        System.out.println();

        iphone.encender();
        iphone.enviarMensaje("987654321", "Hola!");
        iphone.cargar();
        ((ConGPS) iphone).activarGPS();
        ((ConBluetooth) iphone).activarBluetooth();

        System.out.println();

        fijo.llamar("111222333");
        fijo.enviarMensaje("111222333", "Mensaje desde fijo");
        
        PilaTelefonos bote=new PilaTelefonos(10);
        
        //Pila de teléfonos móviles 
        bote.push(iphone);
        bote.push(android);
        System.out.println("Cima del bote:"+bote.peek().toString());
        
    }
}
