import java.util.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class FindArrayWithSumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            int P = sc.nextInt(); // Change P to the desired product value
            int targetSum = 41;
            List<Integer> array = findArrayWithSumAndProduct(P, targetSum);

            if (array == null) {
                System.out.println("-1");
            } else {
                for (int num : array) {
                    System.out.print(num + " ");
                }
            }
        }
    }

    public static List<Integer> findArrayWithSumAndProduct(int P, int targetSum) {
        List<Integer> array = new ArrayList<>();

        while (targetSum > 0) {
            boolean found = false;
            int candidate = 1;
            while (true) {
                int newProduct = P / candidate;
                int newSum = targetSum - candidate;

                array.add(candidate);
                targetSum = newSum;
                found = true;
                break;
            }

        }

        return array;
    }
}





