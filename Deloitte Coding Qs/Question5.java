// Given a numerical array. find the smallest possible sum of two numbers created using the digits of the arrayelements. 
// the two numbers together
// should include all the digits of the array.

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {6,8,5,4,2,3};
        Arrays.sort(arr);
        int num1 = 0;
        int num2 = 0;
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
                num1=(num1*10)+arr[i];
            }else{
                num2=(num2*10)+arr[i];
            }
        }
        System.out.println(num1+num2);
    }
}

/*
TestCases: 
Input: {6,8,5,4,2,3}
Output: 604.
Input: {5,3,0,7,4}
Output: 82.
*/