# Classe Carro

A classe `Carro` representa um veículo do mundo real no sistema, contendo os seguintes atributos:

* **cor**: representa a cor do carro (ex: "Azul", "Vermelho", "Preto").
* **peso**: representado por um número decimal (`double`) em quilos (kg).
* **potencia**: representada por um número inteiro (`int`) em cavalos de potência (cv).

<img width="825" height="585" alt="image" src="https://github.com/user-attachments/assets/1fe40247-b666-48fd-8d7a-826e7774c815" />


---

## Métodos

**mudarPeso**

Altera o peso do veículo recebendo um valor `double` como parâmetro e retornando um `boolean` (`true` para alteração bem-sucedida e `false` para valor inválido).

**alterarPotencia**

Altera a potência do veículo recebendo um número inteiro (`int`) como parâmetro e retornando um `boolean` para indicar se a alteração foi efetuada.

**carroSeguro**

Valida se o peso atual do veículo é seguro comparado ao limite informado por parâmetro (`double`). Retorna um `boolean`.

**validarPotencia**

Verifica se a potência do veículo está dentro da potência máxima informada por parâmetro (`int`). Retorna um `boolean`.
