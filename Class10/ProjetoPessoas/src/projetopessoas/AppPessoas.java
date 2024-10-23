package projetopessoas;
public class AppPessoas {
    public static void main(String[] args) {
        
        // Instanciação dos Objetos
        Pessoa p1 = new Pessoa(null, 0, ' ');
        Aluno p2 = new Aluno("João", 20, 'M', 207079, "Engenharia de Computação");
        Professor p3 = new Professor("Fernando", 45, 'M', 
                "Linguagens Formais e Autômatos", 18500.10);
        Funcionario p4 = new Funcionario("Carol", 21, 'F', "Biblioteca", true);
        
        // Chamada de Métodos
        p1.apresentarPessoa();
        p2.apresentarAluno();
        p3.apresentarProfessor();
        p4.apresentarFuncionario();
        
        p2.setCurso("Ciência da Computação");
        p3.setSalario(4500.00);
        p4.setSetor("Coordenação");
        
        p2.apresentarAluno();
        p3.apresentarProfessor();
        p4.apresentarFuncionario();
        
    }
    
}