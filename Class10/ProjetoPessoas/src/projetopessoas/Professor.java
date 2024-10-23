package projetopessoas;
public class Professor extends Pessoa {
    
    // Atributos
    private String especialidade;
    private double salario;
    
    // Métodos Personalizados
    public void receberAum(double aum) {
        this.salario += aum;
    }
    
    public void apresentarProfessor() {
        System.out.println("===== DADOS DO PROFESSOR =====\n");
        System.out.println("-> Nome: " + this.getNome());
        System.out.println("-> Idade: " + this.getIdade());
        System.out.println("-> Sexo: " + this.getSexo());
        System.out.println("-> Especialidade: " + this.getEspecialidade());
        System.out.println("-> Salário (R$): " + this.getSalario());
        System.out.println();
    }
    
    // Métodos Especiais
    public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
        super(nome, idade, sexo); // Chama o construtor da superclasse Pessoa
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}