import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int a = scanner.nextInt();

        if (a >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
        System.out.println("Jestes niepełnoletni");


      }
    }
}
