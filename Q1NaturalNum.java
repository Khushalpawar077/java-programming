package looping;
import java.*;
import java.util.Scanner;
public class Q1NaturalNum {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vlaue from where to print the num");
        i=sc.nextInt();
        System.out.println("enter the value to where to print");
        n=sc.nextInt();
        while(i<=n)
        {
            System.out.println(""+i);
            i++;
        }
    }
}
