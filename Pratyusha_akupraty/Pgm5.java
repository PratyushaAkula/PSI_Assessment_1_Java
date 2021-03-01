import java.util.*;
public class Pgm5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    //taking user input for number of elements in an array.
    System.out.println("Enter the number of element:");
    int n=sc.nextInt();
    
    //creating an array of type integer containing n elements.
    Integer[] arr=new Integer[n];
    
    //taking user input for number of largest elements to be printed.
    System.out.println("Enter the number of largest elements to be printed:");
    int k=sc.nextInt();
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Original Array:" + Arrays.toString(arr));
    
    //sorting the array in descending order
    Arrays.sort(arr,Collections.reverseOrder());
    
    //printing the k largest elements.
    System.out.println(k+" largest elements of the said array are:");
    for(int i=0;i<k;i++){
      System.out.println(arr[i]);
    }
  }
}