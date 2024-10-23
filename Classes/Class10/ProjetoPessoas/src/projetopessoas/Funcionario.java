package projetopessoas;
public class Funcionario extends Pessoa {
    
    // Atributos
    private String setor;
    private boolean trabalhando;
    
    // Métodos Personalizados
    public void mudarTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }
    
    public void apresentarFuncionario() {
        System.out.println("===== DADOS DO FUNCIONÁRIO =====\n");
        System.out.println("-> Nome: " + this.getNome());
        System.out.println("-> Idade: " + this.getIdade());
        System.out.println("-> Sexo: " + this.getSexo());
        System.out.println("-> Setor: " + this.getSetor());
        System.out.println("-> Está ativo? " + this.getTrabalhando());
        System.out.println();
    }
    
    // Métodos Especiais
    public Funcionario(String nome, int idade, char sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo); // Chama o construtor da superclasse Pessoa
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    public String getSetor() {
        return this.setor;
    }
    
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public boolean getTrabalhando() {
        return this.trabalhando;
    }
    
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}