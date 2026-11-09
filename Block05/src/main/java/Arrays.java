import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Write a program that allocates array of 20 integers and initializes each element by its index multiplied by 5.
        // Print the obtained array on the console.

        int[] intArr = new int[20];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i * 5;
        }

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
//            intList.set(i, i * 5);
            intList.add(i * 5);
        }

        System.out.println(java.util.Arrays.toString(intArr));
        System.out.println(intList);
        System.out.println();

        // Read 5 integers from the console into an array and print them in reverse order.
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Reversed: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Find the sum of all elements in an integer array.
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

//        int number = intArr[19];
//
//        System.out.println(number);
    }
}