package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

    	 Carro carroUrbano = new Carro("Preto", 800, 200, "Supra");
    	
    	 System.out.println("\n---------//----------TESTE 1 (Criacao carro urbano)----------------//----------");
         System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia());

         System.out.println("\n-------------------TESTE 2 (Mudar peso.)------------------------");
         carroUrbano.mudarPeso(1100.0);
         System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia());
         
         System.out.println("\n-------------------TESTE 3 (Alterar potencia.)-----------");
         carroUrbano.alterarPotencia(120);
         System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia() + " - Modelo: " + carroUrbano.getModelo());
         
         carroUrbano.carroSeguro(1500.0);  // Seguro
         carroUrbano.validarPotencia(150); // Dentro do limite
         
    }
}