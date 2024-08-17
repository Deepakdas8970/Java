import java.util.Scanner;

public class input {
    public static void main(String[] args){
        // //how to get input in java 
        // Scanner objt= new Scanner(System.in);//object creation of class
        // System.out.println("enter your name");
        // // String  name = objt.next(); //only takes only one word  
        // // String  name = objt.nextLine(); // takes full statement 
        
        // //for int type nextInt and float  k liye nextFloat
        // System.out.print(name);

        // Q

       /*  int a;
        int b;
        Scanner obj1=new Scanner(System.in);
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value of a : ");
        a=obj1.nextInt();
        System.out.println("enter the value of b : ");
        b=obj.nextInt();
        int c=a+b;
        
        System.out.println(c); */





    
        

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            if (s1.length()<=10 && x>=0 && x<=999) {
                if (x>=100 && x<=999) {
                System.out.println(s1+"               "+x);
            }
            else
            System.out.println(s1+"               "+"0"+x);
            }
        }
        System.out.println("================================");

    }

    
}

