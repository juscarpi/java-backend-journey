import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("MODULO 04: ESTRUTURA SEQUENCIAL");
        System.out.println("------------------------------------------------");
        System.out.println("Este projeto contém os exercícios práticos do curso.");
        System.out.println("------------------------------------------------");

        System.out.println("Teste rápido de processamento:");
        System.out.print("Digite um número para calcular a raiz quadrada: ");

        double x = sc.nextDouble();
        double raiz = Math.sqrt(x);

        System.out.printf("A raiz quadrada de %.2f é %.4f%n", x, raiz);
        System.out.println("------------------------------------------------");

        sc.close();
    }
}