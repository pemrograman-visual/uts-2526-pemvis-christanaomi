//12S25041-Christa Naomi Silalahi
//12S25007-Tongam prozona Manurung
import java.util.*;
import java.lang.Math;

public class bilangan_prima{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, i, faktor;

        x = Integer.parseInt(input.nextLine());
        i = 1;
        faktor = 0;
        while (i <= x) {
            if (x % i == 0) {
                faktor = faktor + 1;
            }
            i = i + 1;
        }
        if (faktor == 2) {
            System.out.println("prima");
        } else {
            System.out.println("bukan prima");
        }
    }
}
