import java.util.Scanner;

public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String input;
        String stop = " !,?.'_@";
        int jumlahhuruf, jumlahkata=0, counter=0;
        int[] flag = new int[400000];
        
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        keyboard.close();
        
        jumlahhuruf = input.length();
        for(int i = 0; i < jumlahhuruf; i++){
            for(int j = 0; j < 8; j++){
                if(input.charAt(i) == stop.charAt(j)){
                    flag[jumlahkata] = i;
                    jumlahkata++; 
                }
            }
        }

        System.out.println(jumlahkata+1);
        for(int i = 0; i < jumlahhuruf; i++){
            if(i == flag[counter]){
                System.out.println();
                counter++;
            } else{
                System.out.print(input.charAt(i));
            }
        }
    }
}
