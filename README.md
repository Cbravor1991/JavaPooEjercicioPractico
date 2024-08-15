## JAVA PROGRAMACIÓN ORIENTADA A OBJETOS
Se realiza una prueba técnica para un puesto trainee/junior en la cual se debe utilizar programación
orientada a objetos para modelar un problema relacionado con una empresa de turismo.


## Consigna
Nos solicitaron crear la estructura básica en el paradigma de programación orientada a objetos para una aplicación.

Los productos que ofrece la empresa son los siguientes:
- Vuelos.
- Alojamientos.
- Paquetes compuestos por múltiples viajes, alojamientos u otros paquetes.

De los vuelos nos interesa saber la fecha de ida, la fecha de vuelta (si corresponde) y la aerolínea en la que se viajará.

Los alojamientos pueden ser Hoteles o Casas/Departamentos. De ambos tipos de alojamiento sabemos su dirección y además:
- de los hoteles sabemos su nombre y su cantidad de estrellas.
- de las Casas y Departamentos sabemos la cantidad de ambientes.

De cada usuario conoceremos:
- Su nombre de usuario.
- Su presupuesto.
- Los productos que compró.

Cada usuario debe poder intentar contratar un producto. En caso que su presupuesto no lo permita se deberá notificar que no es posible. En caso que sí:
- se deberá almacenar el producto entre los adquiridos por el usuario.
- se deberá descontar el valor del producto de su presupuesto.

El precio de los productos está determinado de la siguiente forma:
- Los Viajes tienen un precio que es establecido por cada uno.
- Los Hoteles tienen un precio de $10.000 por estrella por cantidad de noches.
- Las Casas y Departamentos siguen la siguiente lógica:
    - Monoambientes: $15.000 por noche.
    - Entre 2 y 4 ambientes: $30.000 por noche.
    - Más de 4 ambientes: $50.000 por noche.

Existe un tipo de casa específico, las cabañas. Su particularidad es que se componen por múltiples casas y se pueden alquilar de manera individual o grupal. En caso de optar por la última opción, el usuario tendrá 10% de descuento por casa. Como máximo podrá acceder a un 50% de descuento.

Por otro lado, la aplicación debería poder brindar la siguiente información:
- Los nombres de usuario ordenados por cantidad de productos adquiridos de manera decreciente.

Bonús: Saber qué productos puede adquirir un usuario en base a su presupuesto.

