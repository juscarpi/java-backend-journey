package section04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicoSete {
    public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida,
        // calcule e mostre:

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, pi, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        System.out.println("Digite os valores de A, B e C: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        pi = 3.14159;

        areaTriangulo = (A * C) / 2;
        areaCirculo = Math.pow(C,2) * pi;
        areaTrapezio = ((A + B) * C) / 2;
        areaQuadrado = Math.pow(B,2);
        areaRetangulo = A * B;

        System.out.printf("a) A área do triângulo retângulo que tem A por base e C por altura: %.3f%n", areaTriangulo);
        System.out.printf("b) A área do círculo de raio C: %.3f%n", areaCirculo);
        System.out.printf("c) A área do trapézio que tem A e B por bases e C por altura: %.3f%n", areaTrapezio);
        System.out.printf("d) A área do quadrado que tem lado B: %.3f%n", areaQuadrado);
        System.out.printf("e) A área do retângulo que tem lados A e B: %.3f%n", areaRetangulo);

        sc.close();
    }
}
