package section04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste
        //círculo com quatro casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, pi, area;

        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi * Math.pow(raio, 2);

        System.out.printf("A area do circulo é %.4f", area);

        sc.close();
    }
}
