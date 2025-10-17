//12S25041-Christa Naomi Silalahi
//12S25007-Tongam prozona Manurung
import java.util.*;
import java.lang.Math;

public class kalkulator {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tambah, kurang, kali, bagi;
        String pilihan;
        int angka1, angka2;

        pilihan = input.nextLine();
        if (pilihan.equals("1")) {
            angka1 = Integer.parseInt(input.nextLine());
            angka2 = Integer.parseInt(input.nextLine());
            tambah = angka1 + angka2;
            System.out.println(tambah);
        } else {
            if (pilihan.equals("2")) {
                angka1 = Integer.parseInt(input.nextLine());
                angka2 = Integer.parseInt(input.nextLine());
                kurang = angka1 - angka2;
                System.out.println(kurang);
            } else {
                if (pilihan.equals("3")) {
                    angka1 = Integer.parseInt(input.nextLine());
                    angka2 = Integer.parseInt(input.nextLine());
                    kali = angka1 * angka2;
                    System.out.println(kali);
                } else {
                    if (pilihan.equals("4")) {
                        angka1 = Integer.parseInt(input.nextLine());
                        angka2 = Integer.parseInt(input.nextLine());
                        bagi = (double) angka1 / angka2;
                        System.out.println(bagi);
                    }
                }
            }
        }
    }
}
