import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args ){

        //switch 
        Scanner obj=new Scanner(System.in);
        System.out.println("wnter the value of a : ");
        int a=obj.nextInt();

        System.out.println("wnter the value of b  : ");
        int b=obj.nextInt();

        System.out.println("enter 1  for addion ");
        System.out.println("wnter 2 for substraction ");
        System.out.println("enter 3 for multiplication");
        System.out.println("wnter 4 for divide  ");

        System.out.println("enter your choise : ");
        
        int choise= obj.nextInt();

        switch(choise){
        
        case 1 : System.out.println("add : " +(a+b));

        break;
        case 2 : System.out.println("add : " +(a-b));
        
        break;
        case 3 : System.out.println("add : " +(a*b));
        
        break;
        case 4 : System.out.println("add : " +(a/b));
        
        break;
        default: System.out.println("invalid option");
        }


    }
}
