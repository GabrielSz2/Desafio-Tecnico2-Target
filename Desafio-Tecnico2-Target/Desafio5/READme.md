# Desafio 5
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? 

Logica implementada:  
1. **Primeira ida:**
   - Ligue o **primeiro interruptor** e deixe-o ligado por um tempo (por exemplo, 5 minutos).
   - Após os 5 minutos, desligue o **primeiro interruptor**.
   - Ligue o **segundo interruptor** e deixe-o ligado.

2. **Segunda ida:**
   - Vá até a sala das lâmpadas.

   **Observações:**
   - A lâmpada que estiver **acesa** é controlada pelo **segundo interruptor** (o que está ligado).
   - Toque nas outras duas lâmpadas:
     - A lâmpada que estiver **quente** é controlada pelo **primeiro interruptor** (o que estava ligado por 5 minutos e depois foi desligado).
     - A lâmpada que estiver **fria** é controlada pelo **terceiro interruptor** (o que nunca foi ligado).
