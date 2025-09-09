package ex08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner en = new Scanner(System.in);

	        System.out.print("Digite o número da conta: ");
	        int num = en.nextInt();
	        en.nextLine();
	        System.out.print("Digite o nome do titular: ");
	        String nome = en.nextLine();

	        Conta conta = new Conta(num, nome, 0);

	        boolean continuar = true;

	        while(continuar) {
	            System.out.println("1 - Alterar nome");
	            System.out.println("2 - Depósito");
	            System.out.println("3 - Saque");
	            System.out.println("4 - Mostrar dados");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            int opc = en.nextInt();
	            en.nextLine(); 

	            switch(opc) {
	                case 1:
	                    System.out.print("Digite novo nome: ");
	                    String novoNome = en.nextLine();
	                    conta.setNome(novoNome);
	                    break;
	                case 2:
	                    System.out.print("Digite valor do depósito: ");
	                    double valorDep = en.nextDouble();
	                    conta.depositar(valorDep);
	                    break;
	                case 3:
	                    System.out.print("Digite valor do saque: ");
	                    double valorSaq = en.nextDouble();
	                    conta.sacar(valorSaq);
	                    break;
	                case 4:
	                    conta.mostrarDados();
	                    break;
	                case 0:
	                    continuar = false;
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        }

	        System.out.println("Sistema encerrado.");
	        en.close();
	}

}
