package ex08;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldoInicial) {
        this.numero = numero;
        this.nome = nome;
        if(saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void mostrarDados() {
        System.out.println("Conta nº: " + numero);
        System.out.println("Titular: " + nome);
        System.out.println("Saldo: R$ " + saldo);
    }
}
