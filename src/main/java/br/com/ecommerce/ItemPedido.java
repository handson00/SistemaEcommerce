package br.com.ecommerce;

public class ItemPedido {
    private int quantidade;
    private double precoUnitario;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public double calcularSubtotal() {
        return this.quantidade * this.precoUnitario;
    }

    public String getDetalhes() {
        return produto.getNome() + " (x" + quantidade + ")";
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
