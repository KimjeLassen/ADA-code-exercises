import java.util.Arrays;

public class Exercise1 {
    static int sum(int n) {
        if (n==1) 
        {
            return 1;
        }
        else
        {
            int result = n+sum(n-1);
            return result;
        }
        
    }
    static int evenSquares(int n) {
        if (n%2==0)
        {
            return evenSquares(n-1)+n*n;
        }
        else if (n==1)
        {
            return 0;
        }
        else
        {
            return evenSquares(n-1);
        }
    }
    static int fib(int i) {
        if (i==1)
        {
            return 1;
        }
        else if (i==2)
        {
            return 1;
        }
        else
        {
            return fib(i-1)+fib(i-2);
        }
    }
    static boolean linear(String s, char c, int i) {
        char p = s.charAt(i);
        if (s.charAt(i)==c)
        {
            
            return true;
        }
        else if (i==0)
        {
            return false;
        }
        else
        {
            return linear(s,c,i-1);
        }
    }
    static boolean binarySearch(int arr[], int value) {
        if (arr[0] > value || arr[arr.length-1] < value){
            return false;
        }
    
        int mid = arr.length / 2;
    
        int[] newArr;
        if (arr[mid] < value){
            newArr = Arrays.copyOfRange(arr, mid + 1, arr.length);
            return binarySearch(newArr, value);
        }
        else if (arr[mid] > value){
            newArr = Arrays.copyOfRange(arr, 0,mid);
            return binarySearch(newArr, value);
        }
        else {
            return true;
        }
    }
    public static int logTo(int n) {
        // Whenever n reaches 1 it returns 0 because 2^0 = 1 and this is our base case
        if (n == 1) {
            return 0;
        }
        // Eventually when n reaches 1 and it returns 0, the calls will slowly trickle
        // back and the first call of the function will end up returning the amount of
        // times the function was called.
        else {
            return 1 + logTo(n / 2);
        }
    }
    public static void main(String[] args) {
        String string = "Hello my nwords";
        int arr[] = {1,2,3,4,5,6,7,8,10,45};
        System.out.println(logTo(32));
        }
}
