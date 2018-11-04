public class Main {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);

        if (n >= 1 && n <= 26) {

            int start = 65 + n - 1;
            for (int i = n; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print((char) (start - j));
                }
                System.out.println();
            }

        }
    }
}