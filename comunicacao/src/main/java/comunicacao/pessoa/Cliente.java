package main.java.comunicacao.pessoa;

public class Cliente extends Pessoa {
    public Cliente(String nome, String tipoPessoa, int CGCCPF) {
		super(nome, tipoPessoa, CGCCPF);
		// TODO Auto-generated constructor stub
	}
	protected int pedidoCliente;

    public int getPedidoCliente() {
        return this.pedidoCliente;
    }
    public void setPedidoCliente(int pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }
	@Override
	public void exibeDados() {
		  System.out.println("CGCCPF : " + this.getCgccpf());
	      System.out.println("NOME   : " + this.getNome());
	      System.out.println("TIPO   : " + this.getTipoPessoa());
	      System.out.println("\n");
	}
}
