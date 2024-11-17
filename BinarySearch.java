import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
public class BinarySearch{
  public static int binaryMethod(int[] arr, int low, int high, int searchVal){
    if(high >= low){
      int middle = (low+high)/2; 
      if(arr[middle] == searchVal){
        return middle;
      }
      else if(arr[middle] > searchVal){
        return binaryMethod(arr, low, middle - 1, searchVal);
      }
      else if(arr[middle] < searchVal){
        return binaryMethod(arr, middle + 1, high, searchVal);
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
    fin.close();
    Arrays.sort(arr);   //sorts the array
      int low = 0;
      int high = arr.length - 1;
    System.out.println("What number do you want to search for? Input here: ");
    int searchVal = Integer.parseInt(in.nextLine());
    int result  = binaryMethod(arr, low, high, searchVal);
    if(result == -1){
      System.out.println("The value " + searchVal + " is not in the list");
    }
    else{
      System.out.println("The index of value " + searchVal + " is " + result);
    }


  }
}