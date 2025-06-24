public class TurmaMain {
    public static void main(String[] args) {
        // Criação do professor
        Professor prof = new Professor("Dr.", "Hubert J. Farnsworth", 2208);

        // Criação da turma
        Turma turma = new Turma("Iniciação Tecnológica e Científica", 2016, 1, prof);

        // Criação de alunos
        Aluno aluno1 = new Aluno("Emmett L. Brown", 7714, 2002);
        Aluno aluno2 = new Aluno("Egon Spengler", 5907, 2004);
        Aluno aluno3 = new Aluno("Peter Weyland", 7734, 2005);

        // Adicionando alunos à turma
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        turma.addAluno(aluno3);

        // Impressão da descrição da turma
        System.out.println(turma.getDescricao());
    }
}
