package br.com.concessionariarubinho.testes;

import javax.swing.JOptionPane;

import br.com.concessionariarubinho.modelo.CarroFormula1;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarroFormula1 objeto = new CarroFormula1();
		
		
		
		
		
		
		objeto.preencherEscuderia(JOptionPane.showInputDialog("Escuderia"));
		objeto.preencherCor(JOptionPane.showInputDialog("Cor"));
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Valor")));
		objeto.ligar();
		objeto.acelerar(20);
		objeto.acelerar(20);
		System.out.println("velocidade"+ objeto.retornarVelocidade());
		System.out.println(objeto.ligar());
		objeto.brecar();
		System.out.println("velocidade"+ objeto.retornarVelocidade());
		System.out.println(objeto.desligar());
		
		
		
		System.out.println(objeto.retornarEscuderia());
		System.out.println(objeto.retornarCor());
		System.out.println(objeto.retornarValor());

	}

}
