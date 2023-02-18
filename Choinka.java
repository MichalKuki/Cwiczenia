import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki z gwiazdek");
        int wysokosc = scanner.nextInt();


        for (int i = 1; i <= wysokosc; i++)
        {
            for (int j=0; j<wysokosc-i; j++) System.out.print(" ");
            for (int j=0; j<(i*2)-1; j++) System.out.print("*");
            System.out.println(" ");
        }
    }

}
