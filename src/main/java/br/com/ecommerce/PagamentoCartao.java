package br.com.ecommerce;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(double valor, String numeroCartao, int parcelas) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        String finalCartao = numeroCartao.length() > 4 ? 
            numeroCartao.substring(numeroCartao.length() - 4) : "xxxx";
            
        System.out.println("Pagamento de R$ " + valor + " no cartão final " + 
            finalCartao + " em " + parcelas + "x.");
    }

    public void processar() {
        processarPagamento();
    }

    public String getUltimos4Digitos() {
        return numeroCartao.length() > 4 ? 
            numeroCartao.substring(numeroCartao.length() - 4) : "xxxx";
    }
}
