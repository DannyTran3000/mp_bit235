package components.caseStudies;

public class Box {
  int size = 1;

  public Box(int s) {
    this.setSize(s);
    this.draw();
  }

  private void setSize(int s) {
    this.size = s;
  }

  private String toString(int n) {
    return Integer.toString(n);
  }

  private void draw() {
    String horizonEdge = "";
    for (int i = 0; i < this.size; i++)
      horizonEdge += "-";

    System.out.println(horizonEdge);
    for (int i = 0; i < this.size; i++)
      System.out.printf("|%-" + this.size + "s|\n", "");
    System.out.println(horizonEdge);
  }
}
