package com.problems;

import java.util.*;

/*Problem statement:

For a given input String, return an output string with highest frequency of chars as first.
Note: For same frequency repeated chars, print in ascending order

Ex1: "this is my nations india"
Output: iiiiinnnsssaattdhmoy

Ex2: "saandeep"
Output: "aaeednps"


 */
public class CharsFrequency {

    public static void main(String[] args) {

        System.out.println(callToDecend("saandeep"));
    }


    public static String callToDecend(String input){

        input = input.replaceAll(" ","").toLowerCase();

        StringBuilder output = new StringBuilder("");
        HashMap<Character, Integer> mapBuild = new HashMap<>();
        HashMap<Integer, List<Character>> mapBuildNew = new HashMap<>();
        List<Integer> repeats = new ArrayList<>();

        //Storing in a map to get all frequencies
        for (int i=0; i<input.length(); i++){

            if (mapBuild.get(input.charAt(i)) != null){
                mapBuild.put(input.charAt(i), mapBuild.get(input.charAt(i))+1);
            }
            else {
                mapBuild.put(input.charAt(i), 1);
            }

        }

        //Storing in a new map to add duplicate values with list implementation
        for (Character key: mapBuild.keySet()){
            if (!repeats.contains(mapBuild.get(key))){
                repeats.add(mapBuild.get(key));
            }

            if (mapBuildNew.get(mapBuild.get(key)) == null){
                mapBuildNew.put(mapBuild.get(key), new ArrayList<>(Arrays.asList(key)));
            }
            else {
                List<Character> newList = mapBuildNew.get(mapBuild.get(key));
                newList.add(key);
                mapBuildNew.put(mapBuild.get(key), newList);
            }

        }

        //Sorting values to be repeated
        Collections.sort(repeats, Collections.reverseOrder());

        //Iterating in a loop to pull the frequency to be printed with chars sorting
        for (int z=0; z<repeats.size(); z++){
            Collections.sort(mapBuildNew.get(repeats.get(z)));
            int repeatSize = mapBuildNew.get(repeats.get(z)).size();
            for (int y=0; y<repeatSize; y++){
                for (int c =1; c<=repeats.get(z); c++){
                    output.append(mapBuildNew.get(repeats.get(z)).get(y));
                }

            }

        }

        return output.toString();
    }
}
