package dev.ocp;

public class Main {
    public static void main(String[] args) {
        Pago pago = new Pago();
        try {
            pago.ProcesarPago("TarjetaCredito");
            pago.ProcesarPago("PayPal");
            pago.ProcesarPago("Bitcoin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}