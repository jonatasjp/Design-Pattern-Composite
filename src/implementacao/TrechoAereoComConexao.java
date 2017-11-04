package implementacao;

public class TrechoAereoComConexao extends TrechoAereoComEscala{

	private double taxaconexao;
	
	public TrechoAereoComConexao(TrechoAereo trechoInicio, TrechoAereo trechoFim, double taxaconexao) {
		super(trechoInicio, trechoFim);
		this.taxaconexao = taxaconexao;
	}
	
	@Override
	public double getValor() {
		return  getTrechoInicio().getValor() + getTrechoFim().getValor() + this.taxaconexao;
	}

}
