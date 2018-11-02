public class Main {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);

        if (n >= 1 && n <= 1000) {

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                System.out.println();
            }

        }
    }
}