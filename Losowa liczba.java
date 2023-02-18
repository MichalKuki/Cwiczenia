import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wylosuje randomową liczbe do 100");
        Random random = new Random();
        int wynik = random.nextInt(100);
        sleep(1000);
        System.out.println(wynik);
    }
    }
