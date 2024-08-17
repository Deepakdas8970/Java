import java.util.Scanner;
public class leetcode_problem {

    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            
            arr[i]=obj.nextInt();
        }

        System.out.println("Enter the number of target : ");
        int target=obj.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]+arr[i+1]==target){
                System.out.println("["+i+","+(i+1)+"]");
            }
        }
    }
}

