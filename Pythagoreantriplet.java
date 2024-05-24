// A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
package BASIC;
import java.util.*;
public class Pythagoreantriplet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a 3 digit number"); 
        int n=sc.nextInt();
        triplet(n);
        sc.close();
    }
    static void triplet(int n){
        int i=n/10;
        int p=i%10;
        p=p*p;
        int q=i/10;
        q=q*q;
        int sum=p+q;
        int r=n%10;
        r=r*r;
        if (r==sum){
            System.out.println("given number"+" "+n+" is pythagorean triplet");
        }
        else{
            System.out.println("given number is not pythagorean triplet");
        }
        
    }
}
