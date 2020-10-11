package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Alfabeto extends Pictograma{
    private List<String> letras = new ArrayList<String>();
    private String interpretacion = "";

    public Alfabeto(String origen, String interpretacion, List<String> letras){
        super(origen);
        this.interpretacion = interpretacion;
        this.letras = letras;
    }
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