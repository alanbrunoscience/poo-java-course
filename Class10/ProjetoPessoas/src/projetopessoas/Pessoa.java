package projetopessoas;
public class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    // Métodos Personalizados
    public void fazerAniv() {
        this.idade++;
    }
    
    public void apresentarPessoa() {
        System.out.println("===== DADOS DE PESSOA =====\n");
        System.out.println("-> Nome: " + this.getNome());
        System.out.println("-> Idade: " + this.getIdade());
        System.out.println("-> Sexo: " + this.getSexo());
        System.out.println();
    }
    
    // Métodos Especiais
    public Pessoa (String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}