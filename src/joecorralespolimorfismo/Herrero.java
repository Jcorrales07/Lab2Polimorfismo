package joecorralespolimorfismo;

import java.util.Random;

/**
 *
 * @author Corra
 */
public class Herrero extends Aldeano {
    Random random = new Random();
    
    public Herrero() {}

    public Herrero(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        ptsAtaque = random.nextInt(500-200) + 200;
    }
    
    //toString()
}
