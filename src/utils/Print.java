package utils;

public class Print {
  public static void breakLines(int n) {
    for (int i = 0; i < n; i++)
      System.out.println();
  }

  public static void divideLine(int length) {
    String str = "";
    for (int i = 0; i < length; i++)
      str += "=";

    System.out.println(str);
  }
}
