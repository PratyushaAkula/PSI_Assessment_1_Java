import java.util.*;
public class Pgm3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //taking user input for number of rows and columns.
    System.out.println("Enter the number of rows:");
    int r=sc.nextInt();
    System.out.println("Enter the number of columns:");
    int c=sc.nextInt();
    //creating a boolean 2d array with r rows and c columns.
    Boolean[][] arr=new Boolean[r][c];
    //taking boolean input from the user.
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        arr[i][j]=sc.nextBoolean();
      }
    }
    System.out.println("Output:");
    //replacing true with t and false with f.
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        if(arr[i][j]){
           System.out.print("t ");
        }
        else{
          System.out.print("f ");
        }
      }
      System.out.println();
    }
  }
}