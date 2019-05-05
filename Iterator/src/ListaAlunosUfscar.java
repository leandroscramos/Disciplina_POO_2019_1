import java.util.ArrayList;
import java.util.Iterator;

public class ListaAlunosUfscar implements Lista{

    private ArrayList<AlunoEnsinoSuperior> alunos;

    public ListaAlunosUfscar() {
        this.alunos = new ArrayList<AlunoEnsinoSuperior>();
        addAluno("Danilo", "Engenharia de Materiais", 2005, true);
        addAluno("Helton", "Engenharia de Produção", 2009, true);
        addAluno("Gilvanildo", "Engenharia Civil", 2006, true);
    }

    public void addAluno(String nome, String curso, int inicio, boolean regular) {
        AlunoEnsinoSuperior novoAluno;
        novoAluno = new AlunoEnsinoSuperior(nome, curso, inicio, regular);
        alunos.add(novoAluno);
    }

    public Iterator criaIterator(){
        return alunos.iterator();
    }
}
