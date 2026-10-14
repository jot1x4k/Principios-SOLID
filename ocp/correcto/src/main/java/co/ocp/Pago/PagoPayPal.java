package co.ocp.Pago;

public class PagoPayPal implements IPago {

    @Override
    public void ProcesarPago() {
        System.out.println("Procesando el pago mediante PayPal...");
    }

}
