import java.util.Scanner;

public class Question4 {
  private static double calculateEquation(double[] arrayValues, int position, double leftSum, double rightSum) {
    if (position == arrayValues.length) {
      return Math.sqrt(leftSum / arrayValues.length - Math.pow(rightSum / arrayValues.length, 2));
    } else {
      return calculateEquation(arrayValues, position + 1, leftSum + Math.pow(arrayValues[position], 2), rightSum + arrayValues[position]);
    }
  }

  public static double calculateEquation(double[] arrayValues) {
    return calculateEquation(arrayValues, 0, 0, 0);
  }

  public static void main(String[] args) {
    int size = args.length;
    double[] arrayValues = new double[size];

    for(int count = 0; count < size; count++){
      arrayValues[count] = Double.parseDouble(args[count]);
    }

    double equationResult = calculateEquation(arrayValues);

    System.out.println("Total: " + equationResult);
  }
}
