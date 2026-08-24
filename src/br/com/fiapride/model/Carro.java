package br.com.fiapride.model;

public class Carro {

    public String cor;
    public double peso;
    public int potencia;

    // Altera o peso garantindo 	que não seja negativo ou zero
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
}