package Example_4;
// Дан массив целых чисел и ещё одно целое число.
// Удалите все вхождения этого числа из массива (пропусков быть не должно).

import java.util.Arrays;

public class Example_4 {
    public static void main(String[] args) {
        int array[] = {2,4,6,8,9,3,1,4,5,7,5,123,668,23,24,75,8,37,38,234,2,2,3,2,3,2};
        System.out.println(Arrays.toString(removeSimbol(array, 2)));

    }
    public static int[] removeSimbol(int[] arr, int number){
        int offset = 0;

        for(int i = 0; i< arr.length; i++) {
            if (arr[i] == number) {
                offset++;
            } else {
                arr[i - offset] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - offset);
    }
}
