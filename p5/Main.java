public class Main {
    public static void main(String[] args) {
        int input = 7;
        int mxW = input * 2 - 1;
        int mxH = input * 2 - 1;

        boolean printX = true;
        for (int i = 0; i < mxH; i++) {
            for (int j = 0; j < mxW; j++) {

                if (i < (input - 1)) {
                    if (j >= (input -1) && j < (mxW - (input - 1 - i))) {
                        System.out.print(printX ? "x " : "o ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (i == (input - 1)) {
                    System.out.print(printX ? "x " : "o ");
                } else {
                    if (j >= (i - (input - 1)) && j < input) {
                        System.out.print(printX ? "x " : "o ");
                    } else {
                        System.out.print("  ");
                    }
                }

                printX = !printX;
            }

            System.out.println();
        }
    }
}