package Example_5;

//1. �������� �����, �� ���� �������� ������� ��������� ��������� ������ �������� 4�4,
// ��� ������ ������� ������� ������� ���������� ������� ���������� MyArraySizeException.
//2. ����� ����� ������ �������� �� ���� ��������� �������, ������������� � int, � ��������������.
// ���� � �����-�� �������� ������� �������������� �� �������
// (��������, � ������ ����� ������ ��� ����� ������ �����),
// ������ ���� ������� ���������� MyArrayDataException,
// � ������������ � ����� ������ ������ ����� �������� ������.
// 3. � ������ main() ������� ���������� �����, ���������� ��������� ����������
// MySizeArrayException � MyArrayDataException, � ������� ��������� �������.

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
            if (arr.length != 4) throw new MyArraySizeException("�������� ���������� �����");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) throw new MyArraySizeException(String.format("�������� ���������� �������� � %d-�" +
                        " ������", i));
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