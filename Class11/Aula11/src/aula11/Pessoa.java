package aula11;
public abstract class Pessoa {
    
    // Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    
    // Métodos Personalizados
    public final void fazerAniver() {
        this.idade++;
    }
    
    public void apresentarPessoa() {
        System.out.println("===== DADOS PESSOAIS =====\n");
        System.out.println("-> Nome: " + this.getNome());
        System.out.println("-> Idade: " + this.getIdade());
        System.out.println("-> Sexo: " + this.getSexo());
        System.out.println();
    }
    
    // Métodos Especiais
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}