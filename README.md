# Projeto Desafio-Poo

Este é um programa que faz validações de atributos do carro e faz a exibição dos motores dos respectivos carros.

## Diagrama UML de Classes

<img width="1133" height="654" alt="Astah" src="https://github.com/user-attachments/assets/e7435b2f-1362-4914-a906-8c9576fb937a" />

---

### Classe Carro
A classe Carro representa um veículo do mundo real no sistema, contendo os seguintes atributos privados:
*   **cor** : representa a cor do carro (ex: "Azul", "Vermelho", "Preto").
*   **peso** : representado por um número decimal (double) em quilos (kg).
*   **potencia** : representada por um número inteiro (int) em cavalos de potência (cv).
*   **modelo** : representa o nome/modelo do veículo em formato de texto (String).

--------------------------------------------------------------------------------

#### Métodos
**mudarPeso**
Altera o peso do veículo recebendo um valor double como parâmetro e retornando um boolean (true para alteração bem-sucedida e false para valor inválido).

**alterarPotencia**
Altera a potência do veículo recebendo um número inteiro (int) como parâmetro e retornando um boolean para indicar se a alteração foi efetuada.

**carroSeguro**
Valida se o peso atual do veículo é seguro comparado ao limite informado por parâmetro (double). Retorna um boolean.

**validarPotencia**
Verifica se a potência do veículo está dentro da potência máxima informada por parâmetro (int). Retorna um boolean.

---

### Classe ExibirMotor
Representa o motor associado a um carro, demonstrando uma relação de associação com o veículo. Contém os seguintes atributos privados:
*   **cavalos** : número inteiro (int) indicando a potência do motor.
*   **fabricante** : texto (String) indicando a fabricante do motor.
*   **forma** : texto (String) indicando a forma do motor (ex: Boxer, Em linha).
*   **veiculo** : armazena a referência de um objeto do tipo `Carro`, conectando o motor ao seu veículo correspondente.

--------------------------------------------------------------------------------

#### Métodos
**resumoMotor**
Responsável por exibir no console todos os dados do motor (cavalos, fabricante e forma), juntamente com o modelo do `Carro` vinculado a ele.

---

### Classe SistemaPrincipal
Classe executável que representa a dependência do sistema com as demais classes. 
*   **main(args: String[])** : Método principal que instancia os objetos e testa as regras de negócio.
*   Realiza baterias de testes com diferentes configurações de carros (Supra, Ferrari F40, Hilux e Fusca) para forçar os limites das regras de validação, comprovando o funcionamento das travas de limite de potência e excesso de peso.
