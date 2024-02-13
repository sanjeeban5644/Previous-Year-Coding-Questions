// Problem Statement :

// After JEE Mains, some students got admission into an engineering college. Now there is a class consisting of such n students, and the HOD came to say it is time to select the class monitor. But He never gets all of them at one time. So he brought a register, every time he gets someone with less rank than the previous time he cut the name and wrote the name of the student and the rank.
// For a given number of ranks he gets each time, you have to predict how many names are cut in the list.



public class Question10 {
    public static void main(String[] args) {
        int[] arr = {4,3,7,2,6,1};
        int rank = arr[0];
        int cut = 0;
        for(int i : arr){
            if(i<rank){
                rank=i;
                cut++;
            }
        }
        System.out.println(cut);
    }
}

// Sample Input:
// 6
// 4 3 7 2 6 1

// Sample Output:
// 3