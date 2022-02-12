package joecorralespolimorfismo;

/**
 *
 * @author Joe Corrales
 */
public class SuperGranjero extends Aldeano {

    public SuperGranjero() {}

    public SuperGranjero(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        ptsAtaque = 1000;
    }
    
    @Override
    public double dolorGenerado(Aldeano adnAtacado) {
        if(adnAtacado instanceof Herrero) return ptsAtaque * 1.10;
        if (adnAtacado instanceof Explosivo) return ptsAtaque * 1.15;
        return ptsAtaque;
    }
}
