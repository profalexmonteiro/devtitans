import java.util.ArrayList;

public class Turma {
    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList<Aluno> alunos;

    // Construtor
    public Turma(String disciplina, int ano, int semestre, Professor professor) {
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    // Adiciona aluno se matrícula ainda não existir
    public void addAluno(Aluno aluno) {
        if (getAluno(aluno.matricula) == null) {
            alunos.add(aluno);
        }
    }

    // Retorna aluno pela matrícula
    public Aluno getAluno(int matricula) {
        for (Aluno a : alunos) {
            if (a.matricula == matricula) {
                return a;
            }
        }
        return null;
    }

    // Retorna média de idade dos alunos
    public double getMediaIdade() {
        if (alunos.isEmpty()) return 0.0;
        int total = 0;
        for (Aluno a : alunos) {
            total += a.getIdade();
        }
        return total / (double) alunos.size();
    }

    // Descrição completa da turma
    public String getDescricao() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turma ").append(disciplina).append(" - ").append(ano).append("/").append(semestre)
          .append(" (").append(professor.getDescricao()).append("):\n");

        for (int i = 0; i < alunos.size(); i++) {
            sb.append("- Aluno ").append(i + 1).append(": ").append(alunos.get(i).getDescricao()).append("\n");
        }

        return sb.toString().trim(); // remove a última quebra de linha
    }
}
