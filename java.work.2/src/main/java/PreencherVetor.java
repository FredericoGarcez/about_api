import java.util.InputMismatchException;
import java.util.Scanner;

public class PreencherVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int indice = 0;

        try{
            System.out.println("Digite os valores para preencher o vetor (digite 0 para parar):");
            int valor;
            do{
                valor =  scanner.nextInt();
                vetor[indice] = valor;
                indice++;
            }while(valor != 0);   //caso fosse pra parar no decimo, seria: while(valor!=0 && indice<10)

            System.out.println("Valores no vetor:");
            for(int i = 0; i < indice; i++){
                System.out.println(vetor[i] + " ");
            }
        }catch (InputMismatchException e){
            System.out.println("Erro: Valor informado não é numérico.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Voce digitou mais de 10 valores");
        }finally {
            scanner.close();
        }

    }
}
