package joecorralespolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joe Corrales
 */
public class JoeCorralesPolimorfismo {
    ArrayList<Familia> familias = new ArrayList<>();
    
    public static void main(String[] args) {
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
        int opcion = myNextInt("[=== Menu ===]\n"
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
        
    }
    
    public static int myNextInt(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje);
        return input.nextInt();
    }
    
    public static String myNextString(String mensaje) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.println(mensaje);
        return input.next();
    }
}
