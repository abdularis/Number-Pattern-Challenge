public class Main {
    public static void main(String args[]) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        for (int i = 0; i <= (end - start); i++) {
            for (int j = 0; j <= (end - start); j++) {
                System.out.print((i + j) % (end - start + 1) + start);
            }
            System.out.println();
        }
    }
}