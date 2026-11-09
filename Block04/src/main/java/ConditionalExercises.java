public class ConditionalExercises {
    public static void main(String[] args) {
        // Task 1: print the largest of three integers using nested if statements (no Math.max)
        int a = 12;
        int b = 45;
        int c = 27;
        int largest;

        if (a >= b) {
            if (a >= c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }
        System.out.println("Largest: " + largest);

        // Task 2: convert a score 0-100 to a grade with else-if
        int score = 85;

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Task 3: print even or odd using the ternary operator
        int number = 7;
        String parity = number % 2 == 0 ? "even" : "odd";
        System.out.println(number + " is " + parity);

        // Task 4: arrow switch - Weekend for days 6-7, Weekday for 1-5, Invalid day otherwise
        int day = 6;

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }

        // Task 5: compare an expected and an actual page title with equals()
        String expectedTitle = "Home Page";
        String actualTitle = "Home Page";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL - expected: " + expectedTitle + ", actual: " + actualTitle);
        }
    }
}
