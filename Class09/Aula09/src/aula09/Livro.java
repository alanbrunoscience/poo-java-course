package aula09;
public class Livro implements Publicacao {
    
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos Personalizados
    public void detalhes() {
        System.out.println("===== DETALHES DO LIVRO =====\n");
        System.out.println("- Título: " + this.getTitulo());
        System.out.println("- Autor: " + this.getAutor());
        System.out.println("- Total de Páginas: " + this.getTotPaginas());
        System.out.println("- Página atual: " + this.getPagAtual());
        System.out.println("- Aberto? " + this.getAberto());
        System.out.println("- Leitor: " + this.getLeitor().getNome());
        System.out.println("- Idade (anos): " + this.getLeitor().getIdade());
        System.out.println("- Sexo: " + this.getLeitor().getSexo());
        System.out.println("");
    }
    
    // Sobrescrever métodos
    @Override
    public void abrir() {
       this.setAberto(true);
    }
    
    @Override
    public void fechar() {
       this.setAberto(false);
    }
    
    @Override
    public void folhear(int p) {
        if(this.pagAtual + p <= this.totPaginas) {
            this.setPagAtual(this.pagAtual += p);
        } else {
            System.out.println("-> Fim do livro!\n");
        }
    }
    
    @Override
    public void avancarPag() {
        if(this.pagAtual < this.totPaginas) {
            this.pagAtual++;
        } else {
            System.out.println("-> Não é possível avançar páginas!\n");
        }
        
    }
    
    @Override
    public void voltarPag() {
        if(this.pagAtual > 0) {
            this.pagAtual--;
        } else {
            System.out.println("-> Não é possível voltar!\n");
            return;
        }
    }
    
    // Métodos Especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}