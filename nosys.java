package BASIC;

public class nosys {
    public static void main(String[] args) {
        //int n=67;
       // System.out.println(isodd(n));
       int a[]={1,2,3,4,5,6,4,5,2,3,1};
       System.out.println(findunique(a));
    }
   /* static boolean isodd(int n){
        int a=n & 1;
           if(a==1){
             return true;
          }
          return false;
       }
*/
    static int findunique(int[] a){
       int unique=0;
       for(int n:a){
        unique^=n;
       }
       return unique;
    }
}
