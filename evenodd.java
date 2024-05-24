// Write a program to print whether a number is even or odd, also take input from the user.
package BASIC;


import java.util.*;
public class evenodd{
       public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number n");
        int n=sc.nextInt();
        if (n%2==0){
            System.out.println("Given number "+n+"is even");
        }
        else {
            System.out.println("Given number"+n+"is odd");
        }
        sc.close();
    }
}

