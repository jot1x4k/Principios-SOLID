package co.isp;

public class Perro implements IAnimal {

    @Override
    public void Comer() {
        System.out.println("El perro come");
    }

    @Override
    public void Volar() {
        throw new UnsupportedOperationException("Un perro no puede volar.");
    }

    @Override
    public void Nadar() {
        System.out.println("El perro esta nadando");
    }
    
}
