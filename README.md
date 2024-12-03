Patrones de Comportamiento
- Observer: Define una relación de uno a muchos entre objetos, de manera que cuando un objeto cambia de estado, todos sus dependientes son notificados y actualizados automáticamente. Es común en sistemas de notificación.
- Strategy: Permite definir una familia de algoritmos y hace que sean intercambiables sin cambiar el contexto que los usa. Es útil cuando se necesita cambiar el comportamiento de un algoritmo en tiempo de ejecución.
- Command: Encapsula una petición como un objeto, lo que permite parametrizar los clientes con colas, solicitudes y operaciones. Es útil en la creación de deshacer y rehacer en aplicaciones.
- Template Method: Define el esqueleto de un algoritmo en la superclase, pero permite que las subclases reemplacen ciertos pasos sin cambiar la estructura del algoritmo.
- Mediator: Reduce la complejidad de la comunicación entre múltiples objetos al hacer que se comuniquen a través de un mediador central en lugar de referirse entre sí directamente.
- Chain of Responsibility: Permite que un objeto pase una petición a una cadena de objetos hasta que uno de ellos la maneje. Es útil en sistemas de manejo de eventos o solicitudes.
- State: Permite que un objeto altere su comportamiento cuando su estado interno cambia. Es útil cuando un objeto debe cambiar su comportamiento basado en su estado.
