/*
* Author: Jatinder Singh
* Section: CS114004
* ID: 31374749
*/
public class Main {
    public static int arraySum(int[] array, int n) {

        if (n == 0) {
            return array[0];
        } else {

            return (arraySum(array, n-1) + array[n-1]);
        }



    }
    public static void main(String[] args) {


        int[] arry = {10, 20, 30, 40, 50};

        arry[0] = 20;

        int sum = arraySum(arry, arry.length);

        System.out.println(sum);



    }
}
