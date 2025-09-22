package objectsCreation.nestedClasses;

import java.net.Socket;

public class AnonymMain {
  public interface HelloWorld {
    public void greet();
    public void greetSomeone(String someone);
  }

  public void sayHello() {
    
    class EnglishGreeting implements HelloWorld {
      String name = "world";
      public void greet() {
        greetSomeone("world");
      }
      public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hello, " + name);
      }
    }

    HelloWorld englishGreeting = new EnglishGreeting();
    // Anonymous Class
    HelloWorld frenchGreeting = new HelloWorld() {
      String name = "tout le monde";
      public void greet() {
        greetSomeone("tout le monde");
      }

      public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Salut, " + name);
      };
    };

    englishGreeting.greet();
    frenchGreeting.greetSomeone("Dima");
  }
  public static void main(String[] args) {
    AnonymMain myApp = new AnonymMain();
    myApp.sayHello();
  }
}
