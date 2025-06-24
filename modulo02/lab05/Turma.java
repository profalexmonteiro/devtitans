package Escola;
import java.util.ArrayList;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios;

    // Construtor padrão
    public Turma() {
        this("", "", 0, false);
    }

    // Construtor com parâmetros
    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<>();
    }

    // Adiciona um horário à lista
    public void addHorario(int horario) {
        horarios.add(horario);
    }

    // Converte número do horário em dia e hora formatada
    private String horarioParaString(int numero) {
        String[] dias = { "segunda", "terça", "quarta", "quinta", "sexta" };
        int[][] tabela = new int[7][5];
        int count = 0;
        for (int i = 0; i < 7; i++) {
            
            count = i + 1;   

            for (int j = 0; j < 5; j++) {
                tabela[i][j] = count;
               
                count += 7;
            }
              
           
        }

        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                if (tabela[i][j] == numero) {
                    int hora = 8 + i * 2;
                    return dias[j] + " " + hora + "hs";
                }
            }
        }
        return "horário inválido";
    }

    // Retorna string com todos os horários formatados
    public String getHorariosString() {
        ArrayList<String> strings = new ArrayList<>();
        for (int h : horarios) {
            strings.add(horarioParaString(h));
        }
        return String.join(", ", strings);
    }

    // Retorna descrição completa da turma
    public String getDescricao() {
        return "Turma: " + nome + "\n" +
               "Professor: " + professor + "\n" +
               "Número de Alunos: " + numAlunos + "\n" +
               "Horário: " + getHorariosString() + "\n" +
               "Acessível: " + (acessivel ? "sim" : "não");
    }
}
