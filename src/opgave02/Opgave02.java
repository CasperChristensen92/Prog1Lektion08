package opgave02;

import java.util.Arrays;

public class Opgave02 {
    public static void main(String[] args) {
        int[] intArray = {23, 8, 202, -13, 42, 6, 53, 17, 22};
        System.out.println("Our array of integers");
        printNumbers(intArray);
        System.out.println("Exercise a: The array of integers with the first and last integer swapped");
        printNumbers(swapFirstAndLastInt(intArray));
        System.out.println("Exercise b: The array of integers with every even number replaced with a 0:");
        printNumbers(replaceEvenNumbers(intArray));
        System.out.println("Exercise c: the smallest number of the array");
        System.out.println(smallestNumber(intArray));
        System.out.println("The index of the smallest number in the array is: ");
        System.out.println(smallestNumberIndex(intArray));
        System.out.println("the array pushed one index is: ");
        printNumbers(pushNumbers(intArray));
        System.out.println("The number second to biggest is: ");
        System.out.println(almostBiggestNumber(intArray));
        System.out.println("Check if the array is sorted:");
        System.out.println(isSorted(intArray));
        System.out.println("Check if the array has a doublet");
        System.out.println(hasDoublet(intArray));
    }
    //exercise 1
    public static int[] swapFirstAndLastInt(int[] ints){
        int[] intArrayResult = Arrays.copyOf(ints,ints.length);
        int[] swapped = opgave01.Opgave01.swappedInts(intArrayResult[0],intArrayResult[intArrayResult.length-1]);
        intArrayResult[0] = swapped[0];
        intArrayResult[intArrayResult.length-1] = swapped[1];
        return intArrayResult;
    }
    public static void printNumbers(int[] integerArray) {
        for (int number : integerArray) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
    //exercise 2
    public static int[] replaceEvenNumbers(int[] ints){
        int[] intArrayResult = Arrays.copyOf(ints,ints.length);
        for (int i = 0; i < intArrayResult.length; i++) {
            if (intArrayResult[i]%2==0){
                intArrayResult[i] = 0;
            }
        }
        return intArrayResult;
    }
    // exercise 3
    public static int smallestNumber(int[] intArray){
        int smallInt = Integer.MAX_VALUE;
        for (int x : intArray) {
            if (x < smallInt) {
                smallInt = x;
            }
        }
        return smallInt;
    }
    //exercise 4
    public static int smallestNumberIndex(int[] intArray){
        int smallInt = smallestNumber(intArray);
        for (int i = 0; i < intArray.length; i++) {
            if (smallInt==intArray[i]){
                return i;
            }
        }
        return -1;
    }
    //exercise 5
    public static int[] pushNumbers (int[] ints){
        int[] pushedArray = new int[ints.length];
        int lastInt = ints[ints.length-1];
        for (int i = ints.length-1; i > 0; i--) {
            pushedArray[i] = ints[i-1];
        }
        pushedArray[0]=lastInt;
        return pushedArray;
    }
    // exercise 6
    public static int almostBiggestNumber(int[] intArray) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for (int number : intArray){
            if (number > a){
                b=a;
                a=number;
            } else if (number > b) {
                b = number;
            }
        }
        return b;
    }
    //exercise 7
    public static boolean isSorted(int[] intArray){
        for (int i = 0; i < intArray.length-1; i++) {
            if (intArray[i]>intArray[i+1]){
                return false;
            }
        }
        return true;
    }
    //exercise 8
    public static boolean hasDoublet(int[] intArray){
        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
