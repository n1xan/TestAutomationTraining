public class ConditionalStatements {
    public static void main(String[] args) {
        // Task 1: exchange two integers if the first one is greater than the second one
        int a = 5;
        int b = 3;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("a = " + a + ", b = " + b);

        // Task 2: sign of the product of three real numbers without calculating it
        double x = 2.5;
        double y = -3.1;
        double z = 4.0;

        int negativeCount = 0;
        if (x < 0) {
            negativeCount++;
        }
        if (y < 0) {
            negativeCount++;
        }
        if (z < 0) {
            negativeCount++;
        }

        if (x == 0 || y == 0 || z == 0) {
            System.out.println("The product is 0");
        } else if (negativeCount % 2 == 0) {
            System.out.println("The product is positive (+)");
        } else {
            System.out.println("The product is negative (-)");
        }
    }
}
