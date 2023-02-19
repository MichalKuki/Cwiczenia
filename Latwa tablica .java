import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wyswietla tablice ");
        double sumTab = 0;
        int[] tablicaliczb = {1, 4, 6, 8, 20, 40, 53, 78};
        for (int i = 0; i <tablicaliczb.length; i++) {
            System.out.println(tablicaliczb[i]);
            sumTab = sumTab + tablicaliczb[i];
        }
        System.out.println("Suma wynosi " + sumTab);
    }

}