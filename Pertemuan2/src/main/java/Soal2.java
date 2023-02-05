/*             DESKRIPSI            */
/* Nama		   : Septyana Agustina  */
/* NIM		   : 221524060          */
/* Kelas	   : D4-1B              */

import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        String[] input = new String[3], angka = new String[3];

        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            input[i] = keyboard.nextLine();
            angka[i] = input[i].split(" ")[1];
            input[i] = input[i].split(" ")[0];
        }
        keyboard.close();

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.print(input[i]);
            for (int j = 0; j < (15 - input[i].length()); j++) {
                System.out.print(" ");
            }
            if (angka[i].length() < 3) {
                for (int k = 0; k < (3 - angka[i].length()); k++) {
                    System.out.print("0");
                }
                System.out.println(angka[i]);
            } else {
                System.out.println(angka[i]);
            }
        }
        System.out.println("================================");
    }
}
