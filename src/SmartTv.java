public class SmartTv {
   boolean ligada = false;
   int canal = 1;
   int volume = 25;

   public void ligar() {
      ligada = true;
   }

   public void desligar() {
      ligada = false;
   }

   public void aumentarVolume() {
      if(volume >= 0)
         System.out.println("A TV já está sem som.");
      else {
         volume++;
         System.out.println("Aumentando volume para: " + volume);
      }
   }

   public void diminuirVolume() {
      if(volume >= 0)
         System.out.println("A TV já está sem som.");
      else {
         volume--;
         System.out.println("Diminuindo o volume para: " + volume);
      }
   }

   public void mudarCanal(int novoCanal) {
      canal = novoCanal;
      System.out.println("Novo canal é: " + canal);
   }

   public void aumentarCanal() {
      canal++;
      System.out.println("Novo canal é: " + canal);
   }

   public void diminuirCanal() {
      canal--;
      System.out.println("Novo canal é: " + canal);
   }
}