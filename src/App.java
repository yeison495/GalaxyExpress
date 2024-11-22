import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    // variable scanner global
    static Scanner sc = new Scanner(System.in);
    // metodo principal
    public static void main(String[] args) throws Exception {
        // inicio de simulador
        App app = new App();
        System.out.println("---------------------------------------------------------------");
        System.out.println("-----------------Bienvenido a Galaxy Express-------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("-Su mejor opcion a la hora de realizar viajes interplanetarios-");
        System.out.println("---------------------------------------------------------------");
        // creacion e inicializacion de variables
        var select=0;
        var pla=0;
        var nav=0;
        // ciclo para la seleccion de menu
        do {
            select=app.menu();
            // condicional de ejecucion
            if(select==1){
                pla=app.planetMap();      
                System.out.println(pla);         
            }else if (select==2) {
                nav=app.naveMap();      
                System.out.println(nav); 
            }else if (select==3) {
                System.out.println();
            }
            else if (select==4) {
                System.out.println("Bye");
            }
            else{
                System.out.println("Seleccion invalida");  
            }                        
        } while (select!=4);        
        
    }
    // metodo para menu
    public Integer menu(){        
        System.out.println("\n-MENU-");
        System.out.println("\n1.Seleccionar Planeta\n2.Seleccionar Nave\n3.Comenzar Viaje\n4.Salir\n");
        System.out.println("-------------------------------------------");
        System.out.print("\nSeleccione su opcion de preferencia: ");
        var selection= sc.nextInt();
        return selection;        
    }
    // metodo para la seleccion y detalles de planeta
    public Integer  planetMap(){        
        System.out.println("-------------------------------------------");
        System.out.println("-MENU DE PLANETAS-");
        System.out.println("\n1.Mercurio\nEs el planeta más cercano al Sol y el más pequeño del sistema solar.\nNo tiene atmósfera significativa, lo que provoca temperaturas extremas entre el día y la noche.\nDistancia= 222mill Km");
        System.out.println("\n2.Venus\nEs el planeta más caliente debido a su densa atmósfera de dióxido de carbono que genera un efecto invernadero extremo.\nTiene una superficie llena de volcanes y montañas.\nDistancia= 261mill Km");
        System.out.println("\n3.Marte\nConocido como el \\\"planeta rojo\\\" por su superficie cubierta de óxido de hierro.\nTiene el volcán más grande del sistema solar, el Monte Olimpo.\nDistancia= 401mill Km");
        System.out.println("\n4.Júpiter\nEs el planeta más grande del sistema solar y está compuesto mayormente de hidrógeno y helio.\nTiene una tormenta gigante llamada la Gran Mancha Roja.\nDistancia= 968mill Km");
        System.out.println("\n5.Saturno\nFamoso por sus impresionantes anillos compuestos de hielo y roca.\nEs el segundo planeta más grande del sistema solar.\nDistancia= 1660mill Km");
        System.out.println("\n6.Urano\nEs un gigante helado con una atmósfera de metano, lo que le da su característico color azul verdoso.\nRota de lado, con su eje casi perpendicular a su órbita.\nDistancia= 3151mill Km");
        System.out.println("\n7.Neptuno\nEs el planeta más lejano del Sol y también un gigante helado.\nEs conocido por sus fuertes vientos y tormentas.\nDistancia= 4700mill Km");
        System.out.println("-------------------------------------------");
        System.out.print("\nPor favor, seleccione su planeta de destino: ");
        // variable scanner
        var selection= sc.nextInt();
        // mapa de planetas
        Map <String, Integer>  planetMap = new HashMap<>();       
        planetMap.put("Mercurio", 222);
        planetMap.put("Venus", 261);
        planetMap.put("Marte", 401);
        planetMap.put("Júpiter", 968);
        planetMap.put("Saturno",1660 );
        planetMap.put("Urano", 3151);
        planetMap.put("Neptuno", 4700);
        int planetSel=0;
        // switch para eleccion de planeta
        switch (selection) {
            case 1:                
                planetSel=planetMap.get("Mercurio");                
                System.out.println("Usted ha seleccionado a Mercurio como destino");     
                break;
            case 2:
                planetSel=planetMap.get("Venus");
                System.out.println("Usted ha seleccionado a Venus como destino");     
                break;  
            case 3:
                planetSel=planetMap.get("Marte");
                System.out.println("Usted ha seleccionado a Marte como destino");    
                break;  
            case 4:
                planetSel=planetMap.get("Júpiter");
                System.out.println("Usted ha seleccionado a Júpiter como destino");    
                break;    
            case 5:
                planetSel=planetMap.get("Saturno");
                System.out.println("Usted ha seleccionado a Saturno como destino");    
                break;  
            case 6:
                planetSel=planetMap.get("Urano");
                System.out.println("Usted ha seleccionado a Urano como destino");    
                break;  
            case 7:
                planetSel=planetMap.get("Neptuno");
                System.out.println("Usted ha seleccionado a Neptuno como destino");    
                break;       
            default:
                System.out.println("Seleccion invalida");
                break;
        }
        return planetSel;   
    }
    // metodo para seleccion y detalles de nave
    public Integer  naveMap(){        
        System.out.println("-------------------------------------------");
        System.out.println("-MENU DE NAVES-");
        System.out.println("\n1.Mack I\nCapacidad=2 Personas\nVelocidad=200mill Km/d");
        System.out.println("\n2.Mack II\nCapacidad=8 Personas\nVelocidad=140mill Km/d");
        System.out.println("\n3.Mack III\nCapacidad=14 Personas\nVelocidad=100mill Km/d");
        System.out.println("-------------------------------------------");
        System.out.print("\nPor favor, seleccione su nave de preferencia: ");
        // variable scanner
        var selection= sc.nextInt();
        // mapa de naves
        Map <String, Integer>  naveMap = new HashMap<>();       
        naveMap.put("Mack I", 200);
        naveMap.put("Mack II", 140);
        naveMap.put("Mack III", 100);
        int naveSel=0;
        // switch para eleccion de nave
        switch (selection) {
            case 1:                
                naveSel=naveMap.get("Mack I");                
                System.out.println("Usted ha seleccionado el Mack I");     
                break;
            case 2:
                naveSel=naveMap.get("Mack II");
                System.out.println("Usted ha seleccionado el Mack II");     
                break;  
            case 3:
                naveSel=naveMap.get("Mack III");
                System.out.println("Usted ha seleccionado el Mack III");    
                break;      
            default:
                System.out.println("Seleccion invalida");
                break;
        }
        return naveSel;   
    }
    // public Map eventRamdon(){
        
        
    //     return eventRamdon;   
    // }

}
