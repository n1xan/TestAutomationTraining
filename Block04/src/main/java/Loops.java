public class Loops {
    public static void main(String[] args) {
        // Task 1: print all the numbers from 1 to 30
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 2: print all the numbers from 1 to 30, skipping the numbers divisible by both 3 and 7
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
