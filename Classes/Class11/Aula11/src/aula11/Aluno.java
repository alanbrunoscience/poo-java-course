package aula11;
public class Aluno extends Pessoa {
    
    // Atributos
    private int matricula;
    private String curso;
    
    // Métodos Personalizados
    public void pagarMensalidade() {
        System.out.println("--------------------------------------");
        System.out.println("-> Pagando mensalidade do aluno " + this.nome);
        System.out.println("--------------------------------------\n");
    }
    
    // Métodos Especiais
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return this.curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}