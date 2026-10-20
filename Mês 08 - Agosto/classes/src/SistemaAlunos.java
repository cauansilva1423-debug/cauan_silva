import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

    private List<Alunos> aluno;

    public SistemaAlunos() {
        aluno = new ArrayList<Alunos>();
    }

    public void adicionarAluno(Alunos a) {
        aluno.add(a);
    }

    public List<Alunos> filtrarAlunos(String curso, int idadeMinima, double mediaMinima) {
        List<Alunos> resultado = new ArrayList<>();

        for (Alunos a : aluno) {
            if (a.getCurso().equalsIgnoreCase(curso) && a.getIdade() >= idadeMinima && a.getMediaFinal() >= mediaMinima) {
                resultado.add(a);
            }
        }

        return resultado;
    }

    public Alunos buscarPorMatricula(String matricula) {
        for (Alunos a : aluno) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }

        return null;
    }

    public void cadastrarAluno(Alunos a) {
        if (buscarPorMatricula(a.getMatricula()) != null) {
            throw new IllegalArgumentException("Matricula ja cadastrada!");
        }

        aluno.add(a);
    }
}
