package section04_exercicios;
import java.util.Locale;
import java.util.Scanner;
public class ExercicioUm {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, metroQuadrado, area, preco;

        System.out.println("Digite a largura: ");
        largura = sc.nextDouble();
        System.out.println("Digite a comprimento: ");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Preço = R$%.2f%n", preco);

        sc.close();
    }
}
