import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Digite a quantidade de linhas (e colunas): ");
        int tamanho = scanner.nextInt();

        for (int i = 0; i < tamanho; i++) {
            // Se for uma linha ímpar (1, 3, 5...), imprime espaço antes
            if (i % 2 != 0) {
                System.out.print(" ");
            }

            // Imprime a linha com "tamanho" asteriscos, separados por espaço
            for (int j = 0; j < tamanho; j++) {
                System.out.print("* ");
            }

            // Pula para a próxima linha
            System.out.println();
        }

        scanner.close();
    }
}
