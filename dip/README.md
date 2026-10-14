# Dependency Inversion Principle (D)

## Problema

Se tiene una clase **Orden** que se encarga de procesar una orden y regresar una notificacion. El problema esta en que el metodo de notificacion depende de una unica implementacion, que seria **NotificacionEmail**. Existe un gran acoplamiento ya que si se desea usar otro metodo de notificacion como **NotificacionSMS**, se tendria que modificar la implementacion de la clase Orden.

## Solucion

Se aplica el principio creando una abstraccion intermedia **INotificacion**, asi, podemos crear multiples metodos de notificacion e implementar esta abstraccion intermedia para garantizar el funcionamiento del programa. La clase **Orden** ahora implementa esta abstraccion y no necesita conocer que metodo especifico de notificacion se esta utilizando.
