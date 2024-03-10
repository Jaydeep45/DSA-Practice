package matrix;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    static void setZeroes(int[][] matrix) {
        List<Integer> column = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int r: row) {
            for(int i = 0; i < matrix.length; i++)
                matrix[i][r] = 0;
        }
        for(int c: column) {
            for(int i = 0; i < matrix[0].length; i++)
                matrix[c][i] = 0;
        }
    }
}
