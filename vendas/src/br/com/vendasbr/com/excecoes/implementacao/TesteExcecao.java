package br.com.vendasbr.com.excecoes.implementacao;

import tratarexcecao.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		int numero = Integer.parseInt("7");
		System.out.println("número:" + numero);
		
		String palavra = "";
		System.out.println("quantidade:" + palavra.length());
		
		int[] valores = new int[2];
		valores[0] = 541;
		valores[1] =82;
		valores[2] =10;

	
		}		
		  catch(Exception e) {
			  System.out.println("quantidade:" + MinhaExcecao.tratar(e));
			//System.out.println("deu pau" + e);
			//e.printStackTrace();
		}
		
		

	}

}
