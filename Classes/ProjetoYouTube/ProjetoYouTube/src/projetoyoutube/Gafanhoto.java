package projetoyoutube;
public class Gafanhoto extends Pessoa { // Herda a classe "Pessoa"
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    // Métodos Personalizados
    public void statusGafanhoto() {
        super.statusPessoa();
        System.out.println("-> Login: " + this.getLogin());
        System.out.println("-> Total Assistido: " + this.getTotAssistido());
        System.out.println();
    }
    
    // Métodos Especiais
    public Gafanhoto(String login, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}