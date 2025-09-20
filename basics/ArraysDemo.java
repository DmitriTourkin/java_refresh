import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    int[] array;
    array = new int[8]; // new operator

    array[3] = 100;
    array[6] = 25;
    array[0] = 56;

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }


    // shorthand initialization
    String[] fruits = { "apple", "orange", "pineapple" }; 
    
    for (String fruit : fruits) {
      System.out.println((fruit));
    }

    // Arrays Loops and Different Types
    boolean[] flags = { true, false, true, false, false };
    char[] chars = { 'a', 'b', 'c', 'd', 'e' };
    double[] prices = { 9.56, 10.67, 0.99, 5.87};

    for (double price : prices) {
      System.out.println(price);
    }

    for (char ch : chars) {
      System.out.println(ch);
    }

    for (int i = 0; i < flags.length; i++) {
      System.out.println(flags[i]);
    }

    // In Java 2dimens arrays — is not a contagious zone of memory, it's array of references
    String[][] names = {
      {"Mr. ", "Mrs. ", "Ms. "},
      {"Smith", "Jones"},
    };

    System.out.println(names[0][0] + names[1][0]);
    System.out.println(names[0][2] + names[1][1]);

    copyingArrayInJava();

    // Array Manipulations — Array Class (sorting, searching, copying)
    int[] copyTo2 = Arrays.copyOfRange(array, 1, 3);
    for (int num : copyTo2) {
      System.out.println(num);
    }

    // Useful Array Class methods:
    // .equals()
    // .binarySearch()
    // .parallelSort() - concurrently / .sort() -- sequentially
    // .stream() — using array as a source of a stream
    Arrays.stream(copyTo2).map(num -> num + 2).forEach(System.out::println);
    Arrays.toString(names);
  }

  public static void copyingArrayInJava() {
    int[] copyFrom = { 1, 2, 3 };
    int[] copyTo = new int[2];

    System.arraycopy(copyFrom, 1, copyTo, 0, 2);
    for (int num : copyTo) {
      System.out.println(num);
    }
  }
}

