import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int originalN = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        if (sum == originalN) {
            System.out.println(originalN + " is an Armstrong number.");
        } else {
            System.out.println(originalN + " is not an Armstrong number.");
        }
        sc.close();
        
    }
    
}
