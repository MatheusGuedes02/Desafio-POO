package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

    	 Carro carroUrbano = new Carro("Preto", 800, 200);
    	
    	 System.out.println("\n---------//----------TESTE 1 (Criacao carro urbano)----------------//----------");
         System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia());

         System.out.println("\n-------------------TESTE 2 (Mudar peso.)------------------------");
         carroUrbano.mudarPeso(1100.0);
         System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia());
         
         System.out.println("\n-------------------TESTE 3 (Alterar potencia.)-----------");
         carroUrbano.alterarPotencia(120);
         System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia());
         
         carroUrbano.carroSeguro(1500.0);  // Seguro
         carroUrbano.validarPotencia(150); // Dentro do limite
         
         
         Carro carroEsportivo = new Carro("Vermelho", 900, 460);
         System.out.println("\n------//-------------TESTE 1 (Criacao carro Esportivo)----------------//----------");
         System.out.println("Cor: " + carroEsportivo.getCor() + " - Peso: " + carroEsportivo.getPeso() + " - Potencia: " + carroEsportivo.getPotencia());
         
         
         System.out.println("\n-------------------TESTE 2 (Mudar peso.)------------------------");
         carroUrbano.mudarPeso(1800.0);
         System.out.println("Cor: " + carroEsportivo.getCor() + " - Peso: " + carroEsportivo.getPeso() + " - Potencia: " + carroEsportivo.getPotencia());
         
         
         System.out.println("\n-------------------TESTE 3 (Alterar potencia.)-----------");
         carroUrbano.alterarPotencia(750);
         System.out.println("Cor: " + carroEsportivo.getCor() + " - Peso: " + carroEsportivo.getPeso() + " - Potencia: " + carroEsportivo.getPotencia());

         carroEsportivo.carroSeguro(1200.0);  // Reprova: peso acima do limite
         carroEsportivo.validarPotencia(500); // Reprova: potência acima do limite
         
         
         Carro carroTesteLimite = new Carro("Vermelho", 900, 460);
         System.out.println("\n------//-------------TESTE 1 (Criacao carro Testar limites)--------//------------------");
         System.out.println("Cor: " + carroTesteLimite.getCor() + " - Peso: " + carroTesteLimite.getPeso() + " - Potencia: " + carroTesteLimite.getPotencia());
         
         
         System.out.println("\n-------------------TESTE 2 (Mudar peso.)------------------------");
         System.out.println("Tentando atribuir peso -500kg:");
         carroUrbano.mudarPeso(-500.0);
         System.out.println("Cor: " + carroTesteLimite.getCor() + " - Peso: " + carroTesteLimite.getPeso() + " - Potencia: " + carroTesteLimite.getPotencia());
         
         
         System.out.println("\n-------------------TESTE 3 (Alterar potencia.)-----------");
         System.out.println("Tentando atribuir potência -50cv:");
         carroUrbano.alterarPotencia(-50);
         System.out.println("Cor: " + carroTesteLimite.getCor() + " - Peso: " + carroTesteLimite.getPeso() + " - Potencia: " + carroTesteLimite.getPotencia());

         	
         System.out.println("Testando limite exato de potência:");
         carroTesteLimite.alterarPotencia(200);
         carroTesteLimite.validarPotencia(200); // Exatamente no limite

    }
}