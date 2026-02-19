
import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        var reversed = reverseArray(arr);
        System.out.println((Arrays.toString(reversed)));
        System.out.println(findMinimum(arr));
        System.out.println(findMaximum(arr));
        System.out.println(isPalindrome("insta"));
    }
    static int[] reverseArray(int[] arr){
        int n=arr.length-1;
        for (int i = 0; i < (arr.length/2); i++) {
            swap(arr, n, i);
            n--;
        }
        return arr;
    }
    private static void swap(int[] arr, int n, int i) {
        int temp = arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
    }
    static int findMinimum(int[] arr){
        int minimumElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(minimumElement >= arr[i]){
                minimumElement = arr[i];
            }
        }
        return minimumElement;
    }
    static int findMaximum(int[] arr){
        int maximumElement = arr[0];
        for(int i=1;i<arr.length;i++){
            if(maximumElement <= arr[i])
                maximumElement=arr[i];
        }
        return maximumElement;
    }
    static boolean isPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1;i>-1;i--){
            stringBuilder.append(str.charAt(i));
        }
        return (stringBuilder.equals(str));
    }
}
