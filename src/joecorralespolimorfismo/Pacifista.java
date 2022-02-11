package joecorralespolimorfismo;

/**
 *
 * @author Corra
 */
public class Pacifista extends Aldeano {
    private String discurso;
    
    public Pacifista() {}

    public Pacifista(String nombre, String apellido, int edad, int ptsVida) {
        super(nombre, apellido, edad, ptsVida);
        this.discurso = "Calmaos porfavor";
    }

    public String getDiscurso() {
        return discurso;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }
    
    //toString()
}
