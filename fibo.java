// To calculate Fibonacci Series up to n numbers.
package BASIC;

import java.util.*;
public class fibo {
    public static void main(String [] args){
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any number n");
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        sc.close();
    }

}
