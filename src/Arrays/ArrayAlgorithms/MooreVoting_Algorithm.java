package Arrays.ArrayAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// MAJORITY ELEMENT (N/2, N/3)
public class MooreVoting_Algorithm {

    public static int better(int arr[])
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(int i:map.keySet()){
            if(map.get(i)> (arr.length/2))
                return i;
        }
        return -1;
    }
    /*
    Moore Voting Algorithm
            1. first traverse the array ;
            2. at every iteration , first check if the cnt ==0 , then increase the count by 1 and make
                and make current majority element as arr[i] ;
            3. At every iteration if arr[i] == current majority element , increase the count by 1 ;
            4. else decrease the counter by 1 ;
            5.At last make single traversal and check if the count of current majority element is >n/2 times or not.
     */
    //(>n/2)
    public static int best(int arr[]){
        int cnt=0,element = -1;
        for(int i:arr){
            if(cnt==0){
                cnt=1;
                element = i;
            }
            else if(i==element){
                cnt++;
            }
            else
                cnt--;
        }
        cnt=0;
        for(int i:arr){
            if(i==element)cnt++;
        }
        if(cnt>(arr.length/2))
            return cnt;
        return -1;
    }
    //(>n/3)
    /*
      1. In here, At max , the array can have only 2 elements which can be appeared more than
         N/3 times.
      2.
     */
    public static List<Integer> best_1(int arr[]){
        int cnt1=0,element1 = -1;
        int cnt2=0,element2 = -1;
        List<Integer>list = new ArrayList<>();
        for(int i:arr){
            if(cnt1==0 && i!=element2){
                cnt1=1;
                element1 = i;
            }
            if(cnt2==0 && i!=element1){
                cnt2=1;
                element2 = i;
            }
            else if(i==element1){
                cnt1++;
            }
            else if(i==element2)
                cnt2--;
        }
        cnt1=0;
        for(int i:arr){
            if(i==element1)cnt1++;
        }
        if(cnt1>(arr.length/2))
            list.add(element1);
        if(cnt2>(arr.length/2))
            list.add(element2);
        return list;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,3,4,5,5,6,5,4,5,5,2,1};
        System.out.println(best(arr));
        System.out.print(best_1(arr));
    }
}
