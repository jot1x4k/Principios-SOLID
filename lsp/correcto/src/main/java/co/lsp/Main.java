package co.lsp;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura cuadrado = new Cuadrado(10);

        System.out.println("Areas calculadas");
        System.out.println("Cuadrado: " +cuadrado.CalcularArea());
        System.out.println("Rectangulo: " +rectangulo.CalcularArea());
    }
}