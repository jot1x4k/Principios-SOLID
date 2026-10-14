package com.dip;

public class NotificacionSMS implements INotificacion {

    @Override
    public void EnviarNotificacion(String mensaje) {
        System.out.println("SMS enviado: " + mensaje);
    }

}
