package joecorralespolimorfismo;

/**
 *
 * @author Joe Corrales
 */
public abstract class Aldeano {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int ptsVida;
    protected int ptsAtaque;
    
    public Aldeano() {}
    
    public Aldeano(String nombre, String apellido, int edad, int ptsVida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ptsVida = ptsVida;
        this.ptsAtaque = 0;
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

    public int getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(int ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }

    public abstract void dolorGenerado();
    
    @Override
    public String toString() {
        return "Aldeano {" + "\nnombre=" + nombre + ", \napellido=" + apellido + 
                            ", \nedad=" + edad + ", \nptsVida=" + ptsVida + "\n}";
    }
}
