import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String a = scanner.nextLine();
        int b = a.length();

        int kk = 0;
        int k = (b - 1);
        for (int i = 0; i < b; i++) {

            if (a.charAt(i) != a.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }
        if(kk == 1)
            System.out.println("Wyraz nie jest palindormem");
        else {
            System.out.println("Jest Palindromem");
    }



    }
}