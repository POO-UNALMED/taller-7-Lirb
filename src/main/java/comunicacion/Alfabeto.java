package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Alfabeto {
    private List<String> letras = new ArrayList<String>();
    private String interpretacion = "";
    public int cantidadLetras(){
        return this.letras.size();
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString(){
        return "";
    }
}