import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        int consumo = scanner.nextInt();
        char tipo = scanner.next().toUpperCase().charAt(0); // Converte para maiúsculo

        double preco = -1.00; // Valor padrão para erro

        if (consumo < 0) {
            // Consumo negativo é inválido
            preco = -1.00;
        } else {
            switch (tipo) {
                case 'R':
                    preco = consumo <= 500 ? consumo * 0.40 : consumo * 0.65;
                    break;
                case 'C':
                    preco = consumo <= 1000 ? consumo * 0.55 : consumo * 0.60;
                    break;
                case 'I':
                    preco = consumo <= 5000 ? consumo * 0.55 : consumo * 0.60;
                    break;
                default:
                    preco = -1.00; // Tipo inválido
                    break;
            }
        }

        // Saída com duas casas decimais
        System.out.printf("%.2f\n", preco);

        scanner.close();
    }
}
