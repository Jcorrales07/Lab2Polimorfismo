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
    public double dolorGenerado(Aldeano adnAtacado) {
        if(adnAtacado instanceof Pacifista) return ptsAtaque * 1.05;
        return ptsAtaque;
    }
}
