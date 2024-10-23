package aula12;
public class Mamifero extends Animal {
    
    // Atributos
    private String corPelo;

    // Sobrescrita de Métodos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    // Métodos Especiais
    public String getCorPelo() {
        return this.corPelo;
    }
    
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}