package Operadores;
public class OperadoresUnittarios {
    public static void main(String[] args) {
        int numero = 5;
        boolean variavel = true;
       
        numero = numero;
        // a varielvel não esta sendo negativada 
        System.out.println(- numero);
        System.out.println(numero);

        // Nesse caso sim, a variavel esta sendo negativada 
        numero = - numero;
        System.out.println(numero);

        //retormando a variavel para positiva 
        numero = numero * -1;
        System.out.println(numero);

        //Incrementando e  decrementando 
        System.out.println(++ numero);
        System.out.println(--numero);

        System.out.println(!variavel);
        System.out.println(variavel);
    }
}
