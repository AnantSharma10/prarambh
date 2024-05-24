package BASIC;
import java.util.*;
public class revison {
    public static void main(String[] args) {
      //  fun(1,3432,45,3,5,6,67,2,123,4,65);
        //array();
       // arraylist();
       int arr[]={1,20,3,49,52,6,7,8,90,99,100,120};
       Arrays.sort(arr);
       int key=8;
       int result=Arrays.binarySearch(arr,key);
       //int result= binarysearch(arr, 0, 11, 100);
       if (result == -1) {
        System.out.println("Element not present");
    } else {
        System.out.println("Element found at index " + result);
    }
    }
    /*public static void fun(int ... a){
       for(int num:a){
        System.out.print(num+" ");
       }
       System.out.println();
    }
    static void array(){
        Scanner in=new Scanner(System.in);

        int [][]arr =new int[3][4];
        System.out.println("Enter the element of array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Elements of array are ");
        for(int []ai:arr){
            System.out.println(Arrays.toString(ai));
        }
        in.close();
    } 

    static void arraylist(){
        int n=10;
        ArrayList <Integer> arr =new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            arr.add(i);
            System.out.print(" ");
        }
        arr.add(5,74);
        System.out.print(arr.contains(99));
        arr.set(0, 99);
        arr.remove(10);
        for(int i:arr){
          System.out.println(i+" ");
        }
    }  
    static int binarysearch(int arr[],int l,int h,int x){
        if(h>=l){
          int mid=l+(h-l)/2;
          if (arr[mid]==x)
            return mid;
          if(arr[mid]>x)
            return binarysearch(arr, l,mid-1,x);
          return binarysearch(arr, mid+1, h, x);
        }
        return -1;
    }
*/
}