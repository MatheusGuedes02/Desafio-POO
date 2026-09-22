package br.com.fiapride.model;

public class ExibirMotor {
	private int cavalos;
	private String fabricante;
	private String forma;
	private Carro veiculo;
	
	// Construtor
	public ExibirMotor(int cavalos, String fabricante, String forma, Carro veiculo) {
		super();
		this.cavalos = cavalos;
		this.fabricante = fabricante;
		this.forma = forma;
		this.veiculo = veiculo;
		
		System.out.println("Nova solicitação de motor para o veiculo: " + veiculo.getModelo());
	}
	
	// Mostra dados do motor do carro atual
	public void resumoMotor() {
		// feat: Usando getModelo() para exibir o nome em vez do hash de memória do objeto
		System.out.println("\n-----------Resumo do motor do carro: " + this.veiculo.getModelo() + "----------------------");
		
		System.out.println("Cavalos do motor: " + this.cavalos);
		System.out.println("Fabricante do motor: " + this.fabricante);
		System.out.println("Forma do motor: " + this.forma);
	}
	
	// Apenas os métodos Getters foram mantidos
	public int getCavalos() {
		return cavalos;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getForma() {
		return forma;
	}

	public Carro getVeiculo() {
		return veiculo;
	}
}