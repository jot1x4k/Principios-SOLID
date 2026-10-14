package com.dip;

public class Orden {
    private INotificacion notificacion;

    public Orden(INotificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void ProcesarOrden() {
        System.out.println("Orden procesada!");
        notificacion.EnviarNotificacion("Orden #123 en camino!");
    }
}
