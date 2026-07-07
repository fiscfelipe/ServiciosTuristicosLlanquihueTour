# LlanquihueTourApp

## Descripción del objetivo semanal

Esta actualización del proyecto incorpora el uso de **polimorfismo** y **colecciones genéricas** para gestionar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

Se implementó el método abstracto `mostrarInformacion()` en la superclase `ServicioTuristico`, el cual fue sobrescrito por las subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`, permitiendo que cada una muestre su información específica.

Además, se creó una colección de tipo `List<ServicioTuristico>` para almacenar objetos de las diferentes subclases en una misma estructura de datos. Finalmente, la colección es recorrida mediante un ciclo `for-each`, invocando el método `mostrarInformacion()` desde referencias de la superclase, demostrando la aplicación del polimorfismo.

---

## Estructura del proyecto

```
src
├── ui
│   └── Main.java
├── data
│   └── GestorServicios.java
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   ├── ExcursionCultural.java
│   ├── Persona.java
│   ├── ProveedorAlojamiento.java
│   ├── ProveedorTransporte.java
│   ├── Direccion.java
│   ├── Rut.java
│   ├── Correo.java
│   ├── Patente.java
│   ├── Vehiculo.java
│   └── Alojamiento.java
├── service
│   └── RegistroService.java
├── util
│   ├── CorreoInvalidoException.java
│   ├── PatenteInvalidaException.java
│   └── RutInvalidoException.java
└── resources
    └── registro.txt
```
---

## Clases modificadas

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
2. Ejecutar la clase `Main`, ubicada en el paquete `ui`.
3. El programa mostrará por consola un menú interactivo con 8 opciones, 7 correspondientes a lo acumulado a través del bimestre y una nueva opción (opción 7)    la cual muestra la lista creada esta semana.
4. Seleccionar la opción 7 para ver la lista.

---

## Autor

Felipe Saldías

Estudiante de la carrera de Analista Programador Computacional en DuocUC
