package ud5.ejemplos.telefonos;

/**
 * Interfaz simple para realizar pagos mediante NFC.
 */
public interface PagoNFC {

    /**
     * Activa el chip NFC del dispositivo.
     */
    public void activarNFC();

    /**
     * Realiza un pago acercando el dispositivo a un terminal compatible.
     *
     * @param cantidad monto a pagar.
     * @return true si el pago fue exitoso, false si falló.
     */
    public boolean pagar(double cantidad);

    /**
     * Desactiva el chip NFC después del uso.
     */
    public void desactivarNFC();
}
