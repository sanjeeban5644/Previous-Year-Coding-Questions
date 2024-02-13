// Question : Write a Java program that takes an array of integers arr and an integer num as input. The program should find and return the total number of unique pairs of integers in the array whose sum is equal to num. Each integer in the array can only be used once in each pair.

import java.util.*;


public class Question1 {
    public static void main(String[] main){
        int[] arr = {2,8,6,7,8,7,2};
        int num = 10;
        int ans = findTotalPairs(arr,num);
        System.out.println(ans);
    }

    static int findTotalPairs(int[] arr,int num){
        Set<Integer> set = new HashSet<>();
        for(int n : arr){
            set.add(n);
        }
        int i = 0;
        int[] tempArr = new int[set.size()];
        for(int n : set){
            tempArr[i]=n;
            i++;
        }
        int count = 0;
        for(i = 0;i<tempArr.length;i++){
            for(int j = i+1;j<tempArr.length;j++){
                if(i!=j){
                    int sum = tempArr[i]+tempArr[j];
                    if(sum==num) count++;
                }
            }
        }
        return count;
    }
}


/*
Test Cases: 
Input: arr = {2, 2, 4, 5}, num = 6
Expected Output: 1
Input: arr = {1, 2, 3, 4, 5}, num = 9
Expected Output: 1
Input: arr = {1, 1, 1, 1, 1}, num = 2
Expected Output: 0
Input: arr = {0, 1, 2, 3, 4, 5}, num = 5
Expected Output: 3
Input: arr = {1, 2, 3, 4, 5, 6}, num = 7
Expected Output: 3
*/