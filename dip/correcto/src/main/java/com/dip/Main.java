package com.dip;

public class Main {
    public static void main(String[] args) {
        INotificacion emailNotificacion = new NotificacionEmail();
        INotificacion smsNotificacion = new NotificacionSMS();

        Orden orden = new Orden(emailNotificacion);
        orden.ProcesarOrden();


        Orden smsOrden = new Orden(smsNotificacion);
        smsOrden.ProcesarOrden();
    }
}