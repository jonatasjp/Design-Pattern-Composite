package Implementacao2;

public class ProdutoSimples implements Produto{
	
	private double preco;
	private String nome;
	
	public ProdutoSimples(double preco, String nome) {
		this.preco = preco;
		this.nome = nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public String obterProduto() {
		return nome;
	}
	
	
}
