package co.isp;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Pajaro pajaro = new Pajaro();

        perro.Comer();
        perro.Nadar();

        pajaro.Comer();
        pajaro.Volar();
    }
}