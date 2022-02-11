package joecorralespolimorfismo;

/**
 *
 * @author Joe Corrales
 */
public class Normal extends Aldeano {
    
    public Normal() {}
    
    public Normal(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        ptsAtaque = 50;
    }

    //toString()  

    @Override
    public void dolorGenerado() {

    }
}
