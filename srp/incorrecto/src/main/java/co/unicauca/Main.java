package co.unicauca;

public class Main {
    public static void main(String[] args) {
        Factura fact = new Factura();

        fact.GenerarFactura();
        fact.GuardarFactura();
        fact.NotificarFactura();
    }
}