import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
public class BinarySearch{
  public static int searchVal;
  public static int binaryMethod(int[] arr, int low, int high, int searchVal){
    if(high > low){
      int middle = high/2; 
      if(middle == searchVal){
        return middle;
      }
      else if(arr[middle] > searchVal){
        return binaryMethod(int[] arr, low, middle - 1, searchVal);
      }
      else{
        return binaryMethod(int[] arr, low, middle + 1, searchVal);
      }
    }
    return -1;

  }
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
      //System.out.println(arr[i] + " ");    print statement for the array
    }
    Arrays.sort(arr);   //sorts the array
    int high = 0;
    int low = 0;
    for (int i = 0; i < arr.length; i++) {
      high = arr[0];
      low = arr[count - 1]
      //System.out.println(high + " " + low);checking high and low
      //System.out.println(arr[i] + " ");    print statement for the array
    }
    System.out.println("What number do you want to search for? Input here: ");
    searchVal = Integer.parseInt(in.nextLine());
    if(binaryMethod(arr) == -1){
      System.out.println("The value " + searchVal + " is not in the list");
    }
    else{
      System.out.println("The index of value " + searchVal + " is " + binaryMethod(arr));
    }



  }
}