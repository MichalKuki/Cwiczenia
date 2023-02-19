import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugi bok ");
        int b = scanner.nextInt();
        int pole = b * a;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sleep(1000);
        System.out.println("Pole wynosi " + pole);
    }
}
