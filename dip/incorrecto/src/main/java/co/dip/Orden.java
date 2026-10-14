package co.dip;

public class Orden {
    private NotificacionEmail notificacionEmail;

    public Orden() {
        notificacionEmail = new NotificacionEmail();
    }

    public void ProcesarOrden() {
        System.out.println("Orden procesada!");
        notificacionEmail.EnviarEmail("Orden #123 en camino!");
    }
}
