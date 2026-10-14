package co.ocp;

import co.ocp.Pago.PagoCripto;
import co.ocp.Pago.PagoPayPal;
import co.ocp.Pago.PagoTarjetaCredito;

public class Main {
    public static void main(String[] args) {
        PagoTarjetaCredito tarjetaCredito = new PagoTarjetaCredito();
        PagoCripto cripto = new PagoCripto();
        PagoPayPal paypal = new PagoPayPal();

        tarjetaCredito.ProcesarPago();
        cripto.ProcesarPago();
        paypal.ProcesarPago();
    }
}