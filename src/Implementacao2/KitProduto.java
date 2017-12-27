package Implementacao2;

import java.util.ArrayList;
import java.util.List;

public class KitProduto implements Produto{

	private List<Produto> produtosDoKit;
	private String nomeKit;

	public KitProduto(List<Produto> produtosDoKit, String nomeKit) {
		this.produtosDoKit = produtosDoKit;
		this.nomeKit = nomeKit;
	}

	@Override
	public double getPreco() {
		double preco = 0;
		
		for (Produto produto : produtosDoKit) {
			preco += produto.getPreco();
		}
		
		return preco;
	}

	@Override
	public String obterProduto() {
		ArrayList<String> listaNomesProduto = new ArrayList<>();
		String stProduto = nomeKit +" que é composto por: ";
		listaNomesProduto.add(stProduto);
		
		for (Produto produto : produtosDoKit) {
			listaNomesProduto.add(produto.obterProduto());
		}
		
		String retorno = montarStringRetorno(listaNomesProduto);

		return retorno;
	}

	private String montarStringRetorno(ArrayList<String> listaNomesProduto) {
		String retorno = " ";
		
		for (String string : listaNomesProduto) {
			retorno += string+" ";
		}
		
		return retorno;
	}
	
	
}
