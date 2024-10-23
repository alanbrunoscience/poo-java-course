package aula12;
public class Peixe extends Animal {
    
    // Atributos
    private String corEscama;
    
    // Métodos Personalizados
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    
    // Sobrescrita de Métodos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    // Métodos Especiais
    public String getCorEscama() {
        return this.corEscama;
    }
    
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}