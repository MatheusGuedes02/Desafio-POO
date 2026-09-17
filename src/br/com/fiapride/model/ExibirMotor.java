package br.com.fiapride.model;

public class ExibirMotor {
	private int cavalos;
	private String fabricante;
	private String forma;
	
	private Carro veiculo;
	
	public ExibirMotor(int cavalos, String fabricante, String forma, Carro veiculo) {
		super();
		this.cavalos = cavalos;
		this.fabricante = fabricante;
		this.forma = forma;
		this.veiculo = veiculo;
		
		System.out.println("Nova solicitação de motor para o veiculo: " + veiculo.getModelo());
	}
	public void resumoMotor() {
		System.out.println("-----------Resumo do motor do carro: " + this.veiculo + "----------------------");
		
		System.out.println("Cavalos do motor: " + this.cavalos);
		System.out.println("Fabricante do motor: " + this.fabricante);
		System.out.println("Forma do motor: " + this.forma);
	}
	
	
	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public Carro getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Carro veiculo) {
		this.veiculo = veiculo;
	}
}
