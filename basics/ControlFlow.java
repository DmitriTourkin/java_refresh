import javax.swing.text.StyledEditorKit;

public class ControlFlow {
  public static void main(String[] args) {
    switchCaseFlow();
    
    int[][] arrayOfInts = {
      {32, 87, 3, 589},
      {12, 1076, 2000, 8},
      {622, 127, 77, 955}
    };

    int searchFor = 12;

    int i;
    int j = 0;
    boolean foundIt = false;

    search:
      for (i = 0; i < arrayOfInts.length; i++) {
        for (j = 0; j < arrayOfInts[i].length; j++) {
          if (arrayOfInts[i][j] == searchFor) {
            foundIt = true;
            break search;
          }
        }
      }

      if (foundIt) {
        System.out.println("Found " + searchFor + " at [" + i + ", " + j+ "]");
      } else {
        System.out.println(searchFor + " not in the array");
      }
  }

  public static void continueLoopUnlabeled() {
    String searchMe = "piter piper packed a packer for peppa's piter";
    String substring = "pe";
    boolean foundIt = false;

    int max = searchMe.length() - substring.length();

    test: 
      for (int i = 0; i <= max; i++) {
        int n = substring.length();
        int j = i;
        int k = 0;
        while (n-- != 0) { // Выполнится ровно n раз!
          //n-- != 0 - это идиоматический способ сказать: "Выполни этот цикл ровно столько раз, какое значение было у n в начале, и при этом постепенно уменьшай n"
          if (searchMe.charAt(j++) != substring.charAt(k++)) {
            continue test;
          }
        }
        foundIt = true;
        break test;
      }
    System.out.println(foundIt ? "Found it" : "Didn't find it");
  }

  public static void switchCaseFlow() {
    System.out.println("Switch Case Flow \n");
    int state = 5;
    switch (state) {
      case 1: {
        int a = 5;
        break;
      }
      case 2: {
        System.out.println("case 2");
        break;
      }
      case 5: {
        System.out.println("case 5");
        break;
      }

      default: {
        System.out.println("defult state");
      }
    }
  }
}
