import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tablica = {3, 7, 8, 2, 54,23,65,87,2,8,2,7,9};

        System.out.println("Przed posortowaniem  " + Arrays.toString(tablica));

        sortownieBabelkowe(tablica);

        System.out.println("Tablica posortowana " + Arrays.toString(tablica));
    }

    static void sortownieBabelkowe(int[] tablica) {

        for (int i = 0; i < tablica.length; i++) {

            for (int j = i + 1; j < tablica.length; j++) {

                int liczbaA = tablica[i];
                int liczbaB = tablica[j];

                if (liczbaA > liczbaB) {
                    tablica[i] = liczbaB;
                    tablica[j] = liczbaA;
                }
            }
        }
    }
}