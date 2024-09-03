# Desafios Java

Este repositório contém soluções para cinco desafios de programação, cada um em um projeto Java separado. Os desafios abordam diferentes conceitos de lógica e programação. Abaixo estão as descrições dos desafios.

## Desafios

### Desafio 1: Sequência de Fibonacci

**Descrição:**

Escreva um programa que calcule a sequência de Fibonacci, dada uma entrada numérica, e informe se o número informado pertence à sequência.

**Entrada:**
- Número para verificar na sequência de Fibonacci.

**Saída:**
- Mensagem informando se o número pertence ou não à sequência.

---

### Desafio 2: Contagem de Letras 'a'

**Descrição:**

Escreva um programa que verifique a existência da letra ‘a’ (maiúscula ou minúscula) em uma string e informe a quantidade de vezes que ela ocorre.

**Entrada:**
- String para ser verificada.

**Saída:**
- Contagem de ocorrências da letra ‘a’.

---

### Desafio 3: Soma de Números

**Descrição:**

Determine o valor final da variável `SOMA` após a execução do trecho de código fornecido.

**Código:**
```java
int INDICE = 12, SOMA = 0, K = 1;
while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}
System.out.println(SOMA);
```
Saída Esperada:

Valor final de SOMA.

---

### Desafio 4: Completar a Sequência
**Descrição:**

Descubra a lógica das seguintes sequências e complete o próximo elemento:

a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2, 10, 12, 16, 17, 18, 19, ____

Saída Esperada:

Próximo elemento para cada sequência.

---

### Desafio 5: Identificação de Interruptores
**Descrição:**

Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Descubra qual interruptor controla cada lâmpada, usando apenas duas idas às salas das lâmpadas.

Solução:

Ligue o primeiro interruptor e espere alguns minutos.
Desligue o primeiro interruptor e ligue o segundo interruptor.
Vá até as salas das lâmpadas:
A lâmpada quente é controlada pelo primeiro interruptor.
A lâmpada acesa é controlada pelo segundo interruptor.
A lâmpada apagada e fria é controlada pelo terceiro interruptor.
