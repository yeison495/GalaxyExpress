// librerias importadas

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// simulador de viaje intergalactivo GalaxyExpress

public class App {

    // variable scanner global
    static Scanner sc = new Scanner(System.in);

    // metodo principal
    public static void main(String[] args) throws Exception {
        // inicio de simulador        
        System.out.println("---------------------------------------------------------------");
        System.out.println("-----------------Bienvenido a Galaxy Express-------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("-Su mejor opcion a la hora de realizar viajes interplanetarios-");
        System.out.println("---------------------------------------------------------------");
        // creacion e inicializacion de variables
        var select = 0;
        // creacion de mapas
        Map<String, Integer> pla = planetMap();
        Map<String, Integer> nav = spaceshipMap();
        boolean ok = false;
        // ciclo para la verificar errores        
        do {
            try {
                select = menu();
                ok = true;
                switch (select) {
                    case 1 ->
                        viewPlanet();
                    case 2 ->
                        viewSpaceship();
                    case 3 ->
                        managerTrip(pla, nav);
                    case 4 ->
                        System.out.println();
                    case 5 ->
                        System.out.println("\n*Al infinito y mas allá...BYE*\n");
                    default ->
                        System.out.println("\nSeleccion invalida\n");
                }
            } catch (Exception e) {
                System.out.println("La opción debe ser numerica...");
                sc.nextLine();
            }
        } while (!ok || select != 5);
    }

    // metodo para menu principal
    public static Integer menu() {
        boolean ok = false;
        var selection = 0;
        // ciclo para la verificar errores        
        do {
            System.out.println("\n-MENU-");
            System.out.println("\n1.Destinos\n2.Naves\n3.Gestionar Viaje\n4.Comenzar Viaje\n5.Salir\n");
            System.out.println("-------------------------------------------");
            System.out.print("\nSeleccione su opcion de preferencia: ");
            try {
                selection = sc.nextInt();
                ok = true;
            } catch (Exception e) {
                System.out.println("La opción debe ser numerica...");
                sc.nextLine();
            }
        } while (!ok);
        return selection;
    }

    // metodo creacion mapa de planetas
    public static Map<String, Integer> planetMap() {
        // mapa de planetas
        Map<String, Integer> planetMap = new HashMap<>();
        planetMap.put("Mercurio", 222);
        planetMap.put("Venus", 261);
        planetMap.put("Marte", 401);
        planetMap.put("Júpiter", 968);
        planetMap.put("Saturno", 1660);
        planetMap.put("Urano", 3151);
        planetMap.put("Neptuno", 4700);
        return planetMap;
    }

    // metodo para visualizar detalles de planetas
    public static void viewPlanet() {
        // variable scanner
        var selection = 0;
        boolean ok = false;
        System.out.println("-------------------------------------------");
        System.out.println("-DETALLES DE DESTINOS-");
        //bucle de seleccion 
        do {
            try {
                System.out.println("-------------------------------------------");
                System.out.println("\n1.Mercurio\n2.Venus\n3.Marte\n4.Júpiter\n5.Saturno\n6.Urano\n7.Neptuno\n8.Volver\n");
                System.out.println("-------------------------------------------");
                System.out.print("\nPor favor, seleccione un destino para saber mas detalles: ");
                selection = sc.nextInt();
                ok = true;
                // switch para eleccion de planeta
                switch (selection) {
                    case 1 ->
                        System.out.println("\nMercurio:\nEs el planeta más cercano al Sol y el más pequeño del sistema solar.\nDistancia= 222mill Km");
                    case 2 ->
                        System.out.println("\nVenus:\nEs el planeta más caliente debido a su densa atmósfera de dióxido de carbono que genera un efecto invernadero extremo.\nDistancia= 261mill Km");
                    case 3 ->
                        System.out.println("\nMarte:\nConocido como el \\\"planeta rojo\\\" por su superficie cubierta de óxido de hierro.\nDistancia= 401mill Km");
                    case 4 ->
                        System.out.println("\nJúpiter:\nEs el planeta más grande del sistema solar y está compuesto mayormente de hidrógeno y helio.\nDistancia= 968mill Km");
                    case 5 ->
                        System.out.println("\nSaturno:\nFamoso por sus impresionantes anillos compuestos de hielo y roca.\nDistancia= 1660mill Km");
                    case 6 ->
                        System.out.println("\nUrano:\nEs un gigante helado con una atmósfera de metano, lo que le da su característico color azul verdoso.\nDistancia= 3151mill Km");
                    case 7 ->
                        System.out.println("\nNeptuno:\nEs conocido por sus fuertes vientos y tormentas.\nDistancia= 4700mill Km");
                    case 8 ->
                        System.out.println("\nUsted ha seleccionado volver");
                    default ->
                        System.out.println("\nSeleccion invalida");
                }
            } catch (Exception e) {
                System.out.println("La opción debe ser numerica...");
                sc.nextLine();
            }

        } while (!ok || selection != 8);
    }

    // metodo para seleccion y detalles de nave
    public static Map<String, Integer> spaceshipMap() {
        // mapa de naves
        Map<String, Integer> spaceshipMap = new HashMap<>();
        spaceshipMap.put("Mack I", 200);
        spaceshipMap.put("Mack II", 140);
        spaceshipMap.put("Mack III", 100);
        return spaceshipMap;
    }

    // metodo para visualizar detalles de naves
    public static void viewSpaceship() {
        System.out.println("-------------------------------------------");
        System.out.println("-DETALLES DE NAVES-");
        // variable scanner
        var selection = 0;
        boolean ok = false;
        //bucle de seleccion 
        do {
            try {
                System.out.println("\n1.Mack I\n2.Mack II\n3.Mack III\n4.volver\n");
                System.out.println("-------------------------------------------");
                System.out.print("\nPor favor, seleccione su nave de preferencia para saber mas detalles: ");
                selection = sc.nextInt();
                ok = true;
                switch (selection) {
                    case 1 ->
                        System.out.println("\nMack I\nCapacidad=2 Personas\nVelocidad=200mill Km/d");
                    case 2 ->
                        System.out.println("\nMack II\nCapacidad=8 Personas\nVelocidad=140mill Km/d");
                    case 3 ->
                        System.out.println("\nMack III\nCapacidad=14 Personas\nVelocidad=100mill Km/d");
                    case 4 ->
                        System.out.println("\nUsted ha seleccionado volver");
                    default ->
                        System.out.println("\nSeleccion invalida");
                }
            } catch (Exception e) {
                System.out.println("La opción debe ser numerica...");
                sc.nextLine();
            }
            
            
        } while (!ok || selection != 4);
    }

    // metodo para gestionar viaje
    public static Integer managerTrip(Map<String, Integer> pla, Map<String, Integer> nav) {
        Map<String, Integer> planet = pla;
        Map<String, Integer> spaceship = nav;
        System.out.println("-------------------------------------------");
        System.out.println("-GESTOR DE VIAJE-");
        System.out.println(planet);
        System.out.println(spaceship);
        return 1;
    }
}
