import java.util.Locale;
import java.util.Scanner;

import javax.security.auth.callback.TextOutputCallback; 
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gleyson Sampaio
* @version 1.0
* @since   01/01/2022
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */

   public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite um valor");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite um valor");
        int numeroDois = scanner.nextInt();

        int total = numeroUm + numeroDois;

        //imprimindo os dados obtidos pelo usuario
        System.out.println("O valor da  soma é : "+total);
        
   } 
        /*
        * Este método foi elaborado as pressas
        * por isso eu abrevei o nome das variáveis
        * mas olha, ele tem a finalidade de somar ou  multiplicar
        * dois números
        */
        public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                r= n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
        }
   
}
