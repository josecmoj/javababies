package br.com.javababies.politica.cargo;

public enum CargoCandidatoEnum {
	PRESIDENTE(2), 
	PREFEITO(2), 
	GOVERNADOR(4), 
	VEREADOR(5), 
	DEPUTADOESTADUAL(5), 
	DEPUTADOFEDERAL(5);
	
	private int numero;

	CargoCandidatoEnum(int numeroCandidato) {
		this.numero = numeroCandidato;
	}
	
	public int numero() {
		return numero;
	}

}	 
	
