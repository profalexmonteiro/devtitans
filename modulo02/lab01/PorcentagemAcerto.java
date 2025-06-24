import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do vetor de respostas
        int[] respostas = new int[100]; // tamanho arbitrário suficiente
        int tamanho = 0;
        while (true) {
            int valor = scanner.nextInt();
            if (valor == -1) break;
            respostas[tamanho++] = valor;
        }

        // Leitura do vetor gabarito
        int[] gabarito = new int[tamanho]; // mesmo tamanho das respostas
        for (int i = 0; i < tamanho; i++) {
            gabarito[i] = scanner.nextInt();
        }
        // Consome o -1 final
        scanner.nextInt();

        // Cálculo dos acertos
        int acertos = 0;
        for (int i = 0; i < tamanho; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }

        // Cálculo da porcentagem
        double porcentagem = (acertos * 100.0) / tamanho;
        System.out.printf("%.2f\n", porcentagem);

        scanner.close();
    }
}
