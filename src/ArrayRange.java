import java.util.Scanner;

public class ArrayRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many integers will you enter? ");
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        int min = 0;
        int max = 0;
        int range = 0;

        System.out.print("Enter " + arrayLength + " integers: ");
        for (int i = 0; i < arrayLength; i++){
            array[i] = in.nextInt();
        }

        System.out.print("You entered: ");
        for (int i = 0; i < arrayLength; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }

    }
}
