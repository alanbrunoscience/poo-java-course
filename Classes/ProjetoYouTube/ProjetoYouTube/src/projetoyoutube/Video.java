package projetoyoutube;
public class Video implements AcoesVideo { // Implementa a interface "AcoesVideo"
    
    // Atributos
    private String titulo;
    private int avaliacao;
    private int sumAv; // Atributo que armazena a soma das avaliações para calcular a avaliação média
    private int avMedia;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // Métodos Personalizados
    public void statusVideo() {
        System.out.println("*** INFORMAÇÕES DO VÍDEO ***\n");
        System.out.println("-> Título: " + this.getTitulo() + ";");
        System.out.println("-> Avaliação: " + this.getAvaliacao() + ";");
        System.out.println("-> Views: " + this.getViews() + ";");
        System.out.println("-> Curtidas: " + this.getCurtidas() + ";");
        System.out.println("-> Reproduzindo? " + this.getReproduzindo() + ".");
        System.out.println();
    }
    
    // Sobrescrita de Métodos   
    @Override
    public void play() {
        this.reproduzindo = true;
    }
    
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    
    @Override
    public void like() {
        this.curtidas += 1; // Ou this.curtidas++;
    }
    
    // Métodos Especiais
    public Video(String titulo) { // Construtor
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
        this.setSumAv(avaliacao); // Chamada do método "setSumAv()", para 
        // calcular o somatório das avaliações
    }

    public int getSumAv() {
        return sumAv;
    }

    public void setSumAv(int avaliacao) {
        this.sumAv += avaliacao; // "sumAv" irá receber o valor que ele já possui, 
        // além do valor de cada avaliação
        this.setAvMedia(); // Chamada do método "setAvMedia", para o cálculo da 
        // avaliação média, baseado no somatório das avaliações
    }

    public int getAvMedia() {
        return avMedia;
    }

    public void setAvMedia() {
        this.avMedia = (int)(this.getSumAv() / this.views);
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
}