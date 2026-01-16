package br.com.ecommerce;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        // Criando produtos
        Produto p1 = new Produto("Teclado Mecânico", 250.00);
        Produto p2 = new Produto("Mouse Gamer", 120.00);

        // Criando cliente
        Cliente cliente = new Cliente("Handson", "handson@email.com");
        
        // Iniciando pedido
        Pedido pedido = new Pedido(cliente);

        // Adicionando itens
        pedido.adicionarItem(p1, 1);
        pedido.adicionarItem(p2, 2);

        // Calculando total
        double total = pedido.calcularTotal();

        // Pagando com cartão
        Pagamento pgto = new PagamentoCartao(total, "1234567812349999", 3);
        
        // Finalizando o pedido
        pedido.finalizarPedido(pgto);
    }
}
