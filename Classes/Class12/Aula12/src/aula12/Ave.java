package aula12;
public class Ave extends Animal {
    
    // Atributos
    private String corPena;
    
    // Métodos Personalizados
    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }
    
    // Sobrescrita de Métodos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    // Métodos Especiais
    public String getCorPena() {
        return this.corPena;
    }
    
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}