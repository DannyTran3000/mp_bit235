package components.workshops;

import utils.Print;
import utils.Prompt;

public class Week3 {
  public Week3() {
    // this.doExercise1();
    // Print.breakLines(2);

    this.doExercise2();
    Print.breakLines(2);
  }

  // Exercise 1
  private void doExercise1() {
    System.out.println("Exercise 1:");
    Print.breakLines(1);

    // 1a
    System.out.println("a. \"Good day\" or \"Good evening\"");

    // Validate the input integer
    // If the integer is invalid, reentering another integer
    int n = 0;
    boolean isFirstLoop = true;
    do {
      n = Prompt.nextInt("Enter a number [1, 24]: ");

      if ((n < 1 || n > 24) && !isFirstLoop)
        System.out.println("Warning: Invalid number! Please enter an integer in [1, 24].");

      if (isFirstLoop)
        isFirstLoop = false;
    } while (n < 1 || n > 24);

    System.out.println(n < 18 ? "Good day" : "Good evening");

    Print.breakLines(2);

    // 1b
    System.out.print("b. The loop of multiples of 5 in [10, 95]: ");

    String loopString = "";
    int gap = 10;
    while (gap <= 95) {
      // print a comma between 2 numbers
      if (gap > 10)
        loopString += ", ";

      loopString += gap;
      gap += 5;
    }
    System.out.println(loopString);

    Print.breakLines(2);

    // 1c
    System.out.print("c. The sum of integers in [1, 10]: ");

    int sum = 0;
    for (int i = 1; i <= 10; i++)
      sum += i;

    System.out.println(sum);
  }

  // Exercise 2
  private void doExercise2() {
    System.out.println("Exercise 2: Print the smallest number(s)");
    Print.breakLines(1);

    final int numberAmount = 3;
    int min = 0;
    int[] numArr = new int[numberAmount];
    for (int i = 0; i < numberAmount; i++) {
      numArr[i] = Prompt.nextInt(i > 0 ? "" : "Enter " + numberAmount + " numbers:", 0);

      // assign first number
      // or the smaller one between min and the input number
      // as the new value of min
      if (i == 0 || numArr[i] < min)
        min = numArr[i];
    }

    int count = 0;
    for (int i = 0; i < numberAmount; i++) {
      // print the smallest numbers only
      if (numArr[i] > min)
        continue;

      // print a comma between 2 numbers
      if (count > 0)
        System.out.print(", ");

      count++;

      System.out.print(numArr[i]);
    }
  }
}
