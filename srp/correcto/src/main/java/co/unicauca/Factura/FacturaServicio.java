package co.unicauca.Factura;

public class FacturaServicio {
    private FacturaGenerador generador;
    private FacturaRepositorio repositorio;
    private FacturaNotificador notificador;

    public FacturaServicio(
        FacturaGenerador generador,
        FacturaRepositorio repositorio,
        FacturaNotificador notificador
    ) {
        this.generador = generador;
        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    public void ProcesarFactura() {
        this.generador.GenerarFactura();
        this.repositorio.GuardarFactura();
        this.notificador.NotificarFactura();
    }
}

