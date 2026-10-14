package co.isp;

public class Perro implements INada, ICome {

    @Override
    public void Comer() {
        System.out.println("El perro come");
    }

    @Override
    public void Nadar() {
        System.out.println("El perro nada");
    }
    
}
