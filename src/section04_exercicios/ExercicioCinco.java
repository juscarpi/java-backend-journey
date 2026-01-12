package section04_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe
        //por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com
        //duas casas decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        System.out.println("Número do funcionário: ");
        numero =  sc.nextInt();
        System.out.println("Horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.println("Valor por hora: ");
        valorHora = sc.nextDouble();
        salario = horas * valorHora;

        System.out.printf("O funcionario "+ numero + " recebe o salário de R$%.2f%n", salario);

    }
}
