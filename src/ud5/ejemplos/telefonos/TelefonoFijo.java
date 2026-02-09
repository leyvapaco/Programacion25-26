package ud5.ejemplos.telefonos;

public class TelefonoFijo implements Telefono {

    @Override
    public void llamar(String numero) {
        System.out.println("Teléfono fijo llamando a " + numero);
    }

    @Override
    public void enviarMensaje(String numero, String mensaje) {
        System.out.println("Teléfono fijo enviando mensaje de voz a " + numero);
    }
}
