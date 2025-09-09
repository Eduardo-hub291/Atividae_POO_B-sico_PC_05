package ex05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		   Scanner en = new Scanner(System.in);

	        double total = 0;
	        boolean continuar = true;

	        while (continuar) {
	            System.out.print("Digite o código do lanche (100-105) ou 0 para finalizar: ");
	            int cod = en.nextInt();
	            if (cod == 0) break;

	            System.out.print("Quantidade: ");
	            int qtd = en.nextInt();

	            String nome = "";
	            double preco = 0;

	            switch (cod) {
	                case 100: nome = "Cachorro Quente"; preco = 1.20; break;
	                case 101: nome = "Bauru Simples"; preco = 1.30; break;
	                case 102: nome = "Bauru com Ovo"; preco = 1.50; break;
	                case 103: nome = "Hambúrguer"; preco = 1.20; break;
	                case 104: nome = "Cheeseburguer"; preco = 1.30; break;
	                case 105: nome = "Refrigerante"; preco = 1.00; break;
	                default:
	                    System.out.println("Error!!!");
	                    continue;
	            }

	            Lanche item = new Lanche(cod, nome, preco, qtd);
	            item.mostrar();
	            total += item.valor();
	        }

	        System.out.println("Total do pedido: R$" + total);
	        en.close();
	}

}
