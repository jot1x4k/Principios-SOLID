package co.isp;

public class Pajaro implements ICome, IVuela {

    @Override
    public void Volar() {
        System.out.println("El pajaro vuela");
    }

    @Override
    public void Comer() {
        System.out.println("El pajaro come");
    }
    
}
