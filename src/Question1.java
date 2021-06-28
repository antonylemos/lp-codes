import java.util.Scanner;

public class Question1 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String []valuesArray = args;

    int size = valuesArray.length;
    double totalSum = 0;

    for(int count = 0; count < size; count++){
      totalSum += Double.parseDouble(valuesArray[count]);
    }

    double media = totalSum / size;
    totalSum = 0;

    for (String arrayValue : valuesArray) {
      double parsedValue = Double.parseDouble(arrayValue);
      totalSum += (parsedValue - media) * (parsedValue - media);
    }

    double standardDeviation = Math.sqrt(totalSum / size);

    System.out.printf("Média: %.4f / Desvio Padrão: %.4f", media, standardDeviation);
    input.close();
  }
}
