package ex06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.print("Tamanho do lado: ");
        double ladinho = en.nextDouble();

        Quadrado q = new Quadrado(ladinho);

        System.out.println("Lado atual: " + q.retornalado());
        System.out.println("Área: " + q.area());

        System.out.print("Digite um novo valor para o lado: ");
        double novo = en.nextDouble();
        q.mudarlado(novo);

        System.out.println("Novo lado: " + q.retornalado());
        System.out.println("Nova área: " + q.area());

        en.close();
    
	}

}
