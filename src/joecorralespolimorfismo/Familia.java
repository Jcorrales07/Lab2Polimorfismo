package joecorralespolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Joe Corrales
 */
public class Familia {
    private String apellido;
    private ArrayList<Aldeano> aldeanos;

    public Familia() {}
    
    public Familia(String apellido) {
        this.apellido = apellido;
        aldeanos = new ArrayList<>();
    } 
   
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Aldeano> getAldeanos() {
        return aldeanos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Familia { \nApellido = ").append(apellido);
        sb.append(", \nAldeanos = ").append(aldeanos);
        sb.append("\n}");
        return sb.toString();
    }
}
