package comunicacion;

public class Alfabeto extends Pictograma{
    private static String [] letras = null;
    private String interpretacion = "";

    public Alfabeto(String origen, String [] letras, String interpretacion){
        super(origen);
        this.interpretacion = interpretacion;
        Alfabeto.letras = letras;
    }
   
    public int cantidadLetras(){
        return letras.length;
    }

    @Override
    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString(){
        String stringLetras = "";
        for(String pivote : Alfabeto.letras){
            stringLetras = stringLetras + pivote+", ";
        }
        return stringLetras.substring(0, stringLetras.length()-2);       
    }

    public static String[] getLetras() {
        return letras;
    }

    public static void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}