package Arrays.ArrayAlgorithms;


//This Algorithm is for finding the maximum sum of any subarray from the given array.
public class KadaneAlgorithm {

    public static int Kadane(int arr[]){
        int meh=0,msf=0;
        for(int i:arr){
            meh = meh+i;
            if(meh<i)
                meh=i;
            if(msf<meh)
                msf=meh;
        }
        return msf;
    }
    public static void main(String args[]){
        int arr[] = {1,2,-4,5,-2,8,11,-10};
        System.out.print(Kadane(arr));
    }
}
