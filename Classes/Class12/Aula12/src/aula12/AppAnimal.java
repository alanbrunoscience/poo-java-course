package aula12;
public class AppAnimal {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro d = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();
        
        c.locomover();
        d.locomover();
        c.emitirSom();
        d.emitirSom();
        
    }
    
}