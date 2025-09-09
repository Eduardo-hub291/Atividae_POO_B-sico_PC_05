package ex03;

public class Calculo {
	 private double n1; 
	 private double n2;

	    // Construtor
	    public Calculo(double n1, double n2) {
	        this.n1 = n1;
	        this.n2 = n2;
	    }

	    public double soma() {
	        return n1 + n2;
	    }

	    public double sub() {
	        return n1 - n2;
	    }

	    public double multi() {
	        return n1 * n2;
	    }

	    public double div() {
	        if (n2 != 0) {
	            return n1 / n2;
	        } else {
	            System.out.println("Erro: divisão por zero!");
	            return 0;
	        }
	    }
}
