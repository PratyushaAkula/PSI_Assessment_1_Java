import java.util.*;
public class Pgm4{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //taking user input for number of rows and columns.
    System.out.println("Enter the number of rows:");
    int r=sc.nextInt();
    System.out.println("Enter the number of columns:");
    int c=sc.nextInt();
    //creating an Integer 2d array with r rows and c columns.
    Integer[][] arr=new Integer[r][c];
    //taking input array elements from the user.
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    //printing the original array
    System.out.println("Original Array:");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    //changing the rows and columns
    System.out.println("After changing the rows and columns of the said array:");
    for(int i=0;i<c;i++){
      for(int j=0;j<r;j++){
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
   }
}