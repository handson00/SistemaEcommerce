package br.com.ecommerce;

public class PagamentoPix extends Pagamento {
    private String chavePix;
    private String qrCode;

    public PagamentoPix(double valor, String chavePix, String qrCode) {
        super(valor);
        this.chavePix = chavePix;
        this.qrCode = qrCode;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX de R$ " + valor + " para chave: " + chavePix);
        System.out.println("QR Code: " + qrCode);
    }

    public void processar() {
        processarPagamento();
    }

    public String getChavePix() {
        return chavePix;
    }

    public String getQrCode() {
        return qrCode;
    }
}
