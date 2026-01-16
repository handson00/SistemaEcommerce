package br.com.ecommerce;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void realizarPedido(Pedido pedido) {
        System.out.println("Pedido realizado por " + this.nome);
    }
}
