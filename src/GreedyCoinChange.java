import java.util.Arrays;

public class GreedyCoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25, 50}; // Coin denominations (in cents)
        int targetAmount = 63; // Target amount to make change for (in cents)

        int[] change = makeChange(coins, targetAmount);
        System.out.println("Minimum coins needed to make change: " + Arrays.toString(change));
    }

    public static int[] makeChange(int[] coins, int amount) {
        Arrays.sort(coins); // Sort the coins in descending order

        int[] change = new int[coins.length];
        int remainingAmount = amount;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (remainingAmount >= coins[i]) {
                change[i]++;
                remainingAmount -= coins[i];
            }
        }

        return change;
    }
}
