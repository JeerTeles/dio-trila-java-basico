import javax.sound.sampled.SourceDataLine;

public class Condicionais {
    public static void main(String[] args) {
        boolean condicao1  = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas expressões são verdadeiras"); 
        }else{
            System.out.println("Somente uma expresão é verdadeira");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das duas expressões é verdadeira"); 
        }

        if(condicao1 && (7 > 4)){
            System.out.println("Uma das duas expressões é verdadeira"); 
        }
        System.out.println("Fim");
    }      
}
