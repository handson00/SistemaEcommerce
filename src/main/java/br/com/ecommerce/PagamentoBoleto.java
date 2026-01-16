package br.com.ecommerce;

import java.util.Date;

public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;
    private Date dataVencimento;
    
    public PagamentoBoleto(double valor, String codigoBarras, Date dataVencimento) {
        super(valor);
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Boleto gerado no valor de R$ " + valor);
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("Data de vencimento: " + dataVencimento);
    }

    public void processar() {
        processarPagamento();
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }
}
