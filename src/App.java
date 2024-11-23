
// librerias importadas
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// simulador de viaje intergalactivo GalaxyExpress
public class App {
    // variable scanner global
    static Scanner sc = new Scanner(System.in);
    static boolean ok;

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
        Map<String, Integer> eve = eventsMap();
        Map<String, Integer> sol = solutionMap();

        // variable de consumo de oxigeno en litros por dia para una persona
        var oxConsPerDay = 550;
        // variable de consumo de combustible en litros por dia
        var fuelConsPerDay = 60;
        // ciclo para la verificar errores
        do {
            select = menu();

            switch (select) {
                case 1 ->
                    viewPlanet();
                case 2 ->
                    viewSpaceship();
                case 3 ->
                    tripConfiguration(pla, nav);
                case 4 ->
                    System.out.println();
                case 5 -> {
                    System.out.println("\n*Al infinito y mas allá...BYE*\n");
                    break;
                }
                default ->
                    System.out.println("\nSeleccion invalida\n");
            }
        } while (select != 5);
    }

    // metodo para menu principal
    public static Integer menu() {
        var selection = 0;
        ok = false;
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
        Map<String, Integer> planetMap = new LinkedHashMap<>();
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
        ok = false;
        var selection = 0;
        System.out.println("-------------------------------------------");
        System.out.println("-DETALLES DE DESTINOS-");
        // bucle de seleccion
        do {
            try {
                System.out.println("-------------------------------------------");
                System.out.println(
                        "\n1.Mercurio\n2.Venus\n3.Marte\n4.Júpiter\n5.Saturno\n6.Urano\n7.Neptuno\n8.Volver\n");
                System.out.println("-------------------------------------------");
                System.out.print("\nPor favor, seleccione un destino para saber mas detalles: ");
                selection = sc.nextInt();
                ok = true;
                // switch para eleccion de planeta
                switch (selection) {
                    case 1 ->
                        System.out.println(
                                "\nMercurio:\nEs el planeta más cercano al Sol y el más pequeño del sistema solar.\nDistancia= 222mill Km");
                    case 2 ->
                        System.out.println(
                                "\nVenus:\nEs el planeta más caliente debido a su densa atmósfera de dióxido de carbono que genera un efecto invernadero extremo.\nDistancia= 261mill Km");
                    case 3 ->
                        System.out.println(
                                "\nMarte:\nConocido como el \\\"planeta rojo\\\" por su superficie cubierta de óxido de hierro.\nDistancia= 401mill Km");
                    case 4 ->
                        System.out.println(
                                "\nJúpiter:\nEs el planeta más grande del sistema solar y está compuesto mayormente de hidrógeno y helio.\nDistancia= 968mill Km");
                    case 5 ->
                        System.out.println(
                                "\nSaturno:\nFamoso por sus impresionantes anillos compuestos de hielo y roca.\nDistancia= 1660mill Km");
                    case 6 ->
                        System.out.println(
                                "\nUrano:\nEs un gigante helado con una atmósfera de metano, lo que le da su característico color azul verdoso.\nDistancia= 3151mill Km");
                    case 7 ->
                        System.out.println(
                                "\nNeptuno:\nEs conocido por sus fuertes vientos y tormentas.\nDistancia= 4700mill Km");
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

    // metodo para creacion mapa de naves
    public static Map<String, Integer> spaceshipMap() {
        // mapa de naves
        Map<String, Integer> spaceshipMap = new LinkedHashMap<>();
        spaceshipMap.put("Mack I", 150);
        spaceshipMap.put("Mack II", 100);
        spaceshipMap.put("Mack III", 50);
        return spaceshipMap;
    }

    // metodo para creacion mapa de eventos
    public static Map<String, Integer> eventsMap() {
        // mapa de naves
        Map<String, Integer> eventsMap = new LinkedHashMap<>();
        eventsMap.put("Sin eventualidades", 0);
        eventsMap.put("Falla en la nave", 30);
        eventsMap.put("Lluvia de asteroides", 50);
        eventsMap.put("Tormenta solar", 100);
        return eventsMap;
    }

    // metodo para creacion mapa de soluciones
    public static Map<String, Integer> solutionMap() {
        // mapa de naves
        Map<String, Integer> solutionMap = new LinkedHashMap<>();
        solutionMap.put("Reparar", 20);
        solutionMap.put("Desvio", 25);
        solutionMap.put("Esperar", 30);
        return solutionMap;
    }

    // metodo para visualizar detalles de naves
    public static void viewSpaceship() {
        System.out.println("-------------------------------------------");
        System.out.println("-DETALLES DE NAVES-");
        ok = false;
        var selection = 0;
        // bucle de seleccion
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
    public static void tripConfiguration(Map<String, Integer> pla, Map<String, Integer> nav) {
        Map<String, Integer> planet = pla;
        Map<String, Integer> spaceship = nav;
        
        System.out.println("-------------------------------------------");
        System.out.println("-GESTOR DE VIAJE-");
        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido al gestor de viaje");
        selectSpaceship(nav);
    }

    // Metodo para elegir nave al configurar el viaje
    public static void selectSpaceship(Map<String, Integer> nav){
        Map<String, Integer> spaceship = nav;
        var optionShip = 0;
        String chosenSpaceship;
        ok = false;
        // Ciclo para repetir el menú si la opción es invalida
        do {
            try {
                var shipIndex = 1;
                for (String spaceshipName : spaceship.keySet()) {
                    System.out.println(shipIndex + ". " + spaceshipName);
                    shipIndex++;
                }
                System.out.print("Para poder planificar su viaje por favor eliga la nave a utilizar: ");
                optionShip = sc.nextInt();
                ok = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("La opción es invalida...");
                System.out.println("");
            }
        } while (!ok);

        // asignación de clave a la variable según la opción elegida
        switch (optionShip) {
            case 1 ->
                chosenSpaceship = "Mack I";
            case 2 ->
                chosenSpaceship = "Mack II";
            case 3 ->
                chosenSpaceship = "Mack III";
            default ->
                System.out.println("\nSeleccion invalida");
        }
    }

    // Metodo para elegir planeta al configurar el viaje
    public static void selectPlanet(Map<String, Integer> pla){
        Map<String, Integer> planet = pla;
        var optionPlanet = 0;
        String chosenPlanet;
        ok = false;
        // Ciclo para repetir el menú si la opción es invalida
        do {
            try {
                var planetIndex = 1;
                for (String planetName : planet.keySet()) {
                    System.out.println(planetIndex + ". " + planetName);
                    planetIndex++;
                }
                System.out.print("Para poder planificar su viaje por favor eliga el planeta: ");
                optionPlanet = sc.nextInt();
                ok = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("La opción es invalida...");
                System.out.println("");
            }
        } while (!ok);

        // asignación de clave a la variable según la opción elegida
        switch (optionPlanet) {
            case 1 ->
                chosenPlanet = "Mercurio";
            case 2 ->
                chosenPlanet = "Venus";
            case 3 ->
                chosenPlanet = "Marte";
            case 4 ->
                chosenPlanet = "Júpiter";
            case 5 ->
                chosenPlanet = "Saturno";
            case 6 ->
                chosenPlanet = "Urano";
            case 7 ->
                chosenPlanet = "Neptuno";
            default ->
                System.out.println("\nSeleccion invalida");
        }
    }
}