public class atv3 {
    public static void main(String[] args) {

        SistemaAlunos sistema = new SistemaAlunos();
        Alunos aluno1 = new Alunos("Joao", 18, "001", "Desenvolvimento de Sistemas", 8.0);
        Alunos aluno2 = new Alunos("Maria", 20, "002","Desenvolvimento de Sistemas", 9.0);
        Alunos aluno3 = new Alunos("Pedro", 11, "003","Informatica", 5.5);

        sistema.cadastrarAluno(aluno1);
        sistema.cadastrarAluno(aluno2);
        sistema.cadastrarAluno(aluno3);

        for (Alunos aluno : sistema.filtrarAlunos("Desenvolvimento de Sistemas", 14, 6.0)) {
            System.out.println(aluno);
        }

        Alunos encontrado = sistema.buscarPorMatricula("003");

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Aluno nao encontrado!");
        }
    }
}
