package Escola;
import java.util.ArrayList;

public class Ensalamento {
    public ArrayList<Sala> salas;
    public ArrayList<Turma> turmas;
    public ArrayList<TurmaEmSala> ensalamento;

    public Ensalamento() {
        this.salas = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.ensalamento = new ArrayList<>();
    }

    public void addSala(Sala sala) {
        salas.add(sala);
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public Sala getSala(Turma turma) {
        for (TurmaEmSala te : ensalamento) {
            if (te.turma.equals(turma)) {
                return te.sala;
            }
        }
        return null;
    }

    public boolean salaDisponivel(Sala sala, int horario) {
        for (TurmaEmSala te : ensalamento) {
            if (te.sala.equals(sala)) {
                if (te.turma.horarios.contains(horario)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (int h : horarios) {
            if (!salaDisponivel(sala, h)) {
                return false;
            }
        }
        return true;
    }

    public boolean alocar(Turma turma, Sala sala) {
        if (turma.acessivel && !sala.acessivel) return false;
        if (turma.numAlunos > sala.capacidade) return false;
        if (!salaDisponivel(sala, turma.horarios)) return false;

        ensalamento.add(new TurmaEmSala(turma, sala));
        return true;
    }

    public void alocarTodas() {
        for (Turma turma : turmas) {
            for (Sala sala : salas) {
                if (alocar(turma, sala)) break;
            }
        }
    }

    public int getTotalTurmasAlocadas() {
        return ensalamento.size();
    }

    public int getTotalEspacoLivre() {
        int total = 0;
        for (TurmaEmSala te : ensalamento) {
            total += te.sala.capacidade - te.turma.numAlunos;
        }
        return total;
    }

    public String relatorioResumoEnsalamento() {
        return "Total de Salas: " + salas.size() + "\n" +
               "Total de Turmas: " + turmas.size() + "\n" +
               "Turmas Alocadas: " + getTotalTurmasAlocadas() + "\n" +
               "Espaços Livres: " + getTotalEspacoLivre();
    }

    public String relatorioTurmasPorSala() {
        StringBuilder sb = new StringBuilder();
        sb.append(relatorioResumoEnsalamento()).append("\n");

        for (Sala sala : salas) {
            sb.append("\n--- ").append(sala.getDescricao()).append(" ---\n\n");
            for (TurmaEmSala te : ensalamento) {
                if (te.sala.equals(sala)) {
                    sb.append(te.turma.getDescricao()).append("\n\n");
                }
            }
        }
        return sb.toString().trim();
    }

    public String relatorioSalasPorTurma() {
        StringBuilder sb = new StringBuilder();
        sb.append(relatorioResumoEnsalamento()).append("\n");

        for (Turma turma : turmas) {
            sb.append("\n").append(turma.getDescricao()).append("\n");
            Sala sala = getSala(turma);
            if (sala != null) {
                sb.append("Sala: ").append(sala.getDescricao()).append("\n");
            } else {
                sb.append("Sala: SEM SALA\n");
            }
        }
        return sb.toString().trim();
    }
}
