

public class ArraysAndLoops {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[9];
        int index = 0;

        System.out.print("Array 1: ");
        for(int i = 0; i < arr1.length; i++){
            if(i > 0)
                System.out.print(",");
            System.out.print(arr1[i]);
        }
        System.out.println();

        System.out.print("Array 2: ");
        while(index < arr2.length){
            if(index > 0)
                System.out.print("-");
            System.out.print(arr2[index]);
            index++;
        }
        System.out.println();

        int j = arr1.length-1;
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr1[j];
            j--;
        }

        System.out.print("Array 1: ");
        int index2 = 0;
        do {
            if (index2 > 0)
                System.out.print(",");
            System.out.print(arr1[index2]);
            index2++;
        } while (index2 < arr1.length);
        System.out.println();

        System.out.print("Array 2: ");
        for(int i = 0; i < arr1.length; i++){
            if(i > 0)
                System.out.print(",");
            System.out.print(arr2[i]);
        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
    }
}
