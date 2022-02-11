package joecorralespolimorfismo;

/**
 *
 * @author Joe Corrales
 */
public class Explosivo extends Aldeano {
    
    public Explosivo() {}

    public Explosivo(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        ptsAtaque = 250;
    }

    //toString()

    @Override
    public void dolorGenerado() {
    }
}
