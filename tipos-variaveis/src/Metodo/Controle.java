package Metodo;

public class Controle {
    public static void main(String[] args) {
        SmartTv smartTV = new SmartTv();

        System.out.println("Tv ligada ? "+smartTV.ligada);
        System.out.println("Canal: "+smartTV.canal);
        System.out.println("Volume: "+smartTV.volume);

        smartTV.ligar();
        System.out.println("Tv ligada ? "+smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        smartTV.diminuirCanal();
        smartTV.aumentarCanal();
        smartTV.mudarDeCanal(25);
    }
        
}
