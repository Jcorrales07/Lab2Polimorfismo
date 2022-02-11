package joecorralespolimorfismo;

/**
 *
 * @author Corra
 */
public class Normal extends Aldeano {
    private int ptsAtaque;

    public Normal() {}
    
    public Normal(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        this.ptsAtaque = 50;
    }

    public int getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(int ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }
    
    //toString()
}
