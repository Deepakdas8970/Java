import java.util.Scanner;

public class arrays_2d {

    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int row=obj.nextInt();
        System.out.println("Enter the number of col : ");
        int col=obj.nextInt();
        int arr[][]=new int[row][col];

        // taking input 
        System.out.println("Enter the arrays values below");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=obj.nextInt();
            }
            
        }
        
        // printing outputs
        System.out.println("Array element is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
      

        

    }
}
