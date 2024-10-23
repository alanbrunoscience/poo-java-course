package aula11;
public class AppGerencia {
    public static void main(String[] args) {
        
        /*Visitante v1 = new Visitante();
        
        v1.setNome("Alan");
        v1.setIdade(27);
        v1.setSexo('M');
        
        v1.apresentarPessoa();*/
        
        Aluno a1 = new Aluno();
        
        a1.setNome("João");
        a1.setMatricula(20701099);
        a1.setCurso("Engenharia de Computação");
        a1.setIdade(25);
        a1.setSexo('M');

        a1.apresentarPessoa();
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Jubileu");
        b1.setIdade(28);
        b1.setSexo('M');
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        
        b1.apresentarPessoa();
        b1.pagarMensalidade();
        
    }
}