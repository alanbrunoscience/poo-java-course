package ex1Ventilador;

public class Ventilador {
    
    String marca;
    String modelo;
    String cor;
    boolean helice;
    boolean eixo;
    int reguladorAltura;
    int reguladorVelocidade;
    
    void status() {
        
        System.out.println("--- INFORMAÇÕES GERAIS ---\n");
        System.out.println("-> Marca: " + this.marca + ";");
        System.out.println("-> Modelo: " + this.modelo + ";");
        System.out.println("-> Cor: " + this.cor + ";");
        System.out.println("-> Está ligado? " + this.helice + ";");
        System.out.println("-> Ajustado para rotacionar? " + this.eixo + ";");
        System.out.println("-> Status do regulador de altura: " 
                + ajustarAltura() + ";");
        System.out.println("-> Velocidade da hélice: " + 
                ajustarVelocidade() + ".\n");
    }
    
    void ligar() {
        this.helice = true;      
    }
    
    void desligar() {
        this.helice = false;
    }
    
    void rotacionar() {
        this.eixo = true;
    }
    
    void estacionar() {
        this.eixo = false;
    }
    
    String ajustarAltura() {
        
        if(this.reguladorAltura == 1) {
            return ("Altura máxima");
        } else if (this.reguladorAltura == 2) {
            return ("Altura média");
        } else if (this.reguladorAltura == 3) {
            return ("Altura baixa");
        } else {
            return ("Altura inválida!");
        }
    }
    
    String ajustarVelocidade() {
        
        if(this.helice) {
            if(this.reguladorVelocidade == 1) {
                return ("Velocidade máxima");
            } else if (this.reguladorVelocidade == 2) {
                return ("Velocidade moderada");
            } else if (this.reguladorVelocidade == 3) {
                return ("Velocidade baixa");
            } else {
                return ("Velocidade inválida!");
            }
        } else {
            return ("Ventilador está desligado! "
                    + "Ligue-o para ajustar a velocidade");
        }
        
    }
    
}