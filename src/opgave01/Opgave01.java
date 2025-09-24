package opgave01;

public class Opgave01 {
    public static void main(String[] args){
        int a =5;
        int b = 10;
        int[] swappedInts = swappedInts(a,b);
        a = swappedInts[0];
        b= swappedInts[1];
        System.out.println("the two integers switched is " + a + " and " + b);

    }
    public static int[] swappedInts(int a, int b){
        int[] swappedInts = new int[2];
        swappedInts[0] = b;
        swappedInts[1] = a;
        return swappedInts;
    }
}
