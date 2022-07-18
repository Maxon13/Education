package Example_1;
import java.util.Arrays;

public class Example_1 {

    // Заполните массив любыми числами и выведите максимальное, минимальное и среднее значение.

    public static void main(String[] args) {
       int max = 0, min = 0, avg = 0;
        int [] number = new int[120];
        for (int i = 0; i < number.length; i++) {
            number[i]=i+4;
            if(max < number[i])
                max = number[i];
            if(min > number[i])
                min = number[i];
            avg += number[i]/number.length;
        }

        System.out.println(Arrays.toString(number));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);

    }




}
