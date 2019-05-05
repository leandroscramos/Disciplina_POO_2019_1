import java.util.Iterator;

public class ListaIfspIterator implements Iterator {

    private AlunoEnsinoSuperior[] alunos;
    private int numAlunos = 0;
    private int i = 0;

    public ListaIfspIterator(AlunoEnsinoSuperior[] alunos, int numAlunos) {
        this.alunos = alunos;
        this.numAlunos = numAlunos;
    }

    public boolean hasNext() {
        if(i >= numAlunos)
            return false;
        else
            return true;
    }

    public Object next() {
        return alunos[i++];
    }
}
