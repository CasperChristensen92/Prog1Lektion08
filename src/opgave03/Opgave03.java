package opgave03;

public class Opgave03 {
    public static void main(String[] args) {
        int[] intArray = {23, 8, 202, -13, 42, 6, 53, 17, 22};
        System.out.println("Our array of integers");
        opgave02.Opgave02.printNumbers(intArray);
        System.out.println("the array reversed is: ");
        opgave02.Opgave02.printNumbers(reverseArray(intArray));

    }
    public static int[] reverseArray(int[] ints){
        int[] reversedArray = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            reversedArray[i] = ints[ints.length-(i+1)];
        }
        return reversedArray;
    }
}


