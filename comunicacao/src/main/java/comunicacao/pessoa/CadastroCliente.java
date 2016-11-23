package main.java.comunicacao.pessoa;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente wrkcliente;
        wrkcliente = new Cliente("Cliente1","PJ",98765);
        /*wrkcliente.setNome("Cliente1");
        wrkcliente.setCgccpf(98765);
        wrkcliente.setTipopessoa("PJ");*/
      wrkcliente.exibeDados();
    }
}
