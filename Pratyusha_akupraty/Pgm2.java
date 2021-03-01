import java.util.*;
public class Pgm2{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     //taking the input from the user.
     System.out.println("Input First Number: ");
     Double a=sc.nextDouble();
     System.out.println("Input Second Number: ");
     Double b=sc.nextDouble();
     //checking the given condition if the given numbers are strictly between 0 and 1.
     if(a>0 && b>0 && a<1 && b<1){
       System.out.println("true");
     }
     else{
       System.out.println("false");
     }
  }
}
