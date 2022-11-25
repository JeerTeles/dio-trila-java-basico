package Operadores;
public class OperadoresTernario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;
        String resultado ="";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        String situacao2 = a==b ? "Verdadeiro" : "Falso";
        System.out.println(situacao2);

        // Podemos tbm usar com intieros 
        int numero = a==b ? 1 :0;
        System.out.println(numero);


    }
}
