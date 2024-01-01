import java.util.HashMap;

public class Random {
    //The algorithm returns the number of occurrences of a certain integer (parameter val)in an integer array (parameter x)
    //Parameter n is the number of elements in the array.
    public static int getNumberEqual(int[] array, int amount, int val) {
        if(amount == 0) {
            return 0;
        }
        if (array[amount-1] == val) {
            return 1 + getNumberEqual(array, amount-1, val);
        }
        return getNumberEqual(array, amount-1, val);

    }
    public static long findPythagoreanTriplet() {
        for (int a = 1; a < 1000 / 3; a++) {
            for (int b = a + 1; b < 1000 / 2; b++) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c) {
                    return a*b*c;
                }
            }
        }
        return 0; // No triplet found
    }
    public static String mostFrequentLetter(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        int max = 0;
        for (Integer i : map.values()) {
            if (i > max) {
                max = i;
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) == max) {
                return c.toString();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(mostFrequentLetter("cvccsdfsdvsdvsdvsdvdsvsdgerwgewfewqfhwifjsinskcsd"));
        
    }
}
