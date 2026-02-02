package Study;

import java.util.Random;

public class B24_random {
    static void main() {
        Random rd = new Random();
        int songuyen = rd.nextInt(0, 100);
        System.out.println(songuyen);
        double x = rd.nextDouble( 0, 100);
        String lamtron = String.format("%.2f", x);
        System.out.println(lamtron);

    }
}