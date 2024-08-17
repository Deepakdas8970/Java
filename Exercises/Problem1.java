
import java.util.Scanner;

public class Problem1{
    public static void average(int a, int b, int c){
        int avg=(a+b+c)/3;
        System.out.print("Average is : "+avg);
    }
    public static void main(String[] args){
        /* Enter 3 numbers from the user & make a function to print their average. */
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter the first value : ");
            int a=obj.nextInt();
            System.out.print("Enter the second value : ");
            int b=obj.nextInt();
            System.out.print("Enter the third value : ");
            int c =obj.nextInt();
            average(a, b, c);
    }
}
