package ex1Ventilador;

public class AppVentilador {
    
    public static void main(String[] args) {
        
        Ventilador v1 = new Ventilador();
        
        v1.marca = "Britania";
        v1.modelo = "Ventilador de Coluna";
        v1.cor = "Preto";
        v1.helice = false;
        v1.eixo = true;
        v1.reguladorAltura = 1;
        v1.reguladorVelocidade = 1;
        
        v1.ligar();
        v1.status();
        
        v1.estacionar();
        v1.status();
        
    }
    
}