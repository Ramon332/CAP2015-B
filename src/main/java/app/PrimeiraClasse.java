package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Ramon");
        a1.setIdade(19);

        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
        
        System.out.println("Olá, Gradle!!!");

        Tarefa t1 = new Tarefa();
        t1.setDescricao("Estudar Estrutura de Dados");
        t1.setConcluido(true);

        Tarefa t2 = t1;
        t2.setConcluido(false);

        System.out.println(t1.getDescricao());
        System.out.println(t1.isConcluido());

        Atividade[] objetos = new Atividade[3];

        objetos[0] = new Compromisso;
        objetos[1] = new Tarefa();

    }
}