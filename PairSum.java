
import java.io.*;
import java.util.HashSet;
 
class PairSum {
    static void printpairs(int arr[], int sum)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];
            System.out.println("temp="+temp);
            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                    "Pair with given sum "
                    + sum + " is (" + arr[i]
                    + ", " + temp + ")");
            }
            s.add(arr[i]);
            System.out.println("s="+s);
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int A[] = { 1, 2, 7, 3, 4,4};
        int n = 8;
        printpairs(A, n);
    }
}
 