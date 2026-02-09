package ud5.ejemplos.telefonos;

public class IPhone extends TelefonoMovil implements ConGPS, ConBluetooth {

    public IPhone(String modelo) {
        super("Apple", modelo);
    }

    @Override
    public void llamar(String numero) {
        System.out.println("iPhone llamando a " + numero);
    }

    @Override
    public void enviarMensaje(String numero, String mensaje) {
        System.out.println("iPhone enviando mensaje: " + mensaje);
    }

    @Override
    public void cargar() {
        System.out.println("Cargando iPhone con Lightning...");
    }

    @Override
    public void activarGPS() {
        System.out.println("GPS activado en iPhone");
    }

    @Override
    public void activarBluetooth() {
        System.out.println("Bluetooth activado en iPhone");
    }
}
