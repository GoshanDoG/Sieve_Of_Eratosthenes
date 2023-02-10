import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void countEratosthenes() {

        System.out.println("Введите число 'n' (то до которого надо просчитать) :");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean b = true;
        for (int P = 2; P <= number; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b = true;

        }

    }
}
