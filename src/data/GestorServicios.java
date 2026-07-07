package data;

import model.*;
import java.util.*;
        
/**
 * Clase que se utiliza para generar objetos de prubea para la clases que heredan de ServicioTuristico.
 */
public class GestorServicios {
    
    private List<ServicioTuristico> servicios = new ArrayList<>();
   
    public GestorServicios() {
        cargarServicios();
    }
    
    private void cargarServicios() {
        
        servicios.add(new RutaGastronomica("Ruta Sabores del Lago", 4, 5));
        servicios.add(new RutaGastronomica("Ruta Gastronómica Frutillar", 3, 4));
        
        servicios.add(new PaseoLacustre("Paseo por el Lago Llanquihue", 2, "Lancha"));
        servicios.add(new PaseoLacustre("Navegación Puerto Varas", 3, "Catamaran"));
        
        servicios.add(new ExcursionCultural("Excursión Museo Colonial Alemán", 2, "Museo Colonial Alemán"));
        servicios.add(new ExcursionCultural("Tour Histórico Puerto Octay", 3, "Centro histórico de Puerto Octay"));
        
    }

    public void mostrarServicios() {

        System.out.println("\n=== SERVICIOS TURÍSTICOS ===");

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
            System.out.println();
        }
    }
}
