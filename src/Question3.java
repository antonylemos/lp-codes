import java.util.Scanner;
import Class.Media;

public class Question3 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int size = input.nextInt();

    Media media = new Media(size);

    for(int count = 0; count < size; count++) {
      int value = input.nextInt();
      media.addValue(value, count);
    }

    System.out.println("O valor da média é: "+ media.getMedia(media.array, size));
    input.close();
  }
}
