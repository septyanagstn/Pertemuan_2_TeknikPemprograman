/*             DESKRIPSI            */
/* Nama		   : Septyana Agustina  */
/* NIM		   : 221524060          */
/* Kelas	   : D4-1B              */

import java.math.BigInteger;
import java.util.Scanner;
public class Soal6 {
    public static void main(String[] args) {
        BigInteger angka1;
        BigInteger angka2;

        Scanner sc = new Scanner(System.in);
        angka1 = sc.nextBigInteger();
        angka2 = sc.nextBigInteger();
        sc.close();

        System.out.println(angka1.add(angka2));
        System.out.println(angka1.multiply(angka2));
    }
}