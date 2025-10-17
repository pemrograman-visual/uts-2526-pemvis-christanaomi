//12S25041-Christa Naomi Silalahi
//12S25007-Tongam prozona Manurung
import java.util.*;
import java.lang.Math;

public class nilai_analisis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, mahasiswa;
        double nr, total, maks, min;
        int[] ns = new int[4];

        total = 0;
        mahasiswa = Integer.parseInt(input.nextLine());
        for (i = 0; i <= 3; i++) {
            System.out.println("masukkan nilai ke-" + i + 1 + ":");
            ns[i] = Integer.parseInt(input.nextLine());
            total = total + ns[i];
        }
        nr = total / 4;
        maks = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] > maks) {
                maks = ns[i];
            }
        }
        min = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] < min) {
                min = ns[i];
            }
        }
        System.out.println("ratarata:" + nr);
        System.out.println("nilai maksimum:" + maks);
        System.out.println("nilai minimum:" + min);
    }
}
