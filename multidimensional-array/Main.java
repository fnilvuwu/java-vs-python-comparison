
/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        int[][] matrix = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        // i = 0
        for (int i = 0; i < matrix.length; i++) {
            // matrix[0]
            // {1,0,0}
            // matrix[1]
            // {0,1,0}
            // 

            // j < 3
            // j = 0
            for (int j = 0; j < matrix[i].length; j++) {
                // matrix[0][0]
                // matrix[0][1]
                // matrix[0][2]

                // matrix[1][0]
                // matrix[1][1]
                // matrix[1][2]
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}