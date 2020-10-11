package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Alfabeto extends Pictograma{
    private static List<String> letras = new ArrayList<String>();
    private String interpretacion = "";

    public Alfabeto(String origen, String interpretacion){
        super(origen);
        this.interpretacion = interpretacion;
    }
   
    public int cantidadLetras(){
        return letras.size();
    }

    @Override
    String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString(){
        return letras.toString().replace("[", "").replace("]", "");
    }

    public static List<String> getLetras() {
        return letras;
    }

    public static void setLetras(List<String> letras) {
        Alfabeto.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}