public class HomeWork3 {

    public static void main(String[] args) {

        inverse();
        hundred();
        multiplication();
        diagonal();
        array2args(4, -984);

    }

//    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static String inverse() {

        int[] array1 = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        System.out.print("Origin:  ");

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------------");

        int[] array2 = new int[array1.length];
        System.out.print("Inverse: ");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array2[i] = 1;
            } else {
                array2[i] = 0;
            }

            System.out.print(array2[i] + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        return " ";
    }

//2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
// его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void hundred() {
        int[] array3 = new int[100];
        System.out.print("Hundred: ");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i + 1;
            System.out.print(array3[i] + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2 в массиве;

    public static String multiplication() {

        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Origin:     ");

        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------------");

        System.out.print("Multiply:  ");

        for (int i = 0; i < array4.length; i++) {
            if (array4[i] <6) {
                array4[i] = array4[i]*2;
            } else {
            }
            System.out.print(array4[i] + " | ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        return " ";
    }

//4. Создать квадратный двумерный целочисленный массив (количество строк
//   и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
//   диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//   Определить элементы одной из диагоналей можно по следующему принципу:
//   индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void diagonal() {
        int[][] square = new int[12][12];
        System.out.println("Diagonal:");
        for (int i = 0; i < square.length; i++) {
            System.out.println();
            for (int j = 0; j < square[i].length; j++) {
                if (i == j || i+j == square[i].length - 1) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j] + "");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

//5. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static void array2args(int len, int initialValue) {
        System.out.print("Array2args:  ");
        int[] array5 = new int[len];
                for (int i = 0; i < array5.length; i++) {
                     array5[i] = initialValue;
                    System.out.print(array5[i] + "|");
                }
    }

}

