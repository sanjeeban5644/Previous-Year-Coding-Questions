// remove duplicate from a string. retain the first character of the duplicate characters. 
// space must be excluded while eliminating 
// duplicate characters



import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        String str = "call taxi";
        StringBuilder sb = new StringBuilder();
        int[] upper = new int[26];
        int[] lower = new int[26];
        Arrays.fill(upper,0);
        Arrays.fill(lower,0);
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90){
                if(upper[ch-'A']==0){
                    sb.append(ch);
                }
                upper[ch-'A']=1;
            }else if(ch>=97 && ch<=122){
                if(lower[ch-'a']==0){
                    sb.append(ch);
                }
                lower[ch-'a']=1;
            }else{
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());


        // String str;
        // Scanner sc = new Scanner(System.in);
        // str = sc.nextLine();
        // HashSet<Character> map = new HashSet<>();
        // StringBuffer s = new StringBuffer("");
        // for(int k = 0; k < str.length(); k++){
        //     if(map.contains(str.charAt(k)) || str.charAt(k) == ' '){
        //         continue;
        //     }else{
        //         map.add(str.charAt(k));
        //         s.append(str.charAt(k));
        //     }
        // }
        // System.out.println(s);
        // sc.close();

    }
}

/* 
TestCase: 
Input: "Hello There"
Output: "Helo Thr"
Input: "call taxi"
Output: "cal txi"
*/