package joecorralespolimorfismo;

/**
 *
 * @author Corra
 */
public class Agronomo extends Aldeano {
    
    public Agronomo() {}

    public Agronomo(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        ptsAtaque = 100;
    }
}
