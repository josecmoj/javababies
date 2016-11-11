package main.java.comunicacao.pedido;

import main.java.comunicacao.produto.ComunicacaoVisual;

public class Pedido extends ComunicacaoVisual {
    protected int numeroPedido;
    protected float valorPedido;
    //*protected String nomeProduto;
    //*protected String nomeCliente;
    //*protected  String nomeFuncionario;...

    public int getNumeroPedido() {
        return this.numeroPedido;
    }
    public void setNumeroPedido(int nomeJornal) {
        this.numeroPedido = numeroPedido;
    }
    public float getValorPedido() {
        return this.valorPedido;
    }
    public void setValorPedido(float valorPedido) {
        this.valorPedido = valorPedido;
    }





    }

