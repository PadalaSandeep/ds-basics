package com.problems;

import java.util.*;

public class AddUpToTarget {

    public static void main(String[] args) {
        int[] in = new int[] {1,2,4,5,6};
        int target = 10;
        addUptoTargetNComplex(in, target);
        addUptoTargetNSquareComplex(in, target);
    }

    private static void addUptoTargetNSquareComplex(int[] inputArray, int target){
        int[] output = new int[2];
        for (int i=0; i<inputArray.length; i++){

            int combo1 = inputArray[i];

            for (int j=i+1; j<inputArray.length; j++){

                if(combo1+inputArray[j]==target){
                    output[0] = combo1;
                    output[1] = inputArray[j];
                }
            }

        }

        System.out.println(output[0]+","+output[1]);
    }

    private static void addUptoTargetNComplex(int[] intArray, int target){

        HashMap<Integer,Integer> mapValues = new HashMap<>();
        int[] output = new int[2];
        for (int i =0; i<intArray.length; i++){
            mapValues.put(intArray[i],intArray[i]);

            try{
                if(intArray[i]+mapValues.get(target-intArray[i]) == target){
                    output[0] = intArray[i];
                    output[1] = target - intArray[i];
                }
            }
            catch (Exception e){

            }

        }
        Arrays.sort(output);
        System.out.println(output[0]+","+output[1]);

    }
}

