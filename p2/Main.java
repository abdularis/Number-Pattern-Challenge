public class Main {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);

        if (n >= 1 && n <= 26) {

            for (int i = n; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print((char) (65 + j));
                }

                System.out.println();
            }

        }
    }
}