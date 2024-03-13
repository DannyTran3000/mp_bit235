package utils;

import java.util.Scanner;

public class Prompt {
  private static Scanner sc = new Scanner(System.in);

  private static void printPromptMessage(String msg, int breakLines) {
    if (msg.length() <= 0)
      return;

    if (breakLines < 0)
      System.out.print(msg);
    else {
      System.out.println(msg);
      if (breakLines > 0)
        Print.breakLines(breakLines);
    }

  }

  public static String next(String prompt) {
    printPromptMessage(prompt, -1);
    return sc.next();
  }

  public static String next(String prompt, int breakLines) {
    printPromptMessage(prompt, breakLines);
    return sc.next();
  }

  public static String nextLine(String prompt) {
    printPromptMessage(prompt, -1);
    return sc.nextLine();
  }

  public static String nextLine(String prompt, int breakLines) {
    printPromptMessage(prompt, breakLines);
    return sc.nextLine();
  }

  public static int nextInt(String prompt) {
    printPromptMessage(prompt, -1);
    return sc.nextInt();
  }

  public static int nextInt(String prompt, int breakLines) {
    printPromptMessage(prompt, breakLines);
    return sc.nextInt();
  }

  public static float nextFloat(String prompt) {
    printPromptMessage(prompt, -1);
    return sc.nextFloat();
  }

  public static float nextFloat(String prompt, int breakLines) {
    printPromptMessage(prompt, breakLines);
    return sc.nextFloat();
  }

  public static double nextDouble(String prompt) {
    printPromptMessage(prompt, -1);
    return sc.nextDouble();
  }

  public static double nextDouble(String prompt, int breakLines) {
    printPromptMessage(prompt, breakLines);
    return sc.nextDouble();
  }

  public static void close() {
    sc.close();
  }
}
