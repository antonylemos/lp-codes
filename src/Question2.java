import java.util.Scanner;

public class Question2 {
  public static int getMedia(int array[], int position) {
    if(position == 0) {
      return 0;
    } else if(position == array.length) {
      return (array[position-1] + getMedia(array,position - 1)) / array.length;
    } else {
      return array[position - 1] + getMedia(array,position - 1);
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Insira o tamanho do vetor: ");
    int size = input.nextInt();

    int [] valuesArray = new int[size];

    for(int count = 0; count < valuesArray.length; count++){
      System.out.print("Insira o valor: ");
      int value = input.nextInt();
      valuesArray[count] = value;
    }

    input.close();
    System.out.println("O valor da média é: " + getMedia(valuesArray, size));
  }
}

