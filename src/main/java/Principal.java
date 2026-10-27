
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //variaveis 
        int qtde = 5;
        int vetor[] = new int[qtde];
        Scanner leitor = new Scanner(System.in);

        //Entrada 
        for (int i = 0; i < qtde; i++) {
            System.out.println("Digite o valor (" + i + "):");
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }

        //Processamento 
        for (int i = 0; i < qtde - 1; i++) {
            for (int j = i + 1; j < qtde; j++) {
                //System.out.println("i:" + i + " j:" + j); 

                if (vetor[i] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }
}
