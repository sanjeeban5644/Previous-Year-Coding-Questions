// Write a Java program that computes the sum of the digits of integers in an array, excluding the smallest and largest digits of each integer. The program should take an array of integers as input and output the sum of the digits (excluding the smallest and largest) for all integers in the array.

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {12234,2341,13445,4156};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=func(arr[i]);
        }
        System.out.println(sum);
    }

    static int func(int num){
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        while(num!=0){
            int d = num%10;
            list.add(d);
            num/=10;
        }
        Collections.sort(list);
        list.remove(0);
        list.remove(list.size()-1);
        for(int i = 0;i<list.size();i++){
            ans+=list.get(i);
        }
        return ans;
    }

}

/*
TestCases: 
Input: {12234, 2341, 13445, 4156}
Expected Output: 19
Input: {999, 876, 543, 210}
Expected Output: 18
*/