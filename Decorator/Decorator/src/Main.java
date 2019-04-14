public class Main {
    public static void main(String[] args) {

        Funcionario leandro = new MembroEquipe();

        leandro = new LiderEquipe(leandro);
        leandro = new GerenteProjeto(leandro);

        System.out.println(leandro.descricao());
        System.out.println(leandro.getSalario());
    }
}
