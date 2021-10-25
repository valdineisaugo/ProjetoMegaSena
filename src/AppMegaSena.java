import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppMegaSena {
    public static void main(String[] args) {
        //Conjunto aposta - Array (vetor)
        int[] aposta = new int[6];
        //Conjunto sorteio - Array (vetor)
        int[] sorteio = new int[6];
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
        JOptionPane.showMessageDialog(null, "Sua aposta foi esta:\n" + Arrays.toString(aposta));
        System.out.println("Sua aposta é esta: ");
        for(int i = 0; i <= 5; i++){
            System.out.println(aposta[i]);
        }
        //Parte 02 - Geração do sorteio (Random)
        Random random = new Random();
        for(int i = 0; i<=5; i++){
            sorteio[i] = random.nextInt(60);
        }
        JOptionPane.showMessageDialog(null, "Os números sorteados são estes\n" + Arrays.toString(sorteio));

        //Depois de ler a aposta e realizar sorteio, você deve comparar se os arrays são iguais.

    }
}
