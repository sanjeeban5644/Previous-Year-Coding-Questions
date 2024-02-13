// if he takes the last N numbers in sequence then the lucky number is equal to the sum of all 
// the numbers thata have repeated odd number of times.


import java.util.HashMap;
import java.util.Map;

public class Question6 {
    public static void main(String[] args) {
        int[] arr = {100,200,300,40,40};
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i)%2!=0){
                sum+=(i*map.get(i));
            }
        }

        System.out.println(sum);
    }
}



/*

TestCase: 
Input: {11,11,12,12,13,13,13}
Output: 39
Input: {100,200,300,40,40}
Output: 600

*/