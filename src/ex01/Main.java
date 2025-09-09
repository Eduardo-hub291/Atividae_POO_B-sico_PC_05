package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

		Pessoa p1 = new Pessoa();  
		 System.out.print("Digite seu nome: ");
	        p1.nome = en.nextLine();

	        System.out.print("Digite seu sobrenome: ");
	        p1.sobrenome = en.nextLine();
        p1.falar(); 	
        
        en.close();
	}
	


}
