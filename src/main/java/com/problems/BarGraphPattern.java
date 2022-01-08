package com.problems;

/*Problem statement: Print a bar graph as per input integer array given
Example:
input: {3,2,-2,1,2,5,4,-3}

Output:

     *
     **
*    **
**  ***
** ****
  *    *
  *    *
       *


*/



public class BarGraphPattern {

    public static void main(String[] args) {
        printPattern(new int[]{3,2,-2,1,2,5,4,-3});
    }

    static void printPattern(int[] input){

        int maxNumber = 0;
        int minNumber = 0;

        for (int z=0; z<input.length; z++){
            if(input[z]>maxNumber){
                maxNumber = input[z];
            }
            else if(input[z]<minNumber){
                minNumber = input[z];
            }
        }


        while(maxNumber>=minNumber)
        {

            for(int i=0; i<input.length; i++){

                if((maxNumber==input[i] || maxNumber<input[i]) && maxNumber>0){

                    System.out.print("*");

                }
                else if(maxNumber<0 && input[i]<0 && maxNumber>=input[i]){
                    System.out.print("*");
                }

                else{

                    System.out.print(" ");

                }
            }
            System.out.print("\n");
            maxNumber--;
            if (maxNumber==0){
                maxNumber--;
            }

        }

    }
}
