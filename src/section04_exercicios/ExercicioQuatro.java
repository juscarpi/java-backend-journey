package section04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do
        //produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, produto;

        System.out.println("Digite o4 numeros inteiros: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        produto = (A * B) - (C * D);

        System.out.printf("A diferença é %d\n", produto);

        sc.close();
    }
}
