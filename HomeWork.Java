import java.util.Scanner;

import java.util.Random;

public class HomeWork {

  public static void main(String [] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print(“Enter the size of the array:”);

    int size = scanner.nextInt();

    System.out.print(“Enter first number of the data set’s range:”);

    int r1 = scanner.nextInt();

    System.out.print(“Enter second number of the data set’s range:”);

    int r2 = scanner.nextInt();

    int [] range = {r1,r2};

    int [] returnedArray = randomArray(size,range);
    System.out.println(“Here is your generated array:”);

      for (int i=0;i<returnedArray.length;i++){

      System.out.print(returnedArray[i]+”\t”);

        if((i+1)%8==0){
        System.out.println();
        }
      }

    System.out.println();

    double[] analysisValues = analyzeArray(returnedArray);

    System.out.println(“*******DATA SET ANALYSIS*******”);

    System.out.printf(“Maximum Element: %.0f\n”, analysisValues[0]);

    System.out.printf(“Minimum Element: %.0f\n”, analysisValues[1]);

    System.out.printf(“Average Value %.2f\n”, analysisValues[2]);

  }

  public static int [] randomArray(int size, int [] range) {

    int r1 = range[0];
    int r2 = range[1];

    int[] genArray = new int[size];
    Random rnd = new Random();

      for(int i=0;i<genArray.length;i++){
      genArray[i] = rnd.nextInt(r1,r2+1);

      }
      return genArray;
    }

  public static double[] analyzeArray(int [] array){

    int min = array[0];
    int max = array[0];
    int sum = 0;

      for(int i=0;i<array.length;i++){

        sum += array[i];
          if( array[i] > max){
          max = array[i];
          }
            if( array[i] < min){
            min = array[i];
            }
          }

      double average = (double)sum/array.length;
      double values = new double[3];
      values[0] = max;
      values[1] = min;
      values[2] = average;
      return values;
    }
}
