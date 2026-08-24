package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println(" TESTE 1: Fluxo Normal (Valores Válidos)");
        Carro carroUrbano = new Carro();
        carroUrbano.cor = "Azul";
        carroUrbano.mudarPeso(1100.0);
        carroUrbano.alterarPotencia(120);

        carroUrbano.carroSeguro(1500.0);  // Seguro
        carroUrbano.validarPotencia(150); // Dentro do limite

        System.out.println("\n TESTE 2: Limite Máximo Excedido ===");
        Carro carroEsportivo = new Carro();
        carroEsportivo.cor = "Vermelho";
        carroEsportivo.mudarPeso(1800.0);
        carroEsportivo.alterarPotencia(750);

        carroEsportivo.carroSeguro(1200.0);  // Reprova: peso acima do limite
        carroEsportivo.validarPotencia(500); // Reprova: potência acima do limite

        System.out.println("\n TESTE 3: Valores Inválidos e Inconsistentes (Proteção de Estado");
        Carro carroTesteLimite = new Carro();
        carroTesteLimite.cor = "Cinza";

        // Tentativa 1: peso negativo (Proteção de Estado)
        System.out.println("Tentando atribuir peso -500kg:");
        carroTesteLimite.mudarPeso(-500.0); 

        // Tentativa 2: Inserir potência negativa (Proteção de Estado)
        System.out.println("Tentando atribuir potência -50cv:");
        carroTesteLimite.alterarPotencia(-50);

        // Tentativa 3: Testar limites exatos (Borda: limite igual à potência)
        System.out.println("Testando limite exato de potência:");
        carroTesteLimite.alterarPotencia(200);
        carroTesteLimite.validarPotencia(200); // Exatamente no limite
    }
}