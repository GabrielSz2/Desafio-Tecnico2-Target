package app;

public class Program {
	public static void main(String[] args) {
		
		 // Inicialização das lâmpadas: false = apagada, true = acesa
        boolean[] lampadas = new boolean[3];
        boolean[] quentes = new boolean[3];
        
        // 1. Ligue o primeiro interruptor por 5 minutos
        ligarLampada(0, lampadas);
        esperar(5);
        desligarLampada(0, lampadas);
        quentes[0] = true; 

        // 2. Ligue o segundo interruptor
        ligarLampada(1, lampadas);
        
        // 3. Verifique as lâmpadas
        verificarLampadas(lampadas, quentes);
    }

   
    public static void ligarLampada(int indice, boolean[] lampadas) {
        lampadas[indice] = true;
    }

  
    public static void desligarLampada(int indice, boolean[] lampadas) {
        lampadas[indice] = false;
    }

  
    public static void esperar(int minutos) {
        System.out.println("Esperando por " + minutos + " minutos...");
    }

   
    public static void verificarLampadas(boolean[] lampadas, boolean[] quentes) {
        for (int i = 0; i < lampadas.length; i++) {
            if (lampadas[i]) {
                System.out.println("A lâmpada " + (i + 1) + " está acesa. Ela é controlada pelo segundo interruptor.");
            } else if (quentes[i]) {
                System.out.println("A lâmpada " + (i + 1) + " está apagada, mas quente. Ela é controlada pelo primeiro interruptor.");
            } else {
                System.out.println("A lâmpada " + (i + 1) + " está apagada e fria. Ela é controlada pelo terceiro interruptor.");
            }
        }	
	}
}
