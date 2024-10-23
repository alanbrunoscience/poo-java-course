package projetopessoas;
public class Aluno extends Pessoa {
    
    // Atributos
    private int matr;
    private String curso;
    
    // Métodos Personalizados
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada!");
    }
    
    public void apresentarAluno() {
        System.out.println("===== DADOS DO ALUNO =====\n");
        System.out.println("-> Nome: " + this.getNome());
        System.out.println("-> Idade: " + this.getIdade());
        System.out.println("-> Sexo: " + this.getSexo());
        System.out.println("-> Nº matrícula: " + this.getMatr());
        System.out.println("-> Curso: " + this.getCurso());
        System.out.println();
    }
    
    // Métodos Especiais
    public Aluno(String nome, int idade, char sexo, int matr, String curso) {
        super(nome, idade, sexo);  // Chama o construtor da superclasse Pessoa
        this.matr = matr;
        this.curso = curso;
    }
    
    public int getMatr() {
        return this.matr;
    }
    
    public void setMatr(int matr) {
        this.matr = matr;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}