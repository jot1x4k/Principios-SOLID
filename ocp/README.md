# Open/Closed Principle (O)

## Problema

Se tiene una clase **Pago** encargada de gestionar todos los metodos de pago del sistema. Esta estructura viola el principio ya que en caso de que se quiera agregar un nuevo metodo de pago, se debera modificar el codigo base de la clase Pago.

```java
public class Pago {
    public void ProcesarPago(String metodoPago) throws Exception {
        if (metodoPago == "TarjetaCredito") {
            System.out.println("Procesando el pago con tarjeta de credito...");
        } else if (metodoPago == "PayPal") {
            System.out.println("Procesando el pago mediante PayPal...");

        } else if (metodoPago == "Bitcoin") {
            System.out.println("Procesando el pago con criptomonedas...");

        } else {
            throw new Exception("Metodo de pago no valido");
        }
    }
}
```

```java
public static void main(String[] args) {
    Pago pago = new Pago();
    try {
        pago.ProcesarPago("TarjetaCredito");
        pago.ProcesarPago("PayPal");
        pago.ProcesarPago("Bitcoin");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

## Solucion

Se crea una interfaz **IPago** con el metodo `procesarPago()`. Esto permite crear clases que representen un metodo de pago, y que implementen esta interfaz y le den una funcionalidad propia, lo que permite extender la funcionalidad del programa sin la necesidad de modificar codigo existente.

```java
public interface IPago {
    public void ProcesarPago();
}

public class PagoCripto implements IPago {

    @Override
    public void ProcesarPago() {
        System.out.println("Procesando el pago con criptomonedas...");
    }

}

public class PagoPayPal implements IPago {

    @Override
    public void ProcesarPago() {
        System.out.println("Procesando el pago mediante PayPal...");
    }

}

public class PagoTarjetaCredito implements IPago {

    @Override
    public void ProcesarPago() {
        System.out.println("Procesando el pago con tarjeta de credito...");
    }

}
```

```java
public static void main(String[] args) {
    PagoTarjetaCredito tarjetaCredito = new PagoTarjetaCredito();
    PagoCripto cripto = new PagoCripto();
    PagoPayPal paypal = new PagoPayPal();

    tarjetaCredito.ProcesarPago();
    cripto.ProcesarPago();
    paypal.ProcesarPago();
}
```

```console
Procesando el pago con tarjeta de credito...
Procesando el pago con criptomonedas...
Procesando el pago mediante PayPal...
```

