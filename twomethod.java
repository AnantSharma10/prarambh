// define two method to find max. and min. among 3 numbers
 
package BASIC;
import java.util.*;
public class twomethod{
    public static void main(String [] args){
       Scanner sc =new Scanner (System.in);
       System.out.print("Enter 3 no. a,b,c");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       max(a,b,c);
       min(a,b,c);
       sc.close();

    }
    static void max(int a,int b,int c){
        if(a>b && b>c){
            System.out.println("a is largest"+a);
        }
        else if(b>a && a>c) {
            System.out.println("b is largest"+b);

        }
        else{
            System.out.println("c is largest"+c);
        }
    
    } 
    static void min(int p,int q,int r){
        if(p<q && p<r){
            System.out.println("a is minimum"+p);
        }
        else if (q<p && q<r){
            System.out.println("b is minimum"+q);
        }
        else{
            System.out.println("c is minimum"+r);   
        }
        
    }
}