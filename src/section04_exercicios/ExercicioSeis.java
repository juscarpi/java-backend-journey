package section04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1, peca2, quantidade1, quantidade2;
        double preco1, preco2, total;

        System.out.println("Digite o código, a quantidade e o valor unitário da peça:");
        peca1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        preco1 = sc.nextDouble();

        System.out.println("Digite o código, a quantidade e o valor unitário da peça:");
        peca2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * quantidade1 + preco2 * quantidade2;

        System.out.printf("Valor a pagar: R$%.2f", total);

        sc.close();
    }
}
