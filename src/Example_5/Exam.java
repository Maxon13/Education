package Example_5;

//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException,
// с детализацией в какой именно ячейке лежат неверные данные.
// 3. В методе main() вызвать полученный метод, обработать возможные исключения
// MySizeArrayException и MyArrayDataException, и вывести результат расчета.

    public class Exam {

        public static void main(String[] args) {
            Exam main = new Exam();
            String[][] correct = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };
            String[][] incorrect = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };
            String[][] incorrect2 = {
                    {"1", "2", "3", "4"},
                    {"1", "2", "4"},
                    {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}
            };
            try {
                main.stringExceptionTest(correct);
                main.stringExceptionTest(incorrect);
//            main.stringExceptionTest(incorrect2);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }

        public void stringExceptionTest(String[][] arr) throws MyArraySizeException {
            if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" +
                        " строке", i));
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }


    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }