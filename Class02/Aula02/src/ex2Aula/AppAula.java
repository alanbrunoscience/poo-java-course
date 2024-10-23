package ex2Aula;

public class AppAula {
    
    public static void main(String[] args) {
        
        Aula a1 = new Aula();
        
        a1.local = "YouTube";
        a1.assunto = "Programação Orientada a Objetos";
        a1.recursosDid = "Slides";
        a1.confirmacao = true;
        a1.alunos = 100;
        a1.hrInicio = 23;
        a1.minInicio = 50;
        a1.hrFim = 00;
        a1.minFim = 10;
        a1.tarefas = true;
        a1.qtdExercicios = 50;
        
        if(a1.validarHorarios()) {
            a1.status();
        }
        
        Aula a2 = new Aula();
        
        a2.local = "Hotmart";
        a2.assunto = "Estrutura de Dados";
        a2.recursosDid = "Slides";
        a2.confirmacao = true;
        a2.alunos = 100;
        a2.hrInicio = 13;
        a2.minInicio = 59;
        a2.hrFim = 14;
        a2.minFim = 00;
        a2.tarefas = false;
        a2.qtdExercicios = 1;
        
        if(a2.validarHorarios()) {
            a2.status();
        }
        
    }
}