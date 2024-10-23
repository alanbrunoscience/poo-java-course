package aula11;
public class Bolsista extends Aluno {
    
    // Atributos
    private float bolsa;
    
    // Métodos Personalizados
    public void renovarBolsa() {
        System.out.println("--------------------------------------");
        System.out.println("-> Renovando bolsa de " + this.nome);
        System.out.println("--------------------------------------\n");
    }
   
    @Override
    public void pagarMensalidade() {
        System.out.println("-------------------------------------------");
        System.out.println("-> " + this.nome + " é bolsista! Pagamento facilitado");
        System.out.println("-------------------------------------------\n");
    }
    
    // Métodos Especiais
    public float getBolsa(){
        return this.bolsa;
    }
    
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
    
}