package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lista = new ArrayList<String>();
		lista.add("Analista");
		lista.add("Estagiario");
		lista.add("DBA");
		lista.add("developer");
		lista.add("tester");
		System.out.println(lista);
		Collections.sort(lista);
		
		System.out.println("ordenar" + lista);
		System.out.println("ordenar" + lista.get(2));
		lista.remove(3);
		System.out.println("ordenar" + lista);
		//ArrayList<String> lista2 = new ArrayList<String>();
		//int[] numeros = new int[5];
		//numeros [0] =1;
		
		
		
		
	}

}
