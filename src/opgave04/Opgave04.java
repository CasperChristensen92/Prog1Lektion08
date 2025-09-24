package opgave04;

public class Opgave04 {
    public static void main(String[] args) {
        int[] intArray1 = {1, 3, 5, 7, 9, 12, 125};
        int[] intArray2 = {1, 4, 7, 9, 13, 15, 17};
        System.out.println("Our two arrays of integers");
        System.out.println("The first one: ");
        opgave02.Opgave02.printNumbers(intArray1);
        System.out.println("The second one: ");
        opgave02.Opgave02.printNumbers(intArray2);
        System.out.println("The merged array");
        opgave02.Opgave02.printNumbers(mergedArrays(intArray1,intArray2));
    }
    public static int[] mergedArrays(int[] ints1,int[] ints2){
        int[] intsMerged = new int[ints1.length+ints2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < intsMerged.length; i++) {
            if (j < ints1.length && k < ints2.length) {
                if (ints1[j] <= ints2[k]){

                    intsMerged[i] = ints1[j];
                    j++;
                }
                else {
                    intsMerged[i] = ints2[k];
                    k++;
                }
            }
            else if (j < ints1.length) intsMerged[i] = ints1[j];
            else intsMerged[i] = ints2[k];
        }
        return intsMerged;
    }
}
