package Escola;
public class TurmaEmSala {
    Turma turma;
    Sala sala;

    // Construtor padrão
    public TurmaEmSala() {
        this.turma = new Turma();
        this.sala = new Sala();
    }

    // Construtor com parâmetros
    public TurmaEmSala(Turma turma, Sala sala) {
        this.turma = turma;
        this.sala = sala;
    }
}
