package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = sc.nextInt();
        }
        int[] res = spiralMatrix(matrix);
        System.out.println(Arrays.toString(res));
    }
    public static int[] spiralMatrix(int [][]matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[] res = new int[n * m];
        int ind = 0, top = 0, left = 0, right = m - 1, bottom = n - 1;
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                res[ind++] = matrix[top][i];
            }
            top++;
            for(int i = top; i <= bottom; i++) {
                res[ind++] = matrix[i][right];
            }
            right--;
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    res[ind++] = matrix[bottom][i];
                }
                bottom--;
            }
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    res[ind++] = matrix[i][left];
                }
                left++;
            }
        }
        return res;
    }
}
