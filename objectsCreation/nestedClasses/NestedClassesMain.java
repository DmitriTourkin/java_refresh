package objectsCreation.nestedClasses;

// Types of Nested Classes.
class OuterClass {
  class InnerClass {
    // has access to all memebrs of OuterClass
    // Inner classes can be: local OR anonymous
  };

  static class StaticNestedClass {
    // does not.
  }
};


class OutClass2 {
  String outerField = "Outer field";
  static String saticOuterField = "Static outer field";

  class InnerClass {
      void accessMembers() {
        System.out.println(outerField);
        System.out.println(saticOuterField);
    }
  }

  static class StaticNestedClass {
    void accessMembers(OutClass2 outerClass) {
      // System.out.println(outerClass.outerField); Compiler Error since it cannot can non-static fields
      System.out.println(saticOuterField);
    }
  }
}


public class NestedClassesMain {
  public static void main(String... args) {
    System.out.println("INNER CLASS\n");
    OutClass2 outerObject = new OutClass2();
    OutClass2.InnerClass innerObject = outerObject.new InnerClass();
    innerObject.accessMembers();

    System.out.println("\nSTATIC NESTED CLASS\n");
    objectsCreation.nestedClasses.OutClass2.StaticNestedClass staticNestedObject = new objectsCreation.nestedClasses.OutClass2.StaticNestedClass();
    staticNestedObject.accessMembers(outerObject);
  }
}
