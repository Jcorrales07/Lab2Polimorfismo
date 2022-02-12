package joecorralespolimorfismo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Joe Corrales
 */
public class Lab4P2_JoeCorrales_22141156 {
    //Lista de familias
    public static ArrayList<Familia> familias = new ArrayList<>();
    
    public static void main(String[] args) {
        crearFamilias();
        do {
            switch(menu()) {
                case 1:{ crearFamilia(); } break;
                case 2:{ crearAldeano(); } break;
                case 3:{ imprimirFamilias(); } break;
                case 4:{ pelea(); } break;
                    
                case 0: {
                    System.out.println("Hasta luego!");
                    System.exit(0);
                }
                    break;
                    
                default: System.out.println("ESCOJA UNA OPCION CORRECTA");
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
        System.out.println("\n[=== Crear Familia ===]");
        String apellido = myNextString("Apellido de la familia: ");
        familias.add(new Familia(apellido));
        System.out.println("Familia creada!\n");
    }
    
    //Funcion para crear 3 familias
    public static void crearFamilias() {
        //Familia Montesco
        Familia m = new Familia("Montesco");
        familias.add(m);
        SuperGranjero romeo = new SuperGranjero("Romeo", "Montesco", 20, 1000);
        Herrero herrero = new Herrero("Pedro", "Montesco", 24, 560);
        Agronomo agronomo = new Agronomo("James", "Montesco", 19, 600);
        m.getAldeanos().add(romeo);
        m.getAldeanos().add(herrero);
        m.getAldeanos().add(agronomo);
        
        //Familia Capuleto
        Familia ca = new Familia("Capuleto");
        familias.add(ca);
        Normal julieta = new Normal("Julieta", "Capuleto", 19, 505);
        Normal padre = new Normal("Hector", "Capuleto", 45, 780);
        Herrero tio = new Herrero("Donald", "Capuleto", 32, 890);
        ca.getAldeanos().add(julieta);
        ca.getAldeanos().add(padre);
        ca.getAldeanos().add(tio);
        
        //Familia Corrales
        Familia co = new Familia("Corrales");
        familias.add(co);
        Explosivo explosivo = new Explosivo("Joe", "Corrales", 18, 999);
        Agronomo agronomo2 = new Agronomo("Ian", "Corrales", 25, 755);
        Herrero herrero2 = new Herrero("Oseas", "Corrales", 50, 765);
        co.getAldeanos().add(explosivo);               
        co.getAldeanos().add(agronomo2);
        co.getAldeanos().add(herrero2);
    }
    
    //Funcion para crear un Aldeano
    private static void crearAldeano() {
        System.out.println("\n[=== Crear aldeano ===]");
        int opcion = myNextInt("\n[=== Tipo de Aldeano ===]"
                + "\n1. Normal"
                + "\n2. Pacifista"
                + "\n3. Herrero"
                + "\n4. Agronomo"
                + "\n5. Explosivo"
                + "\nOpcion: ");
        tipo(opcion);
    }
    
    //Funcion para saber que tipo de 
    private static void tipo(int opcion) {
        System.out.println("Ingrese el apellido para verificar");
        String apellido = myNextString("Apellido: ");
        String nombre = null; int edad = 0; int ptsVida = 0;
        
        if (verificarApellido(apellido)) {
            nombre = myNextString("Nombre: ");
            edad = myNextInt("Edad: ");
            ptsVida = myNextInt("Puntos de vida: ");
        }
        
        switch (opcion) {
            case 1: {
                Normal a = new Normal(nombre, apellido, edad, ptsVida);
                agregarAldeano(a);
            }
                break;
            case 2: {
                String discurso = myNextString("Ingresa el discurso: ");
                Pacifista al = new Pacifista(nombre, apellido, edad, ptsVida, discurso);
                agregarAldeano(al);
            }
                break;
            case 3: {
                Herrero ald = new Herrero(nombre, apellido, edad, ptsVida);
                agregarAldeano(ald);
            }
                break;                 
            case 4: {
                Agronomo alde = new Agronomo(nombre, apellido, edad, ptsVida);
                agregarAldeano(alde);
            }
                break;
            case 5: {
                Explosivo aldea = new Explosivo(nombre, apellido, edad, ptsVida);
                agregarAldeano(aldea);
            }
                break;
            default:
                System.out.println("No disponible");
        }
    } 
    
    private static boolean verificarApellido(String apellido) {
        for(Familia familia : familias) {
            if (familia.getApellido().equalsIgnoreCase(apellido)) 
                return true;
        }
        System.out.println("No existe esa familia!");
        return false;
    }
    
    private static void agregarAldeano(Aldeano aldeano) {
        for (Familia familia : familias) {
            if (familia.getApellido().equalsIgnoreCase(aldeano.getApellido())) 
                familia.getAldeanos().add(aldeano);
        }
    }
    
    private static void imprimirFamilias() {
        System.out.println("\n[=== Familias ===]\n");
        for (int i = 0; i < familias.size(); i++) 
            System.out.println((i+1)+ ".- "+ familias.get(i).getAldeanos()+ "\n");
    }
    
    private static Familia buscar(String apellido) {
        for (Familia familia: familias) {
             if (familia.getApellido().equals(apellido)) 
                return familia;
        }
        return null;
    }
    
    private static void pelea() {
        System.out.println("\n[=== Pelea ===]");
        String apellido = myNextString("Elija un familia que enfrentar: ");
        Familia familiaVs = buscar(apellido);
        Familia montesco = buscar("Montesco");
        if(familiaVs != null && familiaVs.aldeanos.size() >= 1) {
            System.out.println("\t\tMontesco VS "+ familiaVs.getApellido()+"\nSTARTTT!!!");
            Collections.shuffle(familiaVs.aldeanos);
            Collections.shuffle(montesco.aldeanos);
            int i = 0;
            do {
                Aldeano pMontesco = montesco.aldeanos.get(i);
                Aldeano pVS = familiaVs.aldeanos.get(i); 

                while(pMontesco.getPtsVida() != 0 && pVS.getPtsVida() != 0) {
                    double dolor = pMontesco.dolorGenerado(pVS);
                    if (dolor != 0) {
                        pVS.setPtsVida((int) (pVS.getPtsVida() - dolor));
                        System.out.println(pMontesco.getNombre() + " ataco a " + pVS.getNombre() + " causandole "
                                + dolor + " de daño! ");
                        System.out.println("La vida de " + pVS.getNombre() + " es: " + pVS.getPtsVida() );
                    }
                    double dolorVS = pVS.dolorGenerado(pMontesco);
                    if (dolorVS != 0) {
                        pMontesco.setPtsVida((int) (pMontesco.getPtsVida() - dolorVS));
                        System.out.println(pVS.getNombre() + " ataco a " + pMontesco.getNombre() + " causandole "
                                + dolorVS + " de daño! ");
                        System.out.println("La vida de " + pMontesco.getNombre() + " es: " + pVS.getPtsVida() );
                    }
                    if (pMontesco.getPtsVida() != 0 && pVS.getPtsVida() < 0) {
                        System.out.println(pMontesco.getNombre() + " ha ganado!");
                        break;
                    } else if (pVS.getPtsVida() != 0 && pMontesco.getPtsVida() < 0) {
                        System.out.println(pVS.getNombre() + " ha ganado!");
                        break;
                    }
                }
                i++;
            } while(!montesco.aldeanos.isEmpty() && !familiaVs.aldeanos.isEmpty());
        }
    }
    
    
    //Funcion para pedir un entero
    public static int myNextInt(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.print(mensaje);
        return input.nextInt();
    }
    
    //Funcion para pedir una cadena
    public static String myNextString(String mensaje) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.print(mensaje);
        return input.next();
    }
}
