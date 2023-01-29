/*             DESKRIPSI            */
/* Nama		   : Septyana Agustina  */
/* NIM		   : 221524060          */
/* Kelas	   : D4-1B              */

import java.util.Scanner;
public class Soal1 {
    public static void main(String args[]) {
        
        String kata;
        int jumlahkata;
        
        Scanner sc = new Scanner(System.in);
        kata = sc.nextLine();
        sc.close();
        
        String[] kataArray = kata.split("[ !,?._'@]+");
        jumlahkata = kataArray.length;
        
        System.out.println(jumlahkata);
        for(int i = 0; i < jumlahkata; i++){
            System.out.println(kataArray[i]);
        }
    }
}
