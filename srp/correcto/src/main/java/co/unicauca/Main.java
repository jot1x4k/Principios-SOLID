package co.unicauca;

import co.unicauca.Factura.FacturaGenerador;
import co.unicauca.Factura.FacturaNotificador;
import co.unicauca.Factura.FacturaRepositorio;
import co.unicauca.Factura.FacturaServicio;

public class Main {
    public static void main(String[] args) {
        FacturaGenerador generador = new FacturaGenerador();
        FacturaRepositorio repositorio = new FacturaRepositorio();
        FacturaNotificador notificador = new FacturaNotificador();
        FacturaServicio servicio = new FacturaServicio(generador, repositorio, notificador);

        servicio.ProcesarFactura();
    }
}