package projetoyoutube;
public abstract class Pessoa {
    
    // Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    protected float experiencia;
    
    // Métodos Personalizados
    public void statusPessoa() {
        System.out.println("*** INFORMAÇÕES PESSOAIS ***\n");
        System.out.println("-> Nome: " + this.getNome());
        System.out.println("-> Idade: " + this.getIdade());
        System.out.println("-> Sexo: " + this.getSexo());
        System.out.println("-> Experiência: " + this.getExperiencia());
    }
    
    // Métodos Especiais
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
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
    
    public float getExperiencia() {
        return this.experiencia;
    }
    
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
}