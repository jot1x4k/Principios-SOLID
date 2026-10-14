# Single Responsability Principle

## Problema

Se tiene una clase **Factura**, la cual tiene multiples responsablidades, por ejemplo:

1. Generar la factura.
2. Guardar la factura generada en la base de datos.
3. Notificar al cliente enviando la factura por correo electronico.

```java
public class Factura {
    public void GenerarFactura() {
        System.out.println("Generando factura...");
    }

    public void GuardarFactura() {
        System.out.println("Guardando factura en la base de datos...");
    }

    public void NotificarFactura() {
        System.out.println("Enviando factura por correo electronico...");
    }
}
```

```java
public static void main(String[] args) {
    Factura fact = new Factura();

    fact.GenerarFactura();
    fact.GuardarFactura();
    fact.NotificarFactura();
}
```

Cualquiera de estas 3 funcionalidades puede tener mas de una razon para cambiar, por ejemplo, si se modifico el esquema de la base de datos, o si el sistema de notificacion de correo electronico requiere un cambio de formato.

## Solucion

Se deben separar las responsablidades en diferentes clases, que se pueden orquestar mediante una sola clase. Pasamos de tener una sola clase **Factura**, la cual se encargaba de todo, a tener una estructura por capas donde cada clase realiza una y solo una labor.

1. **FacturaGenerador**: Implementacion de la generacion de la factura.
2. **FacturaRepositorio**: Implementacion del acceso a la base de datos.
3. **FacturaNotificador**: Implementacion de la notificacion de la factura.
4. **FacturaServicio**: Orquesta las diferentes capas.

```java
public class FacturaGenerador {
    public void GenerarFactura() {
        System.out.println("Generando factura...");
    }
}

public class FacturaRepositorio {
    public void GuardarFactura() {
        System.out.println("Guardando factura en la base de datos...");
    }
}

public class FacturaNotificador {
    public void NotificarFactura() {
        System.out.println("Enviando factura por correo electronico...");
    }
}

public class FacturaServicio {
    private FacturaGenerador generador;
    private FacturaRepositorio repositorio;
    private FacturaNotificador notificador;

    public FacturaServicio(
        FacturaGenerador generador,
        FacturaRepositorio repositorio,
        FacturaNotificador notificador
    ) {
        this.generador = generador;
        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    public void ProcesarFactura() {
        this.generador.GenerarFactura();
        this.repositorio.GuardarFactura();
        this.notificador.NotificarFactura();
    }
}
```

```java
public static void main(String[] args) {
    FacturaGenerador generador = new FacturaGenerador();
    FacturaRepositorio repositorio = new FacturaRepositorio();
    FacturaNotificador notificador = new FacturaNotificador();
    FacturaServicio servicio = new FacturaServicio(generador, repositorio, notificador);

    servicio.ProcesarFactura();
}
```

```console
Generando factura...
Guardando factura en la base de datos...
Enviando factura por correo electronico...
```
