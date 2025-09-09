package ex02;

public class Intervalo {
	
  private int inicio;
    private int fim;

    public Intervalo(int inicio, int fim) {
        if (inicio > fim) {
            System.out.println("O início está maior que o fim, então serão invertidos.");
            this.inicio = fim;
            this.fim = inicio;
        } else {
            this.inicio = inicio;
            this.fim = fim;
        }
    }

    public void mostrarNumeros() {
        System.out.println("Números do intervalo:");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }

}
