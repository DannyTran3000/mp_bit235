package components.workshops;

import components.caseStudies.PictureFrame;
import utils.Constant;
import utils.Print;
import utils.Prompt;

public class Week_3 {
  public Week_3() {
    // this.doExercise1();
    // Print.breakLines(2);

    // this.doExercise2();
    // Print.breakLines(2);

    // this.doExercise3();
    // Print.breakLines(2);

    // this.doExercise4a();
    // Print.breakLines(2);

    // this.doExercise4b();
    // Print.breakLines(2);

    // this.doExercise5();
    // Print.breakLines(2);

    // this.doExercise6();
    // Print.breakLines(2);

    this.doExercise7();
    Print.breakLines(2);
  }

  // Exercise 1
  private void doExercise1() {
    System.out.println("Exercise 1:");
    Print.breakLines(1);

    // 1a
    System.out.println("a. \"Good day\" or \"Good evening\"");

    int n = Prompt.nextIntInRange("Enter a number [1, 24]: ", 1, 24);

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
    System.out.println("Exercise 2: Print the smallest number(s).");
    Print.breakLines(1);

    final int intNumber = 3;
    int min = 0;
    int[] numArr = new int[intNumber];
    for (int i = 0; i < intNumber; i++) {
      numArr[i] = Prompt.nextInt(i > 0 ? "" : "Enter " + intNumber + " numbers:", 0);

      // assign first number
      // or the smaller one between min and the input number
      // as the new value of min
      if (i == 0 || numArr[i] < min)
        min = numArr[i];
    }

    int count = 0;
    for (int i = 0; i < intNumber; i++) {
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

  // Exercise 3
  private void doExercise3() {
    System.out.println("Exercise 3: Print a letter from a number.");
    Print.breakLines(1);

    final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final int startingIndex = 10;
    // Validate the input integer
    // If the integer is invalid, reentering another integer
    int n = Prompt.nextIntInRange(
        "Warning: Invalid number! Please enter an integer in [0, 35].",
        0,
        35);

    if (n <= startingIndex - 1) {
      System.out.println(n);
      return;
    }

    int findIndex = n - startingIndex;
    System.out.println(letters.charAt(findIndex));
  }

  // Exercise 4a
  private void doExercise4a() {
    final int intNumber = 100;

    System.out.println("Exercise 4a: The sum of the squares of the first " + intNumber + " integers.");
    Print.breakLines(1);

    int sum = 0;
    for (int i = 0; i < intNumber; i++)
      sum += Math.pow(i, 2);

    System.out.println(sum);
  }

  // Exercise 4b
  private void doExercise4b() {
    final int start = 1, end = 100;

    System.out.println("Exercise 4b: All perfect square integers between " + start + " and " + end + ".");
    Print.breakLines(1);

    String perfectSquaresStr = "";
    int perfectSquareCount = 0;
    for (int i = start; i <= end; i++) {
      double sqrt = Math.sqrt(i);

      if (i % sqrt != 0)
        continue;

      // add a comma between 2 numbers
      if (perfectSquareCount > 0)
        perfectSquaresStr += ", ";

      perfectSquaresStr += i;

      perfectSquareCount++;
    }

    System.out.println(perfectSquaresStr);
  }

  // Exercise 5
  private void doExercise5() {
    System.out.println("Exercise 5: Odd or even");
    Print.breakLines(1);

    int n = Prompt.nextInt("Enter an integer: ");
    boolean isEven = n % 2 == 0;

    System.out.println(n + " is " + (isEven ? "even" : "odd"));
  }

  // Exercise 6
  private void doExercise6() {
    System.out.println("Exercise 6: Picture framing store");
    Print.breakLines(1);

    double length = Prompt.nextDouble("1a. Enter the length of the picture (inch): ");
    double width = Prompt.nextDouble("1b. Enter the width of the picture (inch): ");

    Print.breakLines(1);

    final String[] typeOptions = { "regular", "fancy" };
    String type = Prompt.nextOption(
        "2. Choose one of the frame types (regular/fancy): ",
        typeOptions);

    Print.breakLines(1);

    String shouldHaveColor = Prompt.nextOption(
        "3. Do you want to change the frame color <white by default> (y/n)? ",
        Constant.binaryOpts);

    String color = "white";
    if (shouldHaveColor.equals("y"))
      color = Prompt.next("----- Enter the frame color: ");

    Print.breakLines(1);

    String shouldHaveCrowns = Prompt.nextOption(
        "4. Do you want to add some crowns (y/n)? ",
        Constant.binaryOpts);

    int crownNumber = 0;
    if (shouldHaveCrowns.equals("y"))
      crownNumber = Prompt.nextInt("----- Enter the number of crowns: ");

    Print.breakLines(1);

    PictureFrame frame = new PictureFrame(type, color, crownNumber, length, width);
    double totalCost = frame.calculateCost();

    System.out.println("====> The total cost of framing the picture is: $" + totalCost);
  }

  // Exercise 7
  private void doExercise7() {
    System.out.println("Exercise 7:");
    Print.breakLines(1);

    // 7a
    System.out.println("a. Enter 2 integers which the first one is less than the second one.");

    int firstNum, secondNum;
    boolean shouldLoop = true;
    do {
      firstNum = Prompt.nextInt("The first integer: ");
      secondNum = Prompt.nextInt("The second integer: ");

      if (firstNum >= secondNum)
        System.out.println("Warning: The first integer must be less than the second one!");
      else
        shouldLoop = false;
    } while (shouldLoop);

    Print.breakLines(2);

    // 7b
    System.out.println("b. All the odd numbers in [" + firstNum + ", " + secondNum + "]:");

    int oddCount = 0;
    String oddStr = "";
    int evenSum = 0, oddSum = 0;
    for (int i = firstNum; i <= secondNum; i++) {
      if (i % 2 != 1) {
        evenSum += i; // for 7c calculation
        continue;
      }

      // print a comma between 2 numbers
      if (oddCount > 0)
        oddStr += ", ";

      oddCount++;
      oddStr += i;
      oddSum += i; // for 7e calculation
    }

    System.out.println(oddStr);

    Print.breakLines(2);

    // 7c
    System.out.println("c. The sum of all the even numbers in [" + firstNum + ", " + secondNum + "]:");
    System.out.println(evenSum); // evenSum is calculated in the for loop at 7b

    Print.breakLines(2);

    // 7d
    final int start = 1, end = 10;
    System.out.println("d. All the odd numbers and their squares in [" + start + ", " + end + "]:");

    System.out.printf("%-27s\n", "---------------------------");
    System.out.printf("| %-10s | %-10s |\n", "Number", "Square");
    System.out.printf("%-27s\n", "---------------------------");

    for (int i = 1; i <= 10; i++)
      System.out.printf("| %-10d | %-10.0f |\n", i, Math.pow(i, 2));

    System.out.printf("%-27s\n", "---------------------------");

    Print.breakLines(2);

    // 7e
    System.out.println("e. The sum of all the odd numbers in [" + firstNum + ", " + secondNum + "]:");
    System.out.println(oddSum); // oddSum is calculated in the for loop at 7b

    Print.breakLines(2);

    // 7f
    System.out.println("f. All the uppercase letters.");

    for (char c = 'A'; c <= 'Z'; c++)
      System.out.print(c);
  }
}
