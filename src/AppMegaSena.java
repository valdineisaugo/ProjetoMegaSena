import java.util.Random;
import java.util.Scanner;

public class AppMegaSena {
    public static void main(String[] args) {
        //Conjunto aposta - Array (vetor)
        int[] aposta = new int[6];
        //Conjunto resultado - Array (vetor)
        int[] resultado = new int[6];
        //Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);
        //Parte 01 - Entrada de dados (aposta)
        //2 - 5 - 55 - 43 - 23 - 9 (valores)
        //0 - 1 - 2  - 3  - 4  - 5 (índice)
        for(int i = 0; i <= 5; i++){
            //Este for precisa fazer validação da aposta (números não repetidos entre 1 e 60)
            System.out.println("Digite um número para sua aposta:");
            aposta[i] = teclado.nextInt();
        }
        System.out.println("Sua aposta é esta: ");
        for(int i = 0; i <= 5; i++){
            System.out.println(aposta[i]);
        }
        //Parte 02 - Geração do sorteio (Random)
        Random sorteio = new Random();
        int valor = sorteio.nextInt(60);
    }
}
