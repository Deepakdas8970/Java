import java.util.Scanner;

public class functions {
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main (String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value of a : ");
        int a=obj.nextInt();
        System.out.println("enter the value of b : ");
        int b=obj.nextInt();
       int sum= calculateSum(a, b);
       System.out.print("sum : "+ sum);
    }
    
}
