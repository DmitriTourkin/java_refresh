import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class VarKeyword {
  public static void main(String[] args) {
    // var — only for local variables
    // var CANNOT be used for fields, nor for method or constructor params.
    
    var list = List.of("one", "two", "three");
    for (var element : list) {
      System.out.println(element);
    }

    var path = Path.of("debug.log");
    try (var stream = Files.newInputStream(path)) {
      System.out.println("file processing");
    } catch (Exception e) {
      System.out.println("Поймано исключение");
    }
  }
}
