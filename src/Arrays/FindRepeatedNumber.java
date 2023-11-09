package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatedNumber {

    //Complexity (N,N)
    public static int repeatedNumber(final int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i:A){
            if(set.contains(i))
                return i;
            else
                set.add(i);
        }
        return -1;

    }
    //Complexity(N,1)
    public static int repeatedNumberLinear(final int[] nums){
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String args[]){
         final int arr[] = {1,2,3,4,3};
         System.out.println(repeatedNumber(arr));
         System.out.println(repeatedNumberLinear(arr));

    }
}
