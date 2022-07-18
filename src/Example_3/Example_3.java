package Example_3;

//Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//Используйте для решения этой задачи циклы.
public class Example_3 {

    public static void main(String[] args) {
        printNumber();
        System.out.println(printNumber());
    }

    private static double printNumber() {
        double number= Math.random()*100;
        do {
            return number;
        }while (number>2 || number<100);

    }
}
