package objectsCreation;

// enum — класс с перечисление инстансов класса. Можно добавлять атрибуты к ним

enum DaysOfWeek {
  MONDAY("MON") {
    void doSomething() {
      System.out.println("Monday instance implementing the abstract method");
    }
  };
  //TUESDAY("TUE"),
  //WEDNESDAY("WED"), 
  //THURSDAY("THUR"),
  //FRIDAY("FRI"), 
  //SATURDAY("SAT"), 
  //SUNDAY("SUN");

  private final String abbreviation; 

  DaysOfWeek(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  abstract void doSomething();
}

public class EnumsDemo {
  public static void main(String[] args) {
    // Special methods
    String day = DaysOfWeek.MONDAY.name();
    int dayNum = DaysOfWeek.FRIDAY.ordinal(); // 4, because Monday = 0;

    System.out.println(day + " " + dayNum);
    DaysOfWeek dayFromString = DaysOfWeek.valueOf(day);
    DaysOfWeek dayFromNum = DaysOfWeek.
  }
}
