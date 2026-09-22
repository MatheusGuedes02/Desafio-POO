package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
import br.com.fiapride.model.ExibirMotor;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Carro carroUrbano = new Carro("Preto", 800, 200, "Supra");
        
        System.out.println("\n---------//----------TESTE 1 (Criacao carro supra)----------------//----------");
        System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia());

        System.out.println("\n\n-------------------TESTE 2 (Mudar peso.)------------------------");
        carroUrbano.mudarPeso(1100.0);
        System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia());
         
        System.out.println("\n\n-------------------TESTE 3 (Alterar potencia.)-----------");
        carroUrbano.alterarPotencia(120);
        System.out.println("Cor: " + carroUrbano.getCor() + " - Peso: " + carroUrbano.getPeso() + " - Potencia: " + carroUrbano.getPotencia() + " - Modelo: " + carroUrbano.getModelo());
         
        System.out.println("\n\n-------------------TESTE 4 (Validacoes do Supra)-----------");
        carroUrbano.carroSeguro(1500.0);  // Seguro
        carroUrbano.validarPotencia(150); // Dentro do limite

        System.out.println("\n\n---------//----------TESTE 5 (Criacao Ferrari F40)----------------//----------");
        Carro ferrari = new Carro("Vermelha", 1100.0, 478, "Ferrari F40");
        System.out.println("Modelo: " + ferrari.getModelo() + " - Cor: " + ferrari.getCor() + " - Peso: " + ferrari.getPeso() + " - Potencia: " + ferrari.getPotencia());
        // Testando validação de potência na Ferrari (deve ultrapassar o limite de 150)
        ferrari.validarPotencia(150);

        System.out.println("\n\n---------//----------TESTE 6 (Criacao Hilux)----------------//----------");
        Carro hilux = new Carro("Prata", 2100.0, 204, "Hilux");
        System.out.println("Modelo: " + hilux.getModelo() + " - Cor: " + hilux.getCor() + " - Peso: " + hilux.getPeso() + " - Potencia: " + hilux.getPotencia());
        // Testando validação de peso na Hilux (peso limite de 1500, deve ser classificada como perigosa/excesso de peso)
        hilux.carroSeguro(1500.0);

        System.out.println("\n\n---------//----------TESTE 7 (Criacao Fusca)----------------//----------");
        Carro fusca = new Carro("Azul", 840.0, 65, "Fusca");
        System.out.println("Modelo: " + fusca.getModelo() + " - Cor: " + fusca.getCor() + " - Peso: " + fusca.getPeso() + " - Potencia: " + fusca.getPotencia());
        // Testando se o Fusca é seguro e está dentro da potência
        fusca.carroSeguro(1500.0); 
        fusca.validarPotencia(150);
        
        System.out.println("\n\n---------//----------TESTE 8 (Testando a ExibirMotor)----------------//----------");
        // Criando um motor e vinculando ao objeto do Fusca
        ExibirMotor motorFusca = new ExibirMotor(65, "Volkswagen", "Boxer", fusca);
        motorFusca.resumoMotor();
    }
}