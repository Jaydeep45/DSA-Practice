package matrix;

import java.util.ArrayList;
import java.util.List;

public class TopLeftSubmatrices {
    public static List<int[][]> generateTopLeftSubmatrices(int[][] matrix) {
        List<int[][]> submatrices = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int[][] submatrix = new int[i + 1][j + 1];
                for (int r = 0; r <= i; r++) {
                    System.arraycopy(matrix[r], 0, submatrix[r], 0, j + 1);
                }
                submatrices.add(submatrix);
            }
        }
        return submatrices;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<int[][]> submatrices = generateTopLeftSubmatrices(matrix);

        for (int[][] submatrix : submatrices) {
            for (int[] row : submatrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
