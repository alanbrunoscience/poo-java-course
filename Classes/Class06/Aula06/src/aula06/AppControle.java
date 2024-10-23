package aula06;
public class AppControle {
    public static void main(String[] args) {
        
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
        
    }
    
}