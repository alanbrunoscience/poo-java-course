package projetoyoutube;
public class Visualizacao {
    
    // Atributos
    private Gafanhoto espectador;
    private Video filme;
    
    // Métodos Personalizados
    public void status() {
        System.out.println("*** INFORMAÇÕES DA VISUALIZAÇÃO ***\n");
        System.out.println("-> Espectador: " + this.espectador.getNome() + ";");
        System.out.println("-> Filme: " + this.filme.getTitulo() + ";");
        System.out.println("-> Total de vídeos assistidos por " 
                + this.espectador.getNome() + ": " 
                + this.espectador.getTotAssistido() + ";");
        System.out.println("-> Quantidade de views do vídeo '" 
                + this.filme.getTitulo() + "': "
                + this.filme.getViews() + ";");
        System.out.println("-> Avaliação média de '" + this.filme.getTitulo() + "': "
                + this.filme.getAvMedia() + ".");
        System.out.println();
    }
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc) {
        int tot = 0;
        
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        
        this.filme.setAvaliacao(tot);
        
    }
    
    // Métodos Especiais
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public Gafanhoto getEspectador() {
        return this.espectador;
    }
    
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    
    public Video getFilme() {
        return this.filme;
    }
    
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
}