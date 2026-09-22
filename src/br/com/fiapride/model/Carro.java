package br.com.fiapride.model;

public class Carro {
    private String cor;
    private double peso;
    private int potencia;
    private String modelo;

    // Construtor sem dependencias de setters publicos
    public Carro(String cor, double peso, int potencia, String modelo) {
        this.cor = cor;
        this.peso = peso;
        this.potencia = potencia;
        this.modelo = modelo;
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

    public boolean validarPotencia(int potenciaMax) {
        if (this.potencia > potenciaMax) {
            System.out.println("O carro ultrapassa o limite de potência da via!");
            return false;
        } else {
            System.out.println("O carro está dentro do limite de potência permitido.");
            return true;
        }
    }

    // Apenas os Getters continuam públicos
    public String getCor() {
        return cor;
    }

    public double getPeso() {
        return peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getModelo() {
        return modelo;
    }
}