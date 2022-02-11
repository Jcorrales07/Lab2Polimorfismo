package joecorralespolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joe Corrales
 */
public class JoeCorralesPolimorfismo {
    static ArrayList<Familia> familias = new ArrayList<>();
    
    public static void main(String[] args) {
        crearFamilias();
        do {
            switch(menu()) {
                case 1: 
                    System.out.println("[=== Crear Familia ===]");
                    crearFamilia();
                    break;
                
                case 2: 
                    break;
                    
                case 3:
                    break;
                    
                case 4:
                    break;
                    
                case 0:
                    System.out.println("Hasta luego!");
                    System.exit(0);
                    break;
                    
                default:
                        System.out.println("ESCOJA UNA OPCION CORRECTA");
            }
        } while (true);
    }
    
    private static int menu() {
        int opcion = myNextInt("\n[=== Menu ===]"
                + "\nOpciones: "
                + "\n1. Crear Familia"
                + "\n2. Crear Aldeano"
                + "\n3. Imprimir Familias"
                + "\n4. Pelear"
                + "\n0. Salir"
                + "\nOpcion: ");
        return opcion;
    }
    
    private static void crearFamilia() {
        String apellido = myNextString("Apellido de la familia: ");
        familias.add(new Familia(apellido));
        System.out.println("Familia creada!\n");
    }
    
    public static int myNextInt(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje);
        return input.nextInt();
    }
    
    public static String myNextString(String mensaje) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.print(mensaje);
        return input.next();
    }
    
    public static void crearFamilias() {
        //Familia Montescos
        Familia m = new Familia("Montesco");
        familias.add(m);
        SuperGranjero romeo = new SuperGranjero("Romeo", "Montesco", 20, 1000);
        Herrero herrero = new Herrero("Pedro", "Montesco", 24, 250);
        Agronomo agronomo = new Agronomo("James", "Montesco", 19, 200);
        m.getAldeanos().add(romeo);
        m.getAldeanos().add(herrero);
        m.getAldeanos().add(agronomo);
        
        //Familia Capuleto
        Familia ca = new Familia("Capuleto");
        familias.add(ca);
        Normal julieta = new Normal();
        ca.getAldeanos().add(julieta);
        ca.getAldeanos().add(julieta);
        ca.getAldeanos().add(julieta);
        
        //Familia Corrales
        Familia co = new Familia("Corrales");
        familias.add(co);
        Explosivo explosivo = new Explosivo("Joe", "Corrales", 18, 450);
        Agronomo agronomo2 = new Agronomo("Ian", "Corrales", 25, 200);
        Herrero herrero2 = new Herrero("Oseas", "Corrales", 50, 250);
        co.getAldeanos().add(explosivo);               
        co.getAldeanos().add(agronomo2);
        co.getAldeanos().add(herrero2);

    }
}
