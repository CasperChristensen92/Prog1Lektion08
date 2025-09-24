package opgave02;

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
    public static int[] swapFirstAndLastInt(int[] intArray){
        int[] swapped = opgave01.Opgave01.swappedInts(intArray[0],intArray[intArray.length-1]);
        intArray[0] = swapped[0];
        intArray[intArray.length-1] = swapped[1];
        return intArray;
    }
    public static void printNumbers(int[] integerArray) {
        for (int number : integerArray) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
    //exercise 2
    public static int[] replaceEvenNumbers(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]%2==0){
                intArray[i] = 0;
            }
        }
        return intArray;
    }
    // exercise 3
    public static int smallestNumber(int[] intArray){
        int smallInt = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length-1; i++) {
            if (intArray[i]<smallInt){
                smallInt = intArray[i];
            }
        }
        return smallInt;
    }
    //exercise 4
    public static int smallestNumberIndex(int[] intArray){
        int smallInt = smallestNumber(intArray);
        for (int i = 0; i < intArray.length-1; i++) {
            if (smallInt==intArray[i]){
                return i;
            }
        }
        return -1;
    }
    //exercise 5
    public static int[] pushNumbers (int[] intArray){
        int[] pushedArrays = new int[intArray.length];
        int lastInt = intArray[intArray.length-1];
        for (int i = intArray.length-1; i > 0; i--) {
            pushedArrays[i] = intArray[i-1];
        }
        pushedArrays[0]=lastInt;
        return pushedArrays;
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
        for (int i = 0; i < intArray.length-2; i++) {
            if (intArray[i]>intArray[i+1]){
                return false;
            }
        }
        return true;
    }
    //exercise 8
    public static boolean hasDoublet(int[] intArray){
        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = i+1; j < intArray.length-1; j++) {
                if (intArray[i] == intArray[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
