package comunicacion;


public class Tesis extends Escrito {
    private String idea = "";
    private static String [] argumentos = null;
    private String conclusion = "";
    private String referencias = "";
    private String interpretacion = "";

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String [] argumentos1,
            String conclucion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.conclusion = conclucion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
        argumentos = argumentos1;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclucion) {
        this.conclusion = conclucion;
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
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * this.getPaginas()*5;
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String toString = String.format(this.getOrigen()+"\n"+
                                        this.getTitulo()+"\n"+
                                        this.getAutor()+"\n"+
                                        "%d"+"\n"+
                                        this.idea+"\n"+
                                        "%d"+"\n"+
                                        this.conclusion+"\n"+
                                        this.referencias, this.getPaginas(), argumentos.length);
        return toString;
    }

    
}
