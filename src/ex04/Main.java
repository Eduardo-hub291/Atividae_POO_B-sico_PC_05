package ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner en = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$ ");
        double vh = en.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        double h = en.nextDouble();

        Salario sal = new Salario(vh, h);

        sal.mostrar();
        
        en.close();
    }
}


