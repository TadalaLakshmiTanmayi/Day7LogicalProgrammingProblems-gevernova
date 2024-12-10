//program 1
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int numberOfTerms = sc.nextInt();
        System.out.println("Fibonacci Series up to " + numberOfTerms + " terms:");
        generateFibonacci(numberOfTerms);
        sc.close();
    }
    public static void generateFibonacci(int numberOfTerms) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print(firstTerm + " " + secondTerm + " ");
        for (int i = 2; i < numberOfTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}