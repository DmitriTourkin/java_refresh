public class Operators {
  public static void main(String[] args) {
    int result;
    result = +1; // 1
    System.out.println(result);
    
    
    result = -1; // -1
    System.out.println(result);
    
    result++;
    System.out.println(result); //  0

    result--;
    System.out.println(result); //  -1

    result = -result; // 1
    System.out.println(result);

    ++result;
    System.out.println(result); // 2

    result++;
    System.out.println(result); //3

    --result;
    System.out.println(result); // 2

    boolean success = false;
    System.out.println(success); // false
    System.out.println(!success); // true

    int value1 = 1;
    int value2 = 2;
    if (value1 == 1 && value2 == 2) {
      System.out.println("value1 is 1 AND value2 is 2");
    }

    int num256 = 0b1111111;
    int currentValue = ~num256;
    System.out.println("currentValue: " + Integer.toBinaryString(currentValue));

  }
}
