// Write a Java program to find the maximum frequency of any element in an integer array. The program should prompt the user to enter the size of the array and its elements. Then, it should compute and display the maximum frequency of any element in the array.

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1,10,31,54,1,61,2,2,2};
        int ans = findMaxFrequency(arr);
        System.out.println(ans);
    }

    static int findMaxFrequency(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int i : map.keySet()){
            max=Math.max(max,map.get(i));
        }
        return max;
    }

}

/*
TestCases:
Array Size: 8
Array Elements: 1 2 2 3 3 3 4 4
Output:Maximum Frequency: 3
Array Size: 5
Array Elements: 5 5 5 5 5
Output:Maximum Frequency: 5
Array Size: 10
Array Elements: 9 9 8 8 7 7 6 6 5 5
Output:Maximum Frequency: 2
*/