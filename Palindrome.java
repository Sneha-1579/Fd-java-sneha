import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int reversedNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while (num != 0) {
            
            int digit = num % 10; 
            reversedNum = reversedNum * 10 + digit; 
            num = num / 10;
        }
        if(reversedNum == originalNum) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }


    }
    
}
