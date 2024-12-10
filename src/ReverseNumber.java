//Program 4
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversedNum = reverseNumber(num);

        System.out.println("Reversed Number: " + reversedNum);

        sc.close();
    }
    public static int reverseNumber(int num) {
        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        return reverse;
    }
}

