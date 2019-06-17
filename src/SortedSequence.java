import java.util.Arrays;
import java.util.Random;

public class SortedSequence {
  /**
      Makes an array with n random values between 0-99.
      @param n the number of tosses to simulate
      @return an array with n random die tosses in it
   */
   public int[] generateRandom(int n) {
      int[] myArray = new int[n];
      Random r = new Random();
      for (int i = 0; i < n; i++) {
        myArray[i] = r.nextInt(100);
      }
      return myArray;
   }

   /**
      Prints an array.
      @param values the array to print
   */
   public void printArray(int[] values) {
       for (int i = 0; i < values.length; i++) {
         System.out.print(values[i] + " ");
       }
       System.out.println("");
   }

   public static void main(String[] args) {
       SortedSequence mySequence = new SortedSequence();
       int[] myArray = mySequence.generateRandom(20);
       mySequence.printArray(myArray);
       Arrays.sort(myArray);
       mySequence.printArray(myArray);
   }
}
