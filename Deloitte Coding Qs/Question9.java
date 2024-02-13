import java.util.*;


public class Question9 {
    public static void main(String[] args) {
       String str = "aaabbbbbcccaaa";
       StringBuilder sb = new StringBuilder();
       char[] arr = str.toCharArray();
       char prev = arr[0];
       char curr = arr[0];
       int counter = 0;
       int i = 0;
       while(i<arr.length){
            curr=arr[i];
            if(prev==curr){
                counter++;
                i++;
            }else{
                sb.append(prev);
                sb.append(String.valueOf(counter));
                counter=0;
                prev=arr[i];
            }
       }
        sb.append(prev);
        sb.append(String.valueOf(counter));

       System.out.println(sb.toString());
    }
}
