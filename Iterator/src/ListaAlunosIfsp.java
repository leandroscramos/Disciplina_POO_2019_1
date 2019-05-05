import java.util.Iterator;

public class ListaAlunosIfsp implements Lista{

    private static final int MAX_ALUNOS = 50;
    private int numeroAlunos = 0;
    private AlunoEnsinoSuperior[] alunos;

    public ListaAlunosIfsp() {
        this.alunos = new AlunoEnsinoSuperior[MAX_ALUNOS];
        addAluno("Wiliam", "ADS", 2010, false);
        addAluno("Marcos", "ADS", 2011, false);
        addAluno("João", "ADS", 2012, false);
    }

    public void addAluno(String nome, String curso, int inicio, boolean regular){

        if (numeroAlunos < MAX_ALUNOS){
            AlunoEnsinoSuperior novoAluno = new AlunoEnsinoSuperior(nome,  curso,  inicio,  regular);
            alunos[numeroAlunos++] = novoAluno;
        }
    }

    public Iterator criaIterator(){
        return new ListaIfspIterator(alunos, numeroAlunos);
    }
}
