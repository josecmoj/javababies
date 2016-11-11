package main.java.comunicacao.pessoa;


public class Cliente extends Pessoa {
    protected int pedidoCliente;

    public int getPedidoCliente() {
        return this.pedidoCliente;
    }
    public void setPedidoCliente(int pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }


}
