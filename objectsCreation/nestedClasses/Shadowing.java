package objectsCreation.nestedClasses;

class ShadowTest {
  public int x = 0;
  
  class FirstLevel {
    public int x = 1;
    
    void methodInFirstLever(int x) {
      System.out.println("x = " + x);
      System.out.println("this.x = " + this.x);
      System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
    }
  }
}

public class Shadowing {
  public static void main(String[] args) {
    ShadowTest st = new ShadowTest();
    ShadowTest.FirstLevel fl = st.new FirstLevel();
    fl.methodInFirstLever(23);
  }
}
