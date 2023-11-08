package Arrays;
public class RotateArray {
    public static void helper(int arr[],int k,int n) {
        int i=0;
        for (int j = n - 1; j >=n-k; j--) {

            System.out.print(arr[j]);
        }
            for ( i = 0; i < n-k; i++) {
                System.out.print(arr[i]);

        }
            return ;
    }
        public static void main(String args[]){
            int arr [] = {1,2,3,4,5};
            helper(arr,3,5);
    }
}
