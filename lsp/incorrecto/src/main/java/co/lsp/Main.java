package co.lsp;

public class Main {
    public static void main(String[] args) {
        Rectangulo rect = new Cuadrado(); 
        
        rect.setAncho(5);
        rect.setAlto(10); 
        
        System.out.println("Area esperada: 50");
        System.out.println("Area calculada: " + rect.CalcularArea()); 
    }
}