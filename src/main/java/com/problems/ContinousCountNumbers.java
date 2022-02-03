package com.problems;

import java.util.Arrays;
//problem statement
// You are given an integer array nums. In one operation, you can replace any element in nums with any integer.
// nums is considered continuos if both of the following conditions are fulfilled:
// All elements in nums are unique.
// The difference between the maximum element and the minimum element in nums equals nums. length- 1.
// For example, nums=[4, 2, 5, 3] is continuous, but nums = (1, 2, 3, 5, 6] is not continuous.
// Return the minimum number of operations to make nums continuous.
public class ContinousCountNumbers {

    public static void main(String[] args) {
        System.out.println(countReplacement(new int[]{1,1,1,30}));
    }

    public static int countReplacement(int[] input){

        Arrays.sort(input);

        int min = input[0];
        int length = input.length;
        int count = 0;
        int max = min+length-1;

        for (int i = 0; i<length; i++ ){
            if(input[i] >= min && input[i] <= max){
            }
            else {
                count++;
            }
        }
        return count;
    }

}
