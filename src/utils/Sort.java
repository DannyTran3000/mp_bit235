package utils;

public class Sort {
  public static String[] bubbleSort(String[] arr) {
    int n = arr.length;
    boolean swapped;
    String[] sortedArr = arr;

    do {
      swapped = false;
      for (int i = 0; i < n - 1; i++) {
        if (sortedArr[i].compareTo(sortedArr[i + 1]) <= 0)
          continue;
        // Swap elements
        String temp = sortedArr[i];
        sortedArr[i] = sortedArr[i + 1];
        sortedArr[i + 1] = temp;
        swapped = true;
      }
      n--;
    } while (swapped);

    return sortedArr;
  }
}
