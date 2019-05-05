import java.util.Iterator;

public class ListaGeral {

    Lista alunosUfscar = new ListaAlunosUfscar();
    Lista alunosIfsp = new ListaAlunosIfsp();

    public void geraListaTodosAlunos(){
        imprimeAlunos(alunosUfscar.criaIterator());
        System.out.println("------------------");
        imprimeAlunos(alunosIfsp.criaIterator());
    }

    private void imprimeAlunos(Iterator iterator) {
        while(iterator.hasNext()) {
            AlunoEnsinoSuperior aluno = (AlunoEnsinoSuperior) iterator.next();
            System.out.println("Aluno: "+ aluno.getNome()
                                        + " -"+ aluno.getCurso()
                                        + " -"+ aluno.getAnoInicio());
        }
    }

}
