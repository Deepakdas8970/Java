import java.util.Scanner;
public class array {
    public static void main(String[] args){
        /* what is array in java : 
        // Arrays in Java are fixed-size data structures that can store multiple values of the same type in single variable .
        // Each element in an array can be accessed using its index, starting from 0.
        */

        /* //declaration of array
        int[] myArray; // Recommended style
        int myArray[]; // Valid, but less common */

       /*  // initialization of array
        
        int[] myArray = {1, 2, 3, 4, 5};//Static Initialization
        System.out.println(myArray[0]);
        for(int i=0;i<5;i++){
            System.out.println(myArray[i]);
        }
        //int[] myArray=new int[5];//dynamic initialization */

        // take a array as input 
        int size=5;
        int[] arr=new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of array : ");
        for(int i=0;i<size;i++){
            int val=sc.nextInt();
            arr[i]=val;
        }

        System.out.println("The Array is : ");
        
        for(int i=0;i<5;i++){
            System.out.print(" "+arr[i]+" ");
        }

        System.out.println("Enter the search value ");
        
        int N=sc.nextInt();

        for(int i=0;i<=5;i++){
            if (N==arr[i]) {
                System.out.println("Item is found at index: "+i);
            
        }
        else{
            System.out.println("item is not found ");
            break;
        }
        
    }
    
    
    }
}
