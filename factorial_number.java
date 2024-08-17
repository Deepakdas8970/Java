import java.util.Scanner;

public class factorial_number {

    public static void factorialNumber(int n){
        int l =1;
        for(int i=n;i>=1;i--){
          l = l*i;
        }
        System.out.println("factorial is : "+l);
    }
    public static void main (String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =obj.nextInt();
        factorialNumber(n);
        
    }
    
}
