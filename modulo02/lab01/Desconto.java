import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Digite o valor da compra: ");
        double preco = scanner.nextDouble();
        double valorFinal;

        if (preco >= 200.0) {
            valorFinal = preco * 0.95; // Aplica 5% de desconto
        } else {
            valorFinal = preco;
        }

        // Imprime o valor final com duas casas decimais
        System.out.printf("%.2f\n", valorFinal);

        scanner.close();
    }
}
