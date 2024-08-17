

import java.util.Scanner;

public class problem2 {
    public static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
           if(i%2!=0){
               
                sum=sum+i;
           }
        }
        return sum;
    }
    public static void main(String[] args){
            /* Write a function to print the sum of all odd numbers from 1 to n. */
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter The Value of N : ");
            int n = obj.nextInt();
            int sum =sum(n);
            System.out.println("sum : "+sum);

    }
}
