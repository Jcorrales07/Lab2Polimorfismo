package joecorralespolimorfismo;

import java.util.Random;

/**
 *
 * @author Corra
 */
public class Herrero extends Aldeano {
    Random rnd = new Random();
    private int ptsAtaque;
    
    
    public Herrero() {}

    public Herrero(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        this.ptsAtaque = rnd.nextInt(500-200) + 200;
    }

    public Random getRnd() {
        return rnd;
    }

    public void setRnd(Random rnd) {
        this.rnd = rnd;
    }

    public int getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(int ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }
}
