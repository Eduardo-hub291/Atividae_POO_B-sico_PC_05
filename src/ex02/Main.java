package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = en.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = en.nextInt();

        // Cria o objeto Intervalo
        Intervalo intervalo = new Intervalo(num1, num2);

        // Mostra os números
        intervalo.mostrarNumeros();

        en.close();
    }

}
