package InterviewQuestions;

import java.util.Scanner;

public class Array_questions {
  public static void main(String[] args) {

    // 1. sum of all the element of array

    float[] arr1 = { 23.1f, 45.3f, 6, 4 };
    float sum = 0;

    // for (int i = 0; i < arr1.length; i++) {
    // sum = sum + arr1[i];
    // }
    // System.out.print(sum);

    // 2. sum of all the element of array using foreach loop

    // for (float element : arr1) {
    // sum += element;
    // }
    // System.out.print(sum);

   /*  // 3. findout given element is present in array or not
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the finding number");

    float num = input.nextFloat();
    String check="";

    for (float element : arr1) {
      if (num == element) {
        check=num+" is prensent";
        break;

      } else {
        check=num+" is not prensent";
      }
    }
    System.out.print(check); */

  }

}
