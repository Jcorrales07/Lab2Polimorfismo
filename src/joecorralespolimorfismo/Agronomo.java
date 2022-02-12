package joecorralespolimorfismo;

/**
 *
 * @author Joe Corrales
 */
public class Agronomo extends Aldeano {
    
    public Agronomo() {}

    public Agronomo(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        ptsAtaque = 100;
    }

    @Override
    public double dolorGenerado(Aldeano adnAtacado) {
        if(!prob(5)) {
            if(adnAtacado instanceof Pacifista) return ptsAtaque * 1.05;
            else if (adnAtacado instanceof Normal) return ptsAtaque * 1.10;
        }
        System.out.println("Fallo");
        return 0;
    }
}
