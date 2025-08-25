import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
       int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        for(int i = 0; i< n/2; i++){
            System.out.print("*");
            for(int j=0; j<n+2; ++j){
                System.out.print(" ");
                
            }
            for(int k =0; k<i+1; ++k){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=0; l<n+3; ++l){
            System.out.print("*");
            

            }
            for(int m=0; m<n/2+1; ++m){
                System.out.print("*");

        }
        System.out.println();
        for(int i=n/2; i>0; i--){
            System.out.print("*");
            for(int j=n+2; j>0; --j){
                System.out.print(" ");
                
            }
            for(int k =i; k>0; --k){
                System.out.print("*");
            }
            System.out.println();
                
         
    }
    
    
}
}
