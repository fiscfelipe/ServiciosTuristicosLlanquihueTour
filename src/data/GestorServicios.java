package data;

import model.*;
/**
 * Clase que se utiliza para generar objetos de prubea para la clases que heredan de ServicioTuristico.
 */
public class GestorServicios {

    public static void mostrarServiciosDePrueba() {

        RutaGastronomica ruta1 = new RutaGastronomica("Ruta Sabores del Lago", 4, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta Gastronómica Frutillar", 3, 4);

        PaseoLacustre paseo1 = new PaseoLacustre("Paseo por el Lago Llanquihue", 2, "Lancha");
        PaseoLacustre paseo2 = new PaseoLacustre("Navegación Puerto Varas", 3, "Catamaran");

        ExcursionCultural excursion1 = new ExcursionCultural("Excursión Museo Colonial Alemán", 2, "Museo Colonial Alemán");
        ExcursionCultural excursion2 = new ExcursionCultural("Tour Histórico Puerto Octay", 3, "Centro histórico de Puerto Octay");

        System.out.println("\n=== SERVICIOS TURÍSTICOS ===");

        System.out.println("\n--- Ruta gastronómica 1 ---");
        System.out.println(ruta1);

        System.out.println("\n--- Ruta gastronómica 2 ---");
        System.out.println(ruta2);

        System.out.println("\n--- Paseo lacustre 1 ---");
        System.out.println(paseo1);

        System.out.println("\n--- Paseo lacustre 2 ---");
        System.out.println(paseo2);

        System.out.println("\n--- Excursión cultural 1 ---");
        System.out.println(excursion1);

        System.out.println("\n--- Excursión cultural 2 ---");
        System.out.println(excursion2);
    }
}