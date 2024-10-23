package aula05;
public class ContaBanco {
    
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos Personalizados
    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        
        if(tipo.equals("CC")) {
            this.setSaldo(50.0f);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150.0f);
        }
        System.out.println("-> Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("-> Conta não pode ser fechada, "
                    + "pois ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("-> Conta não pode ser fechada, pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("-> Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor) {
        if (this.getStatus()) {
            // this.saldo = this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("-> Depósito realizado na conta de " 
                    + this.getDono());
        } else {
            System.out.println("-> Impossível depositar em uma conta fechada");
        }
    }
    
    public void sacar(float valor) {
        if(this.getStatus()) {
            if(this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("-> Saque realizado na conta de " 
                        + this.getDono());
            } else {
                System.out.println("-> Saldo insuficiente para saque");
            }
        } else {
            System.out.println("-> Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal() {
        float valor = 0;
        
        if (this.getTipo().equals("CC")) {
            valor = 12;
        } else if (this.getTipo().equals("CP")) {
            valor = 20;
        }
        
        if(this.getStatus() == true) {
            if(this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("-> Mensalidade paga com sucesso por " 
                        + this.getDono());
            } else {
                System.out.println("-> Saldo insuficiente");
            }
        } else {
            System.out.println("-> Impossível pagar com uma conta fechada\n");
        }
    }
    
    // Métodos Especiais
    public ContaBanco(float saldo, boolean status) { // Método construtor
        // this.setSaldo(saldo);
        // this.setStatus(status);
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }

    public boolean getStatus() { // Quando o tipo é boolean, pode ser isStatus()
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}