package objectsCreation;
public class ObjectDemoMain {
  public static void main(String... args) {
    Point originOne = new Point(0 ,0);
    Rectangle rectOne = new Rectangle(originOne, 100, 200);
    Rectangle rectTwo = new Rectangle(50, 100);

    Object[] elements = { originOne, rectOne, rectTwo };

    for (Object element : elements) {
      System.out.println(element);
    };
  }
}
