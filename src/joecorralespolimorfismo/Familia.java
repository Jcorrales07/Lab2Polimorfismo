package joecorralespolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Corra
 */
public class Familia {
    private String apellido;
    private ArrayList<Aldeano> aldeanos;

    public Familia() {}
    
    public Familia(String apellido) {
        this.apellido = apellido;
    } 
   
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Familia { " + "\napellido=" + apellido + 
                ", \naldeanos=" + aldeanos.size() + '}';
    }
}
