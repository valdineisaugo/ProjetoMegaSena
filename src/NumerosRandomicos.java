import java.util.Random;

public class NumerosRandomicos {
    public static void main(String[] args) {
        Random sorteio = new Random();
        System.out.println(sorteio.nextInt(60));
    }
}
