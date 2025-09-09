package ex05;

public class Lanche {
    int cod;      
    String nome;  
    double preco; 
    int qtd;     

    public Lanche(int cod, String nome, double preco, int qtd) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public double valor() {
        return preco * qtd;
    }

    public void mostrar() {
        System.out.println(qtd + "x " + nome + " - R$ " + valor());
    }
}
