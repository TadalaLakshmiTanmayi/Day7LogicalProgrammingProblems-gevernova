//Program 5
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    public static int generateRandomNumber(int N) {
        Random random = new Random();
        return random.nextInt(N) + 1;  // Generate a random number between 1 and N
    }

    public static int getTotalRandomNumbers(int N) {
        HashSet<Integer> distinctCoupons = new HashSet<>();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < N) {
            int coupon = generateRandomNumber(N);
            distinctCoupons.add(coupon);
            totalRandomNumbers++;
        }

        return totalRandomNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of distinct coupon numbers (N): ");
        int N = sc.nextInt();

        int totalRandomNumbers = getTotalRandomNumbers(N);

        System.out.println("Total random numbers needed to get all distinct coupons: " + totalRandomNumbers);

        sc.close();
    }
}
