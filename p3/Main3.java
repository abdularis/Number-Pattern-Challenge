public class Main3 {
  
  public static void p(int start, int end, int num, int count, int currRow) {
    if (count > (end - start)) {
      System.out.println();
      currRow++;
      count = 0;
      num = start + currRow;
    }

    if (currRow > (end - start)) {
      return;
    }

    if (num > end) {
      num = start;
    }

    System.out.print(num);
    p(start, end, num + 1, count + 1, currRow);
  }
  
  public static void main(String args[]) {
    int start = 2;
    int end = 7;
    p(start, end, start, 0, 0);
  }
}
