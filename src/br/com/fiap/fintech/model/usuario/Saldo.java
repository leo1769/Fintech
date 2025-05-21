package br.com.fiap.fintech.model.usuario;

public class Saldo {

    private double saldo;

    public Saldo() {
    }
    public Saldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void adicionarSaldo(double valor) {
        this.saldo += valor;
    }
    public void subtrairSaldo(double valor) {
        this.saldo -= valor;
    }
}

