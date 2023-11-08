package Arrays;
class KthRowInPascalsTraingle{

    /*Algorithm:
         1.kth row nikalne k liye mujhe pehle nCr waale formula ko check krna padega
         2.For every row, formula hota hai let say hmara n =3 hai to 
            hme 3c0 , 3c1 , 3c2 , 3c3 calculate krna pdega aur hmara answer yhi hoga .
         3. nCr Calculate karne k liye formula hota hai 
            3.1 Loop through 1 to r and at every r -> res =(res*n-i+1)/i;
         */ 
    public static int[] kthRow(int row){
        int res[] = new int[row+1];
        for(int i=0;i<=row;i++){
            res[i]=nCr(row,i);
        }
        return res;
    }
    // formula to find the nCr 
    public static int nCr(int n,int r){
         r = (int)Math.min(r,n-r);
        int res =1;
        for(int i=1;i<=r;i++){
            res=(res*(n-i+1))/i;
        }
        return res;
    }
    public static void main(String args[]){
        int output[] =kthRow(4);
        for(int i:output){
            System.out.print(i+" ");
        }
    }
}