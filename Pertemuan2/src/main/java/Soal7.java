/*             DESKRIPSI            */
/* Nama		   : Septyana Agustina  */
/* NIM		   : 221524060          */
/* Kelas	   : D4-1B              */

public class Soal7 {
    public static void main(String[] args) {
        // One Dimensional Arrays
        int[] fisrtArray = { 2, 5, 3 };
        int[] secondArray = { 9, 5, 3 };
        int[] thirdArray = { 2, 4, 9 };
        int[] fourthArray = { 10, 11, 12 };
        int[] fifthArray = { 13, 14, 15 };
        int[] sixthArray = { 16, 17, 18 };
        int[] seventhArray = { 19, 20, 21 };
        int[] eighthArray = { 22, 23, 24 };
        int[] ninthArray = { 25, 26, 27 };
        // Two Dimensional Arrays
        int[][] twoDimensionalArray1 = { fisrtArray, secondArray, thirdArray };
        int[][] twoDimensionalArray2 = { fourthArray, fifthArray, sixthArray };
        int[][] twoDimensionalArray3 = { seventhArray, eighthArray, ninthArray };
        // Three Dimensional Array
        int[][][] threeDimensionalArray = { twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3 };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == 0 && j == 0 && k == 0 || i == 1 && j == 0 && k == 0 || i == 2 && j == 0 && k == 0) {
                        System.out.print("{ { " + threeDimensionalArray[i][j][k]);
                    } else if (i == 0 && j == 2 && k == 2 || i == 1 && j == 2 && k == 2 || i == 2 && j == 2 && k == 2) {
                        System.out.print(" " + threeDimensionalArray[i][j][k]);
                        System.out.println(" } }");
                    } else if (k == 0) {
                        System.out.print("{");
                        System.out.print(" " + threeDimensionalArray[i][j][k]);
                    } else if (k == 2) {
                        System.out.print(" " + threeDimensionalArray[i][j][k]);
                        System.out.print(" }");
                    } else {
                        System.out.print(" " + threeDimensionalArray[i][j][k]);
                    }
                }
            }
        }
    }
}