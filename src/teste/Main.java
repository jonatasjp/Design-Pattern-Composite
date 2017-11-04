package teste;

import implementacao.TrechoAereoComConexao;
import implementacao.TrechoAereoComEscala;
import implementacao.TrechoAereoSimples;

public class Main {

	public static void main(String[] args) {
		
		TrechoAereoSimples ts1 = new TrechoAereoSimples("São Paulo", "Brasília", 500);
		TrechoAereoSimples ts2 = new TrechoAereoSimples("Brasília", "Recife", 300);
		TrechoAereoSimples ts3 = new TrechoAereoSimples("Recife","Natal", 350);
		TrechoAereoSimples ts4 = new TrechoAereoSimples("Natal","Fortaleza", 350);

		TrechoAereoComEscala tc1 = new TrechoAereoComEscala(ts2, ts3);
		TrechoAereoComEscala tc2 = new TrechoAereoComEscala(ts1, tc1);
		
		System.out.println(tc1.getValor()); //tem que ser igual a 650.
		System.out.println(tc2.getValor()); //tem que ser igual a 1150.
		
		TrechoAereoComConexao conexao = new TrechoAereoComConexao(tc1, ts4, 50);
		System.out.println(conexao.getValor()); //tem que ser igual a 1050.		
		
	}
}
