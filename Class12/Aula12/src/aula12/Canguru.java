package aula12;
public class Canguru extends Mamifero {
    
    // Métodos Personalizados
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
    // Sobrescrita de Métodos
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
}