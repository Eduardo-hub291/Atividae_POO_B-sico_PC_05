package ex01;

public class Pessoa {
	
    String nome;
    String sobrenome;

    void falar() {
        System.out.println("Seu nome completo é "+ this.nome + " " + this.sobrenome);
    }
}
