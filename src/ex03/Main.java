package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = en.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = en.nextDouble();

        Calculo calc = new Calculo(n1, n2);

        System.out.println("Soma: " + calc.soma());
        System.out.println("Subtração: " + calc.sub());
        System.out.println("Multiplicação: " + calc.multi());
        System.out.println("Divisão: " + calc.div());

        en.close();
    }
}


