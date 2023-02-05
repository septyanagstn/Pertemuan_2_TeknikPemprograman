/*             DESKRIPSI            */
/* Nama		   : Septyana Agustina  */
/* NIM		   : 221524060          */
/* Kelas	   : D4-1B              */

import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        int gaji = 500000;
        int hargaitem = 50000;
        int item, hasil = 0;

        Scanner sc = new Scanner(System.in);
        item = sc.nextInt();
        sc.close();

        hasil = (item < 15) ? gaji - ((((15 - item) * hargaitem) * 15) / 100)
                : (item >= 40) ? gaji + (((hargaitem * 25) / 100) * item)
                        : (item > 80) ? gaji + (((hargaitem * 35) / 100) * item)
                                : gaji + (((hargaitem * 10) / 100) * item);
        System.out.println(hasil);
    }
}