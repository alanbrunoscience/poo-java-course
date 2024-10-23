package ultraemojicombat;

import java.util.Random; // Biblioteca importada para utilizar a classe Random

public class Luta {
    
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos Personalizados
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if(this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("");
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3); // Gerar 0, 1 ou 2
            
            System.out.println("====== RESULTADO DA LUTA ======\n");            
            switch(vencedor) {
                case 0: // Empate
                    System.out.println("-> Empatou!\n");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println("-> Vitória do " + this.desafiado.getNome());
                    System.out.println("");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;  
                case 2: // Desafiante vence
                    System.out.println("-> Vitória do " + this.desafiante.getNome());
                    System.out.println("");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    // Métodos Especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    
    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }
    
    public Lutador getDesafiante() {
        return this.desafiante;
    }
    
    public void setDesafiante(Lutador df) {
        this.desafiante = df;
    }
    
    public int getRounds() {
        return this.rounds;
    }
    
    public void setRounds(int rd) {
        this.rounds = rd;
    }
    
    public boolean getAprovada() {
        return this.aprovada;
    }
    
    public void setAprovada(boolean ap){
        this.aprovada = ap;
    }
    
}