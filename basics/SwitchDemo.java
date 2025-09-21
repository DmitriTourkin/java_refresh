public class SwitchDemo {
  public static void main(String[] args) {
    int quarter = 3;

    String quarterLabel = 
    switch (quarter) {
      case 0 -> "Q1-Winter";
      case 1 -> "Q2-Spring";
      case 2 -> "Q3 - Summer";
      case 3 -> "Q3 - Summber";
      default -> "Unknown quarter";
    };

    System.out.println(quarterLabel);

    quarter = 0;

    quarterLabel =
    switch (quarter) {
      case 0 -> {
        System.out.println("Q1 - Winter");
        yield "Q1 - Winter";
      }
      default -> "Unknown quarter";
    };
  }
}
