import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        boolean found = false;
        for (int a = 1; a < n; a++) {
            for (int b = a; b < n; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c * c == a * a + b * b && c <= n) {
                    System.out.println(a + " " + b + " " + c);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No Pythagorean triplets found.");
        }
        
        
    }
    
}
