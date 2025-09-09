package ex04;

public class Salario {
    private double valorHora;
    private double horas;

    public Salario(double valorHora, double horas) {
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public double bruto() {
        return valorHora * horas;
    }

    public double ir() {
        return bruto() * 0.11;
    }

    public double inss() {
        return bruto() * 0.08;
    }

    public double sind() {
        return bruto() * 0.05;
    }

    public double descontoTotal() {
        return ir() + inss() + sind();
    }

    public double liquido() {
        return bruto() - descontoTotal();
    }

    public void mostrar() {
        System.out.println("Salário Bruto  : R$ " + bruto());
        System.out.println("- IR (11%)     : R$ " + ir());
        System.out.println("- INSS (8%)    : R$ " + inss());
        System.out.println("- Sindicato(5%): R$ " + sind());
        System.out.println("Salário Líquido: R$ " + liquido());
    }
}
