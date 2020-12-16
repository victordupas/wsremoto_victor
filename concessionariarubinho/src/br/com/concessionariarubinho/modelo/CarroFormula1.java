package br.com.concessionariarubinho.modelo;

public class CarroFormula1 {

	
	
	private String cor;
	private float Valor;
	private String escuderia;
	private float velocidade;
	private boolean status;
	
	
	//Sintaxe método:
	//<modificador><tipo do retorno>(<TipoParam><Nome do parametro>)
	
	public void preencherEscuderia (String param) {
		escuderia  =param.toUpperCase();
	}
	
	
	public void preencherCor (String param) {
		cor  =param.toUpperCase();
	}
	
	public void preencherValor (float param) {
		if(param>0) {
			Valor  =param;	
		}
		
	}
	
	
	 public String retornarEscuderia() {
		return escuderia;
		 
	}
	 
	 public String retornarCor() {
		return cor;
		 
	}
	 
	 public float retornarValor() {
		return Valor;
		 
	}	 

	 
	 public float retornarVelocidade() {
		return velocidade;
		 
	}	 
	 
	public String ligar() {
		if(status==true) {
			return "carro ja estava ligado";
		}
		status = true;
		return "carro ligado com sucesso";
		
	}
	
	
	public String desligar() {
		if(status==false) {
			return "carro ja estava desligado";
		}
		status = false;
		velocidade=0;
		return "carro desligado com sucesso";
		
	}	
	
	
	
	public void acelerar(float param) {
		if(param>0 && status==true) {
			velocidade+=param;
			
		}
		
	}
	
	public void brecar() {
		
		if(status == true) {
			velocidade = 0;
		}
		
	}
	
	
	
	
	
	
	
	
}
