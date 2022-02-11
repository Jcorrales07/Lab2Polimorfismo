package joecorralespolimorfismo;

/**
 *
 * @author Corra
 */
public class Aldeano {
    private String nombre;
    private String apellido;
    private int edad;
    private int ptsVida;
    
    public Aldeano() {}
    
    public Aldeano(String nombre, String apellido, int edad, int ptsVida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ptsVida = ptsVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPtsVida() {
        return ptsVida;
    }

    public void setPtsVida(int ptsVida) {
        this.ptsVida = ptsVida;
    }

    @Override
    public String toString() {
        return "Aldeano {" + "\nnombre=" + nombre + ", \napellido=" + apellido + 
                            ", \nedad=" + edad + ", \nptsVida=" + ptsVida + "\n}";
    }
}
