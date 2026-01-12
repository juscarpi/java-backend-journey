package section04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, resultado;

        System.out.println("Digite dois números inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        resultado = a + b;

        System.out.printf("Resultado: %d\n", resultado);

        sc.close();
    }
}
