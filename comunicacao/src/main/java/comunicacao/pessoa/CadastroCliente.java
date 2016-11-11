package main.java.comunicacao.pessoa;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente wrkcliente = new Cliente();
        wrkcliente.setNome("Nome1");
        wrkcliente.setCgccpf(1234);
        wrkcliente.setTipopessoa("PF");
        System.out.println("CGCCPF : " + wrkcliente.getCgccpf());
        System.out.println("NOME   : " + wrkcliente.getNome());
        System.out.println("TIPO   : " + wrkcliente.getTipopessoa());
    }
}
