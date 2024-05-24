// eligible for vote if he/she is 18 above in age
package BASIC;
import java.util.*;
public class vote {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the age");
    int age =sc.nextInt();
    check(age);
    sc.close();
    }
    static void check(int a){
        if (a>=18){
            System.out.println("person is eligible for voting");
        }
        else {
            System.out.println("person is not eligible");
        }
    }
}
