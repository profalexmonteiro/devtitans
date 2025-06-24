package Escola;
public class EnsalamentoMain {
    public static void main(String[] args) {
        Ensalamento e = new Ensalamento();

        // Adicione salas
        e.addSala(new Sala(6, 101, 50, true));
        e.addSala(new Sala(6, 102, 100, true));
        e.addSala(new Sala(6, 203, 50, false));
        e.addSala(new Sala(6, 204, 100, false));

        // Adicione turmas
        Turma t1 = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);
        t1.addHorario(1); t1.addHorario(15); t1.addHorario(29);
        e.addTurma(t1);

        Turma t2 = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
        t2.addHorario(19); t2.addHorario(26); t2.addHorario(33);
        e.addTurma(t2);

        Turma t3 = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
        t3.addHorario(1); t3.addHorario(15); t3.addHorario(29);
        e.addTurma(t3);

        Turma t4 = new Turma("Redes de Computadores", "Edjair Souza", 70, true);
        t4.addHorario(2); t4.addHorario(16);
        e.addTurma(t4);

        // Alocar todas
        e.alocarTodas();

        // Relatórios
        System.out.println(e.relatorioTurmasPorSala());
        System.out.println();
        System.out.println(e.relatorioSalasPorTurma());
    }
}
