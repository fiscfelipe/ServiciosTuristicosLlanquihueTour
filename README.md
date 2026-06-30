# # LlanquihueTourApp

## Descripción del objetivo semanal

Esta actualización del proyecto incorpora una jerarquía de clases mediante herencia simple para representar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

Se implementó una superclase llamada `ServicioTuristico`, que reúne los atributos comunes de todos los servicios, y tres subclases que representan distintos tipos de actividades turísticas:

- RutaGastronomica
- PaseoLacustre
- ExcursionCultural

Cada subclase hereda los atributos de la superclase, utiliza `super(...)` en su constructor y sobrescribe el método `toString()` para mostrar su información específica.

---

## Clases creadas

### Paquete `model`

- `ServicioTuristico`
- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`

### Paquete `data`

- `GestorServicios`

---

## Instrucciones de ejecución

1. Abrir el proyecto **LlanquihueTourApp** en NetBeans.
2. Ejecutar la clase `Main`, ubicada en el paquete `app`.
3. El programa mostrará por consola un menú interactivo con 8 opciones, 7 correspondientes a lo acumulado a través del bimestre y una nueva opción (opción 7)    la cual muestra objetos de prueba de las clases creadas esta semana.
4. Seleccionar la opción 7 para ver los ejemplos.
