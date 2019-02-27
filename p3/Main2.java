public class Main2 {
    public static void p1(int start, int end, int count, int current) {
        if (count > (end - start)) {
            return;
        }

        if (current > end) {
            current = start;
        }

        System.out.print(current);
        p1(start, end, count + 1, current + 1);
    }

    public static void p2(int start, int end, int current) {
        p1(start, end, 0, current);
        System.out.println();
        
        if (current > (end - start + 1)) {
            return;
        }

        p2(start, end, current + 1);
    }
    
    public static void main(String args[]) {
        int start = 2;
        int end = 7;

        p2(start, end, start);
    }
}
