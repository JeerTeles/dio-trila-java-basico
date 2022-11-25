package Operadores;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nome1 = "Gleyson";
        String nome2 = "Jeer";

        System.out.println("Nome um é igual a nome dois ? " +(nome1 == nome2));
        
        //Agora com uma variavel e um novo objeto usamos equals
        String nome3 = "Bido";
        String nome4 = new String("Bido");
        System.out.println("Nome três é igual a nome quatro ? "+(nome3.equals(nome4)));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira ");
        }else{
            System.out.println("A nossa condição é falsa");
        }

        System.out.println("Número um é igual número dois ? "+simNao);

        simNao = numero1 != numero2;

        System.out.println("Número um é diferente a número dois ? "+simNao);

        simNao = numero1 > numero2;

        System.out.println("Número um é maior que número dois ? "+simNao);

        simNao = numero1 < numero2;

        System.out.println("Número um é menor que  número dois ? "+simNao);
    }
}
