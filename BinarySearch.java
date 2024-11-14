import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
public class BinarySearch{
  // public static int binaryMethod(){

  // }
  public static void main(String args[]) throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.println("Input filename: ");
    String filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    int count = Integer.parseInt(fin.nextLine());
    //System.out.println(count);     this was used to check the first value
    int[] arr = new int[count];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(fin.nextLine());
      System.out.println(arr[i] + " ");
    }


  }
}