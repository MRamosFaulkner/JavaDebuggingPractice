import java.util.Scanner;

public class Main {

    /**
     * Method that calculates the average of an array of integers
     */
    public static double averageOfNumbers(int [] numbers) {

        //Check array to make sure it is not empty
        //To correct null pointer use null here to correct line 43
        if (numbers == null) {
            throw new IllegalArgumentException();
        }

        if (numbers.length == 0) {
            throw new IllegalArgumentException();
        }
        //For the out of bounds exception an empty array is created
        //int[] number = new int[0] which will break on line 25
        //To correct it we need to make sure there is at least one element in the method

        //Adds array and then divides the numbers to get average
        int sum = 0;

        //Here we introduce the logic error by adding 5 to the sum of the numbers
        //sum += number + 5, and when ran the output will not be correct this happens on line 29
        //this is where we can set the breakpoint by removing the '+ 5'
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int[] numbers = {1, 2, 3, 4, 5}
        //Passing null
        int [] numbers = null;
        System.out.println("Please enter five integers: ");
        for(int i = 0; i < 5; i++){
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        //breakpoint - use the step into method for debugging
        double average = averageOfNumbers(numbers);

        System.out.println("Average of numbers: " + average);

    }
}