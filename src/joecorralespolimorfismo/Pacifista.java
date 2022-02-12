package joecorralespolimorfismo;

/**
 *
 * @author Joe Corrales
 */
public class Pacifista extends Aldeano {
    private String discurso;
    
    public Pacifista() {}

    public Pacifista(String nombre, String apellido, int edad, int ptsVida, String discurso) {
        super(nombre, apellido, edad, ptsVida);
        this.discurso = discurso;
        ptsAtaque = 0;
    }

    public String getDiscurso() {
        return discurso;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }
    
    //toString()

    @Override
    public double dolorGenerado(Aldeano adnAtacado) {
        System.out.println(discurso);
        return 0;
    }
}
