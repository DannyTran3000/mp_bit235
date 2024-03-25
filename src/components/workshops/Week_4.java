package components.workshops;

import components.caseStudies.Box;
import utils.Print;
import utils.Prompt;
import utils.Sort;

public class Week_4 {
  private final String[] songs = {
      "Bohemian Rhapsody",
      "Hotel California",
      "Stairway to Heaven",
      "Imagine",
      "Like a Rolling Stone",
      "Hey Jude",
      "Smells Like Teen Spirit",
      "Yesterday",
      "Thriller",
      "Billie Jean",
  };
  private final String[] artists = {
      "Queen",
      "Eagles",
      "Led Zeppelin",
      "John Lennon",
      "Bob Dylan",
      "The Beatles",
      "Nirvana",
      "The Beatles",
      "Michael Jackson",
      "Michael Jackson",
  };

  public Week_4() {
    this.doExercise1();
    Print.breakLines(2);

    this.doExercise2();
    Print.breakLines(2);

    this.doExercise3();
    Print.breakLines(2);

    this.doExercise4();
    Print.breakLines(2);

    this.doExercise5();
    Print.breakLines(2);

    this.doExercise7();
  }

  // Exercise 1
  private void doExercise1() {
    System.out.println("Exercise 1: Print the songs and their artists.");
    Print.breakLines(1);

    System.out.printf("%-54s\n", "-----------------------------------------------------------------");
    System.out.printf("| %-5s | %-30s | %-20s |\n", "#", "Song", "Artist");
    System.out.printf("%-54s\n", "-----------------------------------------------------------------");

    for (int i = 0; i < Math.max(this.songs.length, this.artists.length); i++)
      System.out.printf(
          "| %-5s | %-30s | %-20s |\n",
          i + 1,
          i < this.songs.length ? songs[i] : "",
          i < this.artists.length ? artists[i] : "");

    System.out.printf("%-54s\n", "-----------------------------------------------------------------");
  }

  // Exercise 2
  private void doExercise2() {
    System.out.println("Exercise 2: Sort the songs by their names in alphabet order using bubble sort.");
    Print.breakLines(1);

    String[] sortedArr = Sort.bubbleSort(this.songs);

    System.out.printf("%-54s\n", "------------------------------------------");
    System.out.printf("| %-5s | %-30s |\n", "#", "Song");
    System.out.printf("%-54s\n", "------------------------------------------");

    for (int i = 0; i < sortedArr.length; i++)
      System.out.printf(
          "| %-5s | %-30s |\n",
          i + 1,
          sortedArr[i]);

    System.out.printf("%-54s\n", "------------------------------------------");
  }

  // Exercise 3
  private void doExercise3() {
    System.out.println("Exercise 3: Invert the letters from the text.");
    Print.breakLines(1);

    // Consumes the dangling newline character
    // Ignore it as it does not relate to the program
    Prompt.consumeDangling(); // DO NOT delete this line.
    // ==================================================

    String text = Prompt.nextLine("Enter a text: ");

    String invertedText = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      invertedText += text.charAt(i);
    }

    System.out.println(invertedText);
  }

  // Exercise 4
  private void doExercise4() {
    final String alphabetStr = "abcdefghijklmnopqrstuvwxyz";
    final String codeStr = "crgzavibsdoeqfhujxklwmynpt";

    System.out.println("Exercise 4: Decode message.");
    Print.breakLines(1);

    String msg = Prompt.nextLine("Enter your message: ");
    String[] splitArr = msg.split("");

    String decodeStr = "";
    for (int i = 0; i < splitArr.length; i++) {
      String c = splitArr[i];
      boolean isUpperCase = Character.isUpperCase(c.charAt(0));
      String lowercaseChar = c.toLowerCase();

      if (!alphabetStr.contains(lowercaseChar)) {
        decodeStr += c;
        continue;
      }

      int findIndex = alphabetStr.indexOf(lowercaseChar);

      // keep the original letter if it is not in the code string
      if (findIndex > codeStr.length() - 1)
        decodeStr += c;
      else {
        char codeChar = isUpperCase
            ? Character.toUpperCase(codeStr.charAt(findIndex))
            : codeStr.charAt(findIndex);
        decodeStr += codeChar;
      }
    }

    System.out.println(decodeStr);
  }

  // Exercise 5
  private void doExercise5() {
    final String[] p = {
        "Lose all the weight you want.",
        "I can't I must work",
        "That would be like a keyword search.",
        "This would be Victoria.",
        "Join the party.",
        "To be or not to be.",
        "That is a question to test keyword search.",
        "Can you find a needle in a hay stack?",
        "This could be the last paragraph, but its not.",
        "Ada Lovelace is the worlds first programmer as of 1860.",
    };

    System.out.println("Exercise 5: Search engine");
    Print.breakLines(1);

    String msg = Prompt.nextLine("Enter your keyword: ");
    String lowerCaseMsg = msg.toLowerCase();

    String[] resArr = new String[p.length];
    int count = 0;
    for (int i = 0; i < p.length; i++) {
      if (p[i].toLowerCase().contains(lowerCaseMsg)) {
        resArr[count] = p[i];
        count++;
      }
    }

    if (count > 0) {
      Print.breakLines(1);
      System.out.println(count + (count > 1 ? " results" : " result"));
      Print.breakLines(1);
      for (int i = 0; i < count; i++)
        System.out.println("----- " + (i + 1) + ". " + resArr[i]);
    } else
      System.out.println("Result not found!!!");
  }

  // Exercise 7
  private void doExercise7() {
    System.out.println("Exercise 7: Draw the box");
    Print.breakLines(1);

    int size = Prompt.nextIntInRange("Enter the size of the box [1, 10]: ", 1, 10);
    new Box(size);
  }
}
