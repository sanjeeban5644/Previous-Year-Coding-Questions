// append the fibonacci series in front of the respective characters. add all numbers used and write it in the beginning of the new string. 



public class Question7 {
    public static void main(String[] args) {
        
        String str = "beautiful";
        StringBuilder sb = new StringBuilder();
        int prefix = 0;
        for(int i = 0;i<str.length();i++){
            sb.append(str.charAt(i));
            int toAdd = fib(i+1);
            sb.append(String.valueOf(toAdd));
            prefix+=toAdd;
        }
        sb.insert(0,String.valueOf(prefix));
        System.out.println(sb.toString());
    }


    static int fib(int num){
        if(num==1 || num==2){
            return 1;
        }
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i = 3;i<=num;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}

/*
TestCase: 
Input: "abcde"
Output: 12a1b1c2d3e5
Input: "beautiful"
Output: 88b1e1a2u3t5i8f13u21l34
*/