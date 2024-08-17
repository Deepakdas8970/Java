package InterviewQuestions;

import java.util.Scanner;

public class Array2D1 {
  public static void main(String[] args) {
    int [][] arr=new int[3][3];
    for(int row=0;row<arr.length;row++){
      for(int col=0;col<arr.length;col++){
        Scanner input=new Scanner(System.in);
        arr[row][col]=input.nextInt();
      }

    }

    for(int row=0;row<arr.length;row++){
      for(int col=0;col<arr.length;col++){
        System.out.print(arr[row][col]);
      }
      System.out.print("\n");

  }
}
  
}
