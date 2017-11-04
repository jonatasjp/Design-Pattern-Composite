package implementacao;

public class TrechoAereoComEscala implements TrechoAereo {

	private TrechoAereo trechoInicio;
	private TrechoAereo trechoFim;
	
	public TrechoAereoComEscala(TrechoAereo trechoInicio, TrechoAereo trechoFim) {
		this.trechoInicio = trechoInicio;
		this.trechoFim = trechoFim;
		if(trechoInicio.getDestino() != trechoFim.getOrigem())
			throw new RuntimeException("O destino do primeiro trecho não é igual a origem do segundo");
	}

	@Override
	public String getOrigem() {
		return trechoInicio.getOrigem();
	}

	@Override
	public String getDestino() {
		return trechoFim.getDestino();
	}

	@Override
	public double getValor() {
		return this.trechoInicio.getValor() + this.trechoFim.getValor();
	}

	public TrechoAereo getTrechoInicio() {
		return trechoInicio;
	}

	public TrechoAereo getTrechoFim() {
		return trechoFim;
	}

}