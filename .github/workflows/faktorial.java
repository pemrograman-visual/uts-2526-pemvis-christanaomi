//12S25041-Christa Naomi Silalahi
//12S25007-Tongam prozona Manurung
import java.util.*;
import java.lang.Math;

public class faktorial {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan, faktorial, i;

        System.out.println("masukkan bilangan");
        bilangan = Integer.parseInt(input.nextLine());
        faktorial = 1;
        i = 1;
        while (i <= bilangan) {
            faktorial = faktorial * i;
            i = i + 1;
        }
        System.out.println("hasil faktorial =" + faktorial);
    }
}
