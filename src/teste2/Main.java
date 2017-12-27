package teste2;

import java.util.Arrays;
import java.util.List;

import Implementacao2.KitProduto;
import Implementacao2.Produto;
import Implementacao2.ProdutoSimples;

public class Main {

	public static void main(String[] args) {
		
		Produto produto = new ProdutoSimples(10, "Carrinho");
		Produto produto1 = new ProdutoSimples(20, "Boneco");
		Produto produto2 = new ProdutoSimples(20, "boneca");
		
		List<Produto> produtosDoKit = Arrays.asList(produto, produto1, produto2);
		Produto produto3 = new KitProduto(produtosDoKit, "KIT 1");
		
		Produto produto4 = new ProdutoSimples(20, "Boneco");
		Produto produto5 = new ProdutoSimples(20, "boneca");

		List<Produto> novoKit = Arrays.asList(produto3, produto4, produto5);
		Produto produto6 = new KitProduto(novoKit, "KIT 2");
		
		System.out.println(produto6.getPreco());
		System.out.println(produto6.obterProduto());
		
	}
	
}
