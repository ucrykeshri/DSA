package Arrays.ArrayAlgorithms;

public class TurtleRabbitAlgorithm {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    // We are using this algo as a slow and fast pointer technique to fetch the meeting point of both the pointers.
    // to both the pointers we store the element which is at that index.
    // example : If nums[i] =5 , then slow = nums[slow]. fast = nums[nums[fast]].

        public static int repeatedNumber(final int[] nums) {
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
        public static  void main(String args[])
        {
            final int arr[] = {1,2,3,5,5,4};
            System.out.println(repeatedNumber(arr));

        }

}
