package lab8progra2_equipo9;

import java.io.Serializable;
import java.util.ArrayList;

public class Universo implements Serializable{
    private static final long SerialVersionUID=750L;
    public String Nombre;
    public ArrayList<SeresVivos> living = new ArrayList();

    public Universo(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<SeresVivos> getLiving() {
        return living;
    }

    public void setLiving(ArrayList<SeresVivos> living) {
        this.living = living;
    }
    
    
}
