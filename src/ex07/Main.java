package ex07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

		Pessoa p1 = new Pessoa();
		p1.setNome("Eduardo");
		p1.setIdade(18);
		p1.setPeso(58.0);
		p1.setAltura(165.0);
        p1.mostrarDados();

        System.out.println("Envelhecer quantos anos?");
        int anosvelhos = en.nextInt();
        p1.envelhecer(anosvelhos);
        
        System.out.println("Engordar quantos quilos?");
        double engordada = en.nextDouble();
        p1.engordar(engordada);
        
        System.out.println("Emagreceu quantos quilos?");
        double secada = en.nextDouble();
        p1.emagrecer(secada);

        System.out.println("Cresceu quantos centímetros?");
        double crescida = en.nextDouble();
        p1.crescer(crescida);

        p1.mostrarDados();


        
		en.close();
	}

}
