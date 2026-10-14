# Interface Segregation Principle (I)

## Problema

Se tiene una interfaz **IAnimal** con 3 metodos.

```java
public interface IAnimal {
    void Comer();
    void Volar();
    void Nadar();
}
```

Cualquier objeto que sea una abstraccion de un Animal deberia implementar esta interfaz, por ejemplo, un perro. El problema esta en que se tiene una interfaz con muchas funcionalidades las cuales, no siempre pueden ser utilizadas por un objeto valido. Por ejemplo:

```java
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
```

Como se observa, debido a la gran cantidad de funcionalidad de una sola interfaz, una clase que la implemente puede tener comportamientos erroneos, como el perro que quiere volar.

## Solucion

Podemos separar una interfaz en diferentes interfaces con funcionalidades mas especificas, e implementar unicamente las interfaces que necesitemos en cada clase. Por ejemplo:

### 1. Separar una interfaz grande en multiples interfaces

```java
public interface ICome {
    void Comer();
}

public interface INada {
    void Nadar();
}

public interface IVuela {
    void Volar();
}
```

### 2. Implementar las interfaces que nos importan

```java
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
```


