public class LoopExercises {
    public static void main(String[] args) {
        // Task 1: multiplication table from 1 x 1 to 10 x 10 with nested for loops
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Task 2: read numbers with a do-while loop until the user enters 0, then print their count and sum
        // The array simulates what the user types
        int[] userInput = {4, 7, -2, 10, 0};
        int index = 0;
        int count = 0;
        int sum = 0;
        int number;

        do {
            number = userInput[index];
            index++;
            if (number != 0) {
                count++;
                sum += number;
            }
        } while (number != 0);
        System.out.println("Count: " + count + ", Sum: " + sum);
        System.out.println();

        // Task 3: check if a number n is prime, use break when a divisor is found
        int n = 29;
        boolean isPrime = n > 1;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
        System.out.println();

        // Task 4a: even numbers from 1 to 50 with a while loop
        int k = 1;
        while (k <= 50) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k++;
        }
        System.out.println();

        // Task 4b: even numbers from 1 to 50 with a for loop and continue
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Task 5: simulate a retry - the check passes on attempt 3, try up to 5 times
        int maxAttempts = 5;
        int passingAttempt = 3;
        boolean passed = false;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": ");
            if (attempt == passingAttempt) {
                System.out.println("passed");
                passed = true;
                break;
            }
            System.out.println("failed");
        }
        if (!passed) {
            System.out.println("All " + maxAttempts + " attempts failed");
        }
    }
}
