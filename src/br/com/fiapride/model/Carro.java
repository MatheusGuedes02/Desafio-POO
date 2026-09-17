package br.com.fiapride.model;

public class Carro {

    private String cor;
    private double peso;
    private int potencia;
    private String modelo;
    
    public Carro(String cor, double peso, int potencia, String modelo){
    	this.setCor(cor);
    	this.setPeso(peso);
    	this.setPotencia(potencia);
    	this.setModelo(modelo);
    }
    public boolean mudarPeso(double novoPeso) {
        if (novoPeso > 0) {
            this.peso = novoPeso;
            System.out.println("Peso alterado para: " + this.peso + " kg");
            return true;
        } else {
            System.out.println("ERRO: O peso deve ser maior que zero!");
            return false;
        }
    }
    // Altera a potência garantindo que não seja negativa
    public boolean alterarPotencia(int novaPotencia) {
        if (novaPotencia >= 0) {
            this.potencia = novaPotencia;
            System.out.println("Potência alterada para: " + this.potencia + " cv");
            return true;
        } else {
            System.out.println("ERRO: A potência não pode ser negativa!");
            return false;
        }
    }
    // Verifica se o peso está dentro do limite seguro
    public boolean carroSeguro(double pesoLimite) {
        if (this.peso <= 0) {
            System.out.println("ALERTA: Carro com peso inconsistente!");
            return false;
        }
        
        if (this.peso <= pesoLimite) {
            System.out.println("Carro seguro (Peso dentro do limite)");
            return true;
        } else {
            System.out.println("Carro potencialmente perigoso (Excesso de peso)");
            return false;
        }
    }
 // Valida se a potência está dentro do limite máximo permitido
    public boolean validarPotencia(int potenciaMax) {
        if (this.potencia > potenciaMax) {
            System.out.println("O carro ultrapassa o limite de potência da via!");
            return false;
        } else {
            System.out.println("O carro está dentro do limite de potência permitido.");
            return true;
        }
    }
    
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
    
}