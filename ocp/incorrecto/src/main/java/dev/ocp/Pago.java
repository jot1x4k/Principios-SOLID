package dev.ocp;

public class Pago {
    public void ProcesarPago(String metodoPago) throws Exception {
        if (metodoPago == "TarjetaCredito") {
            System.out.println("Procesando el pago con tarjeta de credito...");
        } else if (metodoPago == "PayPal") {
            System.out.println("Procesando el pago mediante PayPal...");

        } else if (metodoPago == "Bitcoin") {
            System.out.println("Procesando el pago con criptomonedas...");

        } else {
            throw new Exception("Metodo de pago no valido");
        }
    }
}
