package utils;

import java.util.Scanner;

public class Prompt {
  private static Scanner sc = new Scanner(System.in);

  public static String next(String prompt) {
    System.out.print(prompt);
    return sc.next();
  }

  public static String nextLine(String prompt) {
    System.out.print(prompt);
    return sc.nextLine();
  }

  public static int nextInt(String prompt) {
    System.out.print(prompt);
    return sc.nextInt();
  }

  public static float nextFloat(String prompt) {
    System.out.print(prompt);
    return sc.nextFloat();
  }

  public static double nextDouble(String prompt) {
    System.out.print(prompt);
    return sc.nextDouble();
  }

  public static void close() {
    sc.close();
  }
}
