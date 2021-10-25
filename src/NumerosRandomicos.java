import javax.swing.*;
import java.util.Random;

public class NumerosRandomicos {
    public static void main(String[] args) {
        Random sorteio = new Random();
        JOptionPane.showMessageDialog(null, "Os números sorteados são:");
        for(int i = 0; i <= 5; i++) {
            int num = sorteio.nextInt(60);
            System.out.println(num);
            JOptionPane.showMessageDialog(null, num);
        }
    }
}
