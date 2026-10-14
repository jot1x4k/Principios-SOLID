package com.dip;

public class NotificacionEmail implements INotificacion {

    @Override
    public void EnviarNotificacion(String mensaje) {
        System.out.println("Email enviado: " + mensaje);
    }
    
}
