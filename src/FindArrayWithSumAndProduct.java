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
        int remainingProduct = P;

        while (targetSum > 0) {
            boolean found = false;
            for (int candidate = 1; candidate <= 100; candidate++) {
                int newProduct = remainingProduct / candidate;
                int newSum = targetSum - candidate;

                if (newProduct * candidate == remainingProduct && newSum >= 0) {
                    array.add(candidate);
                    remainingProduct = newProduct;
                    targetSum = newSum;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return null; // No such array exists
            }
        }

        return array;
    }
}





