package aula12;
public class Cachorro extends Mamifero {
    
    // Métodos Personalizados
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
    
    // Sobrescrita de Métodos
    @Override
    public void emitirSom() {
        System.out.println("Som de latido");
    }
    
}