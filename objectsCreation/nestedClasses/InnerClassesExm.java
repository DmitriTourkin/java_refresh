package objectsCreation.nestedClasses;

class DataStructure {
  private final static int SIZE = 15;
  private int[] arrayOfInts = new int[SIZE];

  public DataStructure() {
    for (int i = 0; i < SIZE; i++) {
      arrayOfInts[i] = i;
    }
  }

  interface DataStructureIterator extends java.util.Iterator<Integer> {}

  private class EvenIterator implements DataStructureIterator {
    private int nextIdx = 0;
    
    public boolean hasNext() {
      return (nextIdx <= SIZE - 1);
    }

    public Integer next() {
      Integer retValue = Integer.valueOf(arrayOfInts[nextIdx]);
      nextIdx += 2;
      return retValue;
    }
  }

  public void printEven() {
    DataStructureIterator iterator = this.new EvenIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next() + " ");
    }
    System.out.println(" ");
  }
}


// Main
public class InnerClassesExm {
  public static void main(String[] args) {
    DataStructure ds = new DataStructure();
    ds.printEven();
  }
}
