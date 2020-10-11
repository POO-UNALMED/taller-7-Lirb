package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Tesis extends Escrito {
    private String idea = "";
    private List<String> argumentos = new ArrayList<String>();
    private String conclucion = "";
    private String referencias = "";
    private String interpretacion = "";

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, List<String> argumentos,
            String conclucion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclucion = conclucion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public List<String> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(List<String> argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclucion() {
        return conclucion;
    }

    public void setConclucion(String conclucion) {
        this.conclucion = conclucion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * this.getPaginas();
    }

    @Override
    String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return "";
    }

    
}
