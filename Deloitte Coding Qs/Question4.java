// For each letter of the string if the ch is a vowel, then resultant binary string b must be concatenated with "0", else it 
// is "1" and return the binary string b.

public class Question4 {
    public static void main(String[] args) {
        String str = "xuuab";
        int ans = func(str);
        System.out.println(ans);
    }

    static int func(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isVowel(ch)){
                sb.append("0");
            }else{
                sb.append("1");
            }
        }
        int num = Integer.parseInt(sb.toString());

        return toDecimal(num);
    }

    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }

    static int toDecimal(int num){
        int sum = 0;
        int i = 0;
        while(num!=0){
            int d = num%10;
            int temp = (int)(Math.pow(2,i)*d);
            sum+=temp;
            num/=10;
            i++;
        }
        return sum;
    }


}

/* 
TestCases: 
Input: "zoo"
Output: 4
Input: "xuuab"
Output: 17
*/