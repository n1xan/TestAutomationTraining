public class Samples {
    public static void main(String[] args) {
        //Write a program that reads a day number (1–7)
        // and prints the name of the day using a switch statement.
        // For any other number, print “Invalid day”.

        int dayNum = 4; // 1 to 7

        switch (dayNum) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

