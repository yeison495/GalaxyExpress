
// librerias importadas
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

// simulador de viaje intergalactivo GalaxyExpress
public class App {
    // variable scanner global
    static Scanner sc = new Scanner(System.in);
    static boolean ok;
    static String chosenSpaceship, chosenPlanet, eventRandomKey;
    static double timeTravel, oxigenoTravel, fuelTravel;
    static int eventRandomValue;

    // metodo principal
    public static void main(String[] args) throws Exception {
        // inicio de simulador
        System.out.println("\033[31m---------------------------------------------------------------");
        System.out.println("-----------------Bienvenido a Galaxy Express-------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("-Su mejor opcion a la hora de realizar viajes interplanetarios-");
        System.out.println("---------------------------------------------------------------\033[0m");

        // creacion e inicializacion de variables
        var select = 0;
        // creacion de mapas
        Map<String, Integer> pla = planetMap();
        Map<String, Integer> nav = spaceshipMap();
        Map<String, Integer> eve = eventsMap();
        Map<String, Integer> sol = solutionMap();

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
                    starTravel(eve, sol, timeTravel, oxigenoTravel, fuelTravel);
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
            System.out.println("\n\033[32m-MENU-");
            System.out.println("\n1.Destinos\n2.Naves\n3.Gestionar Viaje\n4.Comenzar Viaje\n5.Salir\n");
            System.out.println("-------------------------------------------");
            System.out.print("\nSeleccione su opcion de preferencia: \033[0m");
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
        solutionMap.put("Esperar", 30);
        solutionMap.put("Desvio", 25);
        solutionMap.put("Reparar", 20);
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
        var distance = 0;
        var speed = 0;
        var cantPeople = 0;
        // variable de consumo de oxigeno en litros por dia para una persona
        var oxConsPerDay = 550;
        // variable de consumo de combustible en litros por dia
        var fuelConsPerDay = 60;

        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("-GESTOR DE VIAJE-");
        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido al gestor de viaje");
        System.out.println("");
        selectSpaceship(nav);
        selectPlanet(pla);
        cantPeople = numberPeople(spaceship, chosenSpaceship);

        // recorrer el mapa de planetas para encontrar la distancia según el planeta
        // elegido
        for (Map.Entry<String, Integer> planetDistance : planet.entrySet()) {
            if (planetDistance.getKey().equals(chosenPlanet)) {
                distance = planetDistance.getValue();
            }
        }

        // recorrer el mapa de naves para encontrar la velocidad según la nave elegida
        for (Map.Entry<String, Integer> spaceshipSpeed : spaceship.entrySet()) {
            if (spaceshipSpeed.getKey().equals(chosenSpaceship)) {
                speed = spaceshipSpeed.getValue();
            }
        }

        // calculo del tiempo de duración del viaje configurado
        timeTravel = (double) distance / (double) speed;

        // calculo de oxigeno según la cantidad de personas para el viaje configurado
        oxigenoTravel = (oxConsPerDay * cantPeople) * timeTravel;

        // calculo de combustible para el viaje configurado
        fuelTravel = fuelConsPerDay * timeTravel;

        // mostrar información del viaje configurado
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Felicidades....");
        System.out.println("Configuración del viaje completada");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("El planeta destino es: %s\n", chosenPlanet);
        System.out.printf("La nave de preferencia es: %s\n", chosenSpaceship);
        System.out.printf("Su viaje tendra un estimado de %.2f días\n", timeTravel);
        System.out.printf("La cantidad de combustible para su viaje es de %.2f litros y el oxigeno %.2f litros\n",
                fuelTravel, oxigenoTravel);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(
                "Sera redirigido al menú principal para *comenzar su viaje* interestelar, que la fuerza te acompañe =D");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");
    }

    // Metodo para elegir nave al configurar el viaje
    public static void selectSpaceship(Map<String, Integer> nav) {
        Map<String, Integer> spaceship = nav;
        var optionShip = 0;

        ok = false;
        // Ciclo para repetir el menú si la opción es invalida
        do {
            try {
                var shipIndex = 1;
                for (String spaceshipName : spaceship.keySet()) {
                    System.out.println(shipIndex + ". " + spaceshipName);
                    shipIndex++;
                }
                System.out.println("-----------------------------------------------------------------------");
                System.out.print("Para poder planificar su viaje por favor eliga la nave a utilizar: ");
                optionShip = sc.nextInt();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("");
                ok = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("");
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
    public static void selectPlanet(Map<String, Integer> pla) {
        Map<String, Integer> planet = pla;
        var optionPlanet = 0;
        ok = false;
        // Ciclo para repetir el menú si la opción es invalida
        do {
            try {
                var planetIndex = 1;
                for (String planetName : planet.keySet()) {
                    System.out.println(planetIndex + ". " + planetName);
                    planetIndex++;
                }
                System.out.println("-----------------------------------------------------------------------");
                System.out.print("Para poder planificar su viaje por favor eliga el planeta: ");
                optionPlanet = sc.nextInt();
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("");
                ok = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("");
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

    // Metodo para elegir el número de personas según la nave seleccionada
    public static int numberPeople(Map<String, Integer> spaceship, String nav) {
        Map<String, Integer> ships = spaceship;
        String chosenSpaceship = nav;
        var cantMax = 0;
        var cantPeople = 0;
        // Se define por nave la cantidad maxima del pasajeros
        if (nav.equals("Mack I")) {
            cantMax = 2;
        } else if (nav.equals("Mack II")) {
            cantMax = 8;
        } else {
            cantMax = 14;
        }
        ok = false;
        // Ciclo para repetir el menú si la opción es invalida
        do {
            try {
                System.out.println("-----------------------------------------------------------------------");
                System.out.printf("Recuerde que la cantidad maxima de personas para la nave %S es de %d \n", nav,
                        cantMax);
                System.out.print("Para poder planificar su viaje por favor digite la cantidad de personas a viajar: ");
                cantPeople = sc.nextInt();
                ok = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("");
                System.out.println("La opción es invalida...");
                System.out.println("");
            }
        } while (cantPeople <= 0 || cantPeople > cantMax || !ok);

        return cantPeople;
    }

    public static void starTravel(Map<String, Integer> eve, Map<String, Integer> sol, Double timeTravel,
            Double oxigenoTravel, Double fuelTravel) {
        Map<String, Integer> events = eve;
        Map<String, Integer> solutions = sol;
        Double timeT = timeTravel;
        Double oxigenoT = oxigenoTravel;
        Double fuelT = fuelTravel;
        System.out.println(timeT + " " + oxigenoT + " " + fuelT);

        for (int percent = 0; percent <= 100; percent++) {
            // Crea una barra de progreso con 50 caracteres
            int widthBar = 50; // Tamaño fijo de la barra
            int done = percent * widthBar / 100;
            String bar = "=".repeat(done) + " ".repeat(widthBar - done);

            // Sobrescribe la misma línea con el progreso
            System.out.print("\r\033[35m Iniciando => [" + bar + "] " + percent + "% \033[0m");
            if (percent == 35) {
                eventRandom(events);
                eventSolution(solutions, eventRandomKey);

            }

            // Espera 0.1 segundo antes de la siguiente actualización
            try {
                Thread.sleep(100); // 100 ms = 0.1 segundo
            } catch (InterruptedException e) {
                System.out.println("Error en la pausa del hilo: " + e.getMessage());
            }
        }

        // Salto de línea al finalizar
        System.out.println("\n¡Proceso completado!");

    }

    // metodo para mostrar el evento aleatorio
    public static void eventRandom(Map<String, Integer> eve) {
        Map<String, Integer> events = eve;
        // Obtén el tamaño del mapa
        int size = events.size();

        // Genera un índice aleatorio dentro del rango del tamaño del mapa
        int randomIndex = (int) (Math.random() * size);

        // Crea un contador para recorrer las entradas del mapa
        int count = 0;

        // Recorre las entradas del mapa hasta llegar al índice aleatorio
        for (Map.Entry<String, Integer> eventRandom : events.entrySet()) {
            if (count == randomIndex) {
                // System.out.println(eventRandom.getKey());
                eventRandomKey = eventRandom.getKey();
                eventRandomValue = eventRandom.getValue();
                break;
            }
            count++;
        }
    }

    // metodo para elegir la solución a un evento aleatorio
    public static void eventSolution(Map<String, Integer> sol, String event) {
        Map<String, Integer> solutionEvents = sol;
        String chosenEvent = event;
        var optionSolution = 0;
        ok = false;
        if (!chosenEvent.equals("Sin eventualidades")) {
            // Ciclo para repetir el menú si la opción es invalida
            do {
                System.out.println("");
                System.out.println("--------------------------------------");
                System.out.printf("Un evento de improvisto: %s \n", chosenEvent);
                System.out.println("--------------------------------------");
                try {
                    var shipIndex = 1;
                    for (String solutionsName : solutionEvents.keySet()) {
                        if (chosenEvent.equals("Falla en la nave")) {
                            if (!solutionsName.equals("Desvio")) {
                                System.out.println(shipIndex + ". " + solutionsName);
                            }
                        } else if (chosenEvent.equals("Lluvia de asteroides") || chosenEvent.equals("Tormenta solar")) {
                            if (!solutionsName.equals("Reparar")) {
                                System.out.println(shipIndex + ". " + solutionsName);
                            }
                        }
                        shipIndex++;
                    }
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.print("Para poder continuar el viaje debe elegir una solución: ");
                    optionSolution = sc.nextInt();
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("");
                    ok = true;
                } catch (Exception e) {
                    sc.nextLine();
                    System.out.println("");
                    System.out.println("La opción es invalida...");
                    System.out.println("");
                }
            } while (!ok);
        }
    }
}