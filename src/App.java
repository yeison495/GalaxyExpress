

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Lo mejor del mundo");
        App app = new App();
        app.menu();
        System.out.println(app.planetMap());
        System.out.println("Lo mejor del mundo");
    }
    
    public void menu(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("-----------------Bienvenido a Galaxy Express-------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("-Su mejor opcion a la hora de realizar viajes interplanetarios-");
        System.out.println("---------------------------------------------------------------");
        System.out.println("\nPor favor, seleccione su planeta de destino: ");
        System.out.println("-------------------------------------------");
        System.out.println("-MENU DE PLANETAS-");
        System.out.println("1.Mercurio\n2.Venus\n3.Marte\n4.Júpiter\n5.Saturno\n6.Urano\n7.Neptuno");
        System.out.println("-------------------------------------------");
    }

    public Map planetMap(){
        Map <String, Integer> planetMap = new HashMap<>();
        planetMap.put("Mercurio", 222);
        planetMap.put("Venus", 261);
        planetMap.put("Marte", 401);
        planetMap.put("Júpiter", 968);
        planetMap.put("Saturno", 1660);
        planetMap.put("Urano", 3151);
        planetMap.put("Neptuno", 4700);
        return planetMap;
    }
}
