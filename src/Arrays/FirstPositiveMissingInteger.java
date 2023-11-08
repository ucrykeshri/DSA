package Arrays;
import java.util.*;


/*      Algorithm:O(n,1)
            1. we will make all the elements less than 0 equal to 0.
            2. we will traverse all the elements and make sure that we mark each element with its index -1 .
            3. the answer will always lie between 1 to length of the arr.
 */

public class FirstPositiveMissingInteger {
    public  static int firstMissingPositive(int[] A) {
        for (int i = 0; i < A.length; i++)
        {
            while ((A[i] > 0 && A[i] <= A.length) && (i + 1 != A[i]))
            {
                int tmp = A[A[i] - 1];
                if (tmp == A[i])
                {
                    break;
                }
                A[A[i] - 1] = A[i];
                A[i] = tmp;
            }
        }
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] <= 0 || A[i] != i + 1)
            {
                return i + 1;
            }
        }
        return A.length + 1;
    }
    public static void main(String args[]) {
        int arr[]= {3,-3,6,3};
        System.out.print(firstMissingPositive(arr));

    }
}
