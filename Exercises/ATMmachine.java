//Atm machine using encapsulation concept of java

import java.util.Scanner;

class bank
{ 
private int bal=10000;
private int pass=8970;
Scanner r=new Scanner(System.in);

// deposit function
public void  deposit()
{
    int a;
    System.out.println("enter deposit amount: ");
    Scanner r=new Scanner(System.in);
   a=r.nextInt();
   System.out.println("Enter your pasword");
   pass=r.nextInt();

//   checking the password 
   if(pass==8970)
   {
       bal=a+bal;
       System.out.println("your deposit amount is:"+a);
       System.out.println("Total balance is:" +bal);
       
   }
   else
   {
       System.out.println("incorrect password plz try again");
   }
}

// withdraw functionality 

   public void withdraw()
   {
       int b;
       System.out.println("enter your withdraw amount");
       b=r.nextInt();
       System.out.println("enter your password");
       pass=r.nextInt();

    //    password checking 
       if(pass==8970)
       {
           bal=bal-b;
           System.out.println("your withdraw amount is :"+b);
           System.out.println("Total balance is:" +bal);
           
       }
       else
       {
           System.out.println("incorrect password");
           
       }
      }
      public void check_bal()
      {
          System.out.println("enter your password :" );
          pass=r.nextInt();
          if(pass==8970)
          {
          System.out.println(bal);
          }
          else
          {
              System.out.println("incorrect password");
          }
          
      }
}
class ATMmachine
{
    public static void main(String []args)
    {
        bank obj=new bank();
        int ch;
        System.out.println("1 Deposit money");
        System.out.println("2 Withdraw money");
        System.out.println("3 Check balance");
       
            System.out.println("enter your choice");
            Scanner r=new Scanner(System.in);
            ch=r.nextInt();
        switch(ch)
        {
            case 1 : obj.deposit();
            break;
            case 2 : obj.withdraw();
            break;
            case 3 : obj.check_bal();
            break;
            default : System.out.println("invalid option");
        }
    }
}