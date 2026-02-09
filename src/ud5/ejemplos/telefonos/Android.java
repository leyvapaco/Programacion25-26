package ud5.ejemplos.telefonos;

public class Android extends TelefonoMovil implements ConGPS, ConBluetooth {

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
}

