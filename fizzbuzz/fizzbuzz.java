import java.util.Scanner;

class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int[] numbers = new int[inputArr.length];  // Create an array of integers

        for (int i = 0; i < inputArr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);  // Convert each string to an integer
        }

        int x = numbers[0];
        int y = numbers[1];
        int n = numbers[2];

        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0) {
                System.out.println("FizzBuzz");
            } else if (i % x == 0) {
                System.out.println("Fizz");

            } else if (i % y == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}