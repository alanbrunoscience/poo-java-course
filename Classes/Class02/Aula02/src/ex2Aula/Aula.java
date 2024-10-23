package ex2Aula;

public class Aula {
    
    String local;
    String assunto;
    String recursosDid;
    boolean confirmacao;
    int alunos;
    int hrInicio;
    int minInicio;
    int hrFim;
    int minFim;
    int sumHoras;
    int sumMins;
    int totalHrsDuracao;
    int totalMinsDuracao;
    boolean tarefas;
    int qtdExercicios;
    
    public boolean validarHorarios() {
        if ((hrInicio < 0 || hrInicio > 23) || (hrFim < 0 || hrFim > 23) || 
            (minInicio < 0 || minInicio > 59) || (minFim < 0 || minFim > 59)) {
            System.out.println("\n-> Informações de horários inválidos.");
            return false;
        } else {
            return true;
        }
    }
    
    public void status(){
        
        System.out.println("--- INFORMAÇÕES GERAIS DA AULA ---\n");        
        if (!this.aulaConfirmada()) {
            System.out.println("-> Aula não confirmada.");
        } else {
            System.out.println("-> Local: " + this.local);
            System.out.println("-> Assunto: " + this.assunto);
            System.out.println("-> Recursos didáticos: " 
                    + this.recursosDid);
            System.out.println("-> Aula confirmada? " + aulaConfirmada());
            System.out.println("-> Tempo de Duração: " + this.totalHrsDuracao + 
                    " h " + this.totalMinsDuracao + " min");
            System.out.println("-> Quantidade de alunos presentes: " 
                    + this.alunos);
            System.out.println("-> Haverá tarefas? " + anunciarTarefas());
            System.out.println("-> Quantidade de exercícios: " 
                    + this.qtdExercicios); 
            System.out.println("");
        }
    }
    
    public boolean aulaConfirmada() {
        
        calcularDuracao();
        
        return this.confirmacao && this.alunos > 0 
                && (this.totalHrsDuracao != 0 || this.totalMinsDuracao != 0);

    }
    
    public void cancelarAula() {
        this.confirmacao = false;
    }
    
    public void calcularDuracao() {
        
        this.totalHrsDuracao = 0;
				this.totalMinsDuracao = 0;
				
				int inicioTotalMin = this.hrInicio * 60 + this.minInicio;
				int fimTotalMin = this.hrFim * 60 + this.minFim;
			
				if (fimTotalMin < inicioTotalMin) {
			            fimTotalMin += 24 * 60;
				}

				int duracaoTotalMin = fimTotalMin - inicioTotalMin;
        this.totalHrsDuracao = duracaoTotalMin / 60;
        this.totalMinsDuracao = duracaoTotalMin % 60;

    }
    
    public boolean anunciarTarefas() {
        
        this.tarefas = this.qtdExercicios > 0;
        
        return this.tarefas;
        
//        if (this.tarefas == true && this.qtdExercicios > 0) {
//            this.tarefas = true;
//        } else {
//            this.tarefas = false;
//        }
//        return this.tarefas;

    }
    
}