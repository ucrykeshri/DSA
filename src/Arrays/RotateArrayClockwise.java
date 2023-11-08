package Arrays;

public class RotateArrayClockwise {

    /*Algorithm(tc -O(n2), sc -O(1):
        1. Pehle hme array ka transpose krna pdega . Transpose krne k liye
            hme simply array me traversal krna pdega aur swap krna pdega har uss element ko
            jaha pe i and j equal nhi hai .
           condition  if(i!=j) -> swap the elements.
     */
    public static void Rotate(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i!=j){
                    int temp = arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            return;
        }
    }
    public static void main(String args[]){
        int arr [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" , ");
            }
            System.out.println();
        }
    }

}
