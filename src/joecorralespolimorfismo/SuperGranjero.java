package joecorralespolimorfismo;

/**
 *
 * @author Corra
 */
public class SuperGranjero extends Aldeano {

    public SuperGranjero() {}

    public SuperGranjero(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        ptsAtaque = 1000;
    }
    
    //toString()
}
