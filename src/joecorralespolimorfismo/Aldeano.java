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
    protected double ptsAtaque;
    
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

    public double getPtsAtaque() {
        return ptsAtaque;
    }

    public void setPtsAtaque(double ptsAtaque) {
        this.ptsAtaque = ptsAtaque;
    }

    public abstract double dolorGenerado(Aldeano adnAtacado);
    
    public boolean prob(int porcentaje) {
        double prob = porcentaje;
        double res = Math.random() * porcentaje + 1;
        return prob == res;
    }
    
    @Override
    public String toString() {
        return "Aldeano {" + "\nnombre=" + nombre + ", \napellido=" + apellido + 
                            ", \nedad=" + edad + ", \nptsVida=" + ptsVida + "\n}";
    }
}
