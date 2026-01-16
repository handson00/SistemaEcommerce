package br.com.ecommerce;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Pagamento pagamento;
    private Date data;
    private String status;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = new Date();
        this.itens = new ArrayList<>();
        this.status = "Pendente";
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void finalizarPedido(Pagamento formaPagamento) {
        this.pagamento = formaPagamento;
        this.status = "Finalizado";
        
        System.out.println("\n--- Resumo do Pedido ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + data);
        
        for (ItemPedido item : itens) {
            System.out.println("- " + item.getDetalhes() + ": R$ " + item.calcularSubtotal());
        }
        
        System.out.println("Total: R$ " + calcularTotal());
        this.pagamento.processarPagamento();
        System.out.println("------------------------");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public Date getData() {
        return data;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
