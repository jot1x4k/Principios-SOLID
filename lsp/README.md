# Liskov Substitution Principle (L)

## Problema

Se tiene una clase superior **Rectangulo** y una subclase **Cuadrado** con la que se intenta el reemplazo de objetos siguiendo el principio. El problema radica en que la subclase tendra un comportamiento erroneo, pues la clase superior rectangulo puede tener diferentes valores para el ancho y alto, sin embargo el cuadrado no y esto provoca una violacion del principio.

```java
public static void main(String[] args) {
    Rectangulo rect = new Cuadrado(); 
    
    rect.setAncho(5);
    rect.setAlto(10); 
    
    System.out.println("Area esperada: 50");
    System.out.println("Area calculada: " + rect.CalcularArea()); 
}
```

```console
Area esperada: 50
Area calculada: 100.0
```

## Solucion

Se mejora la estructura del proyecto agregando la clase abstracta **Figura**, lo que nos ayuda a resolver el problema de jerarquias entre **Rectangulo** y **Cuadrado**. Ahora ambas clases heredan de **Figura**, pero ambas operan de manera independiente lo que permite asignar comportamientos especificos a cada clase.

```java
public static void main(String[] args) {
    Figura rectangulo = new Rectangulo(5, 10);
    Figura cuadrado = new Cuadrado(10);

    System.out.println("Areas calculadas");
    System.out.println("Cuadrado: " +cuadrado.CalcularArea());
    System.out.println("Rectangulo: " +rectangulo.CalcularArea());
}
```

```console
Areas calculadas
Cuadrado: 100.0
Rectangulo: 50.0
```

