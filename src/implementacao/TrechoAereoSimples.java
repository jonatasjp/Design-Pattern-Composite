package implementacao;

public class TrechoAereoSimples implements TrechoAereo{

	private String origem;
	private String destino;
	private double valor;
	
	public TrechoAereoSimples(String origem, String destino, double valor) {
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
	}

	@Override
	public String getOrigem() {
		return this.origem;
	}

	@Override
	public String getDestino() {
		return this.destino;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

}
