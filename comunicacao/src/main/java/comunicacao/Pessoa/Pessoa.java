package main.java.comunicacao.pessoa;

public abstract class Pessoa {
    private int CGCCPF;
    private String nome;
    private String tipoPessoa;

    /** Metodos Personalizados
    **/
    public void status(){
        System.out.println("CGCCPF : " + getCgccpf());
        System.out.println ("NOME  : " + getNome());
        System.out.println ("TIPO  : " + getTipoPessoa());
    }
    public abstract void exibeDados();
    

    /** Metodos Especiais
    **/
    public int getCgccpf() {
        return this.CGCCPF;
    }
    private void setCgccpf(int cgccpf) {
        this.CGCCPF = cgccpf;
    }

    public String getNome() {
        return this.nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPessoa() {
        return this.tipoPessoa;
    }
    private void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Pessoa(String nome, String tipoPessoa,int CGCCPF){
    	setNome(nome);
    	setTipoPessoa(tipoPessoa);
    	setCgccpf(CGCCPF);
    }
    
    
    
}
