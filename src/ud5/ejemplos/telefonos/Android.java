package ud5.ejemplos.telefonos;

public class Android extends TelefonoMovil implements ConGPS, ConBluetooth, PagoNFC {

    public Android(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void llamar(String numero) {
        System.out.println("Android llamando a " + numero);
    }

    @Override
    public void enviarMensaje(String numero, String mensaje) {
        System.out.println("Android enviando mensaje: " + mensaje);
    }

    @Override
    public void cargar() {
        System.out.println("Cargando Android con USB-C...");
    }

    @Override
    public void activarGPS() {
        System.out.println("GPS activado en Android");
    }

    @Override
    public void activarBluetooth() {
        System.out.println("Bluetooth activado en Android");
    }
    
    @Override
    public void activarNFC(){
    	System.out.println("Activando NFC");
    }
    
    
    public boolean pagar(double cantidad) {
    	System.out.println("pagando: "+cantidad+" euros");
    	return true;
    }
    
    public void desactivarNFC() {
    	System.out.println("NFC desactivado en Android");
    }
    
   
}

