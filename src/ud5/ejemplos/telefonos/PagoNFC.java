package ud5.ejemplos.telefonos;

/**
 * Interfaz simple para realizar pagos mediante NFC.
 */
public interface PagoNFC {

    /**
     * Activa el chip NFC del dispositivo.
     */
    void activarNFC();

    /**
     * Realiza un pago acercando el dispositivo a un terminal compatible.
     *
     * @param cantidad monto a pagar.
     * @return true si el pago fue exitoso, false si falló.
     */
    boolean pagar(double cantidad);

    /**
     * Desactiva el chip NFC después del uso.
     */
    void desactivarNFC();
}
