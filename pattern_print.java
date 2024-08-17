

import java.util.Scanner;

public class pattern_print {
    public static void main(String[] args) {
        // pattern printing problem

        // problem no.1
        /*
          ******
          ******
          ******
          ******
         */
        /*
         * //solution
         * for(int i=0;i<4;i++){
         * for(int j =0;j<6;j++){
         * System.out.print("*");
         * }
         * System.out.println("\n");
         * }
         */

        /*
         * //problem no.2
         *****
         * *
         * *
         *****
         */
        /*
         * // Loop through each row of the rectangle
         * for(int i=1;i<=4;i++){
         * // Loop through each column of the rectangle
         * for(int j=1;j<=5;j++)
         * {
         * // Check if the current position is on the border of the rectangle
         * if (i==1 || j==1 || j==5 || i==4) {
         * // If on the border, print an asterisk
         * System.out.print("*");
         * }
         * else {
         * // If inside the border, print a space
         * System.out.print(" ");
         * }
         * }
         * // Move to the next line after printing each row
         * System.out.println("\n");
         * }
         * 
         * }
         */

        // problem no.3


        /*

    
         *
         * *
         * * *
         * * * *
         * * * * *
        
         */
       /*  //solution 
        for(int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        } */

        // problem no.4


        /*

    
         * * * * *
         * * * *                               
         * * *
         * * 
         * 
        
         */
        /* //solution 
        for(int i=1; i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        } */

        // problem no.4


        /*

    
         * * * * *
         * * * *                               
         * * *
         * * 
         * 
        
         */
       /*  //solution  in recerse way
        for(int i=5; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        } */

        // problem no.4


        /*

    
                 *
               * *                              
             * * *
           * * * *
         * * * * *
        
         */
        //solution 
      //  for(int i=5; i>=1;i--){
        //     for(int k=1;k<=i-1;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("\n");
        // }

        // problem no.4


        /*

    
               *
             * * * 
           * * * * *
         * * * * * * *
        
         */
        // //solution 
        // for(int i=5; i>=1;i--){
        //     for(int k=1;k<=i-1;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<=5;j++){
        //         System.out.print("*");
        //     }
            
        // }
          
    }

}
