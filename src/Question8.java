import java.io.File;

public class Question8 {
  public static int countFiles = 0;

  public static int findFile(File pathname, String filename) {
    File[] filesList = pathname.listFiles();

    for (File file : filesList) {
      if (file.isDirectory()) {
        findFile(file, filename);
      } else if (file.isFile() && file.getName().equals(filename)) {
        countFiles++;
      }
    }

    return countFiles;
  }

  public static void main(String[] args) {
    File pathname = new File(args[0]);
    String filename = args[1];

    int foundFiles = findFile(pathname, filename);

    System.out.println("Arquivos encontrados: " + foundFiles);
  }
}
