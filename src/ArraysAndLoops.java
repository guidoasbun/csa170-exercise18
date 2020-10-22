public class ArraysAndLoops {
    public static void main(String[] args) {
        //1. Declare and init arr1, and arr2
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[9];

        //3. Use for loop to print arr1 separated by commas
        System.out.print("Array 1: ");
        for(int i = 0; i < arr1.length; i++){
            if(i > 0)
                System.out.print(",");
            System.out.print(arr1[i]);
        }

        //4. Use while loop to print arr2 separated by dashes
        System.out.print("\nArray 2: ");
        int index = 0;
        while(index < arr2.length){
            if(index > 0)
                System.out.print("-");
            System.out.print(arr2[index]);
            index++;
        }

        //5. Use for loop to copy arr1 to arr2 in reverse order
        int j = arr1.length-1;
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr1[j];
            j--;
        }

        //6. Use do/while loop to print arr1 separated by comma
        System.out.print("\nArray 1: ");
        int index2 = 0;
        do {
            if (index2 > 0)
                System.out.print(",");
            System.out.print(arr1[index2]);
            index2++;
        } while (index2 < arr1.length);

        //7. Use for loop to print arr2 separated by dashes
        System.out.print("\nArray 2: ");
        for(int i = 0; i < arr1.length; i++){
            if(i > 0)
                System.out.print(",");
            System.out.print(arr2[i]);
        }
    }
}
