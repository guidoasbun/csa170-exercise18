import java.util.Scanner;

public class ArrayRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //inits all variables
        //assigns arrayLength to user input
        System.out.print("How many integers will you enter? ");
        int min, max, range, arrayLength = in.nextInt();
        int[] array = new int[arrayLength];

        //fills in the array with user input
        System.out.print("Enter " + arrayLength + " integers: ");
        for (int i = 0; i < arrayLength; i++){
            array[i] = in.nextInt();
        }

        //assigns starting values after array was set
        min = array[0];
        max = array[0];

        //Displays the array
        //assigns the min and max value
        System.out.print("You entered: ");
        for (int i = 0; i < arrayLength; i++){
            System.out.print(array[i]);
            System.out.print(" ");

            if (min > array[i]){
                min = array[i];
            }

            if (max < array[i] ){
                max = array[i];
            }
        }
        //calculates the range after final values for min and max are assigned
        range = max - min;

        //prints out remaining data
        System.out.println();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Range: " + range);
    }
}
