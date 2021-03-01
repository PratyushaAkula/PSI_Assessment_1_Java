import java.util.*;
public class Pgm6{
 public static int count(int n){
   int count=0;

   //Converting integer to binary
   String bin=Integer.toBinaryString(n);
   System.out.println("Binary representation of "+ n + " is " + bin);
   
   //Counting number of zeroes.
   for(char c : bin.toCharArray()){
     if(c=='0'){
       count+=1;
     }
    
   }
   return count;
 }
 public static void main(String args[]){
  
  //taking user input.
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  int n=sc.nextInt();
  System.out.println("\n Number of zero bits: "+ count(n));
}
}