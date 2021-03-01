import java.util.*;
public class Pgm1{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   //taking the 4 user inputs
   System.out.println("Enter first number: ");
   int a=sc.nextInt();
   System.out.println("Enter second number: ");
   int b=sc.nextInt();
   System.out.println("Enter third number: ");
   int c=sc.nextInt();
   System.out.println("Enter fourth number: ");
   int d=sc.nextInt();
   
   //checking if all the 4 numbers are equal.
   if(a==b && b==c && c==d){
     System.out.println("Numbers are equal");
   }
   else{
     System.out.println("Numbers are not equal");
   }
 }
}