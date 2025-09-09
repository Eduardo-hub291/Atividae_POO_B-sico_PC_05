package ex06;

public class Quadrado {
	
    private double lado; 

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void mudarlado(double novoLado) {
        this.lado = novoLado;
    }

    public double retornalado() {
        return this.lado;
    }

    public double area() {
        return lado * lado;
    }

}
