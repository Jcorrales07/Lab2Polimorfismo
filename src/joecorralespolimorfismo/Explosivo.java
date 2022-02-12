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
    public double dolorGenerado(Aldeano adnAtacado) {
        if(!prob(15)) {
            if(adnAtacado instanceof Herrero) return ptsAtaque * 1.05;
            else if (adnAtacado instanceof Agronomo) return ptsAtaque * 1.10;
            return ptsAtaque;
        }
        System.out.println("Fallo");
        return 0;
    }
}
