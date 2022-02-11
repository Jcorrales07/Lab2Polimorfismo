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
    }

    public String getDiscurso() {
        return discurso;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }
    
    //toString()

    @Override
    public void dolorGenerado() {
    
    }
}
