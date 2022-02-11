package joecorralespolimorfismo;

import java.util.Random;

/**
 *
 * @author Joe Corrales
 */
public class Herrero extends Aldeano {
    Random random = new Random();
    
    public Herrero() {}

    public Herrero(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        int vidaExtra = (int) Math.round(ptsVida * 0.5);
        this.ptsVida =  ptsVida + vidaExtra;
        ptsAtaque = random.nextInt(500-200) + 200;
    }
    
    //toString()

    @Override
    public void dolorGenerado() {
    }
}
