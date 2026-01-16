package br.com.ecommerce;

import java.util.Date;

public abstract class Pagamento {
    protected double valor;
    protected Date dataPagamento;

    public Pagamento(double valor) {
        this.valor = valor;
        this.dataPagamento = new Date();
    }

    public abstract void processarPagamento();

    public double getValor() {
        return valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }
}
