public class HomeWork2 {

    public static void main(String[] args) {

        System.out.println(sumCheck(10, 0));
        System.out.println(checkPolarity(-1));
        System.out.println(checkTopsyTurvy1(-10));
        System.out.println(checkTopsyTurvy2(-2));
        System.out.println(typeText("Какой прекрасный день",5));
    }

//    1. Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//    в противном случае – false.

    public static boolean sumCheck(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

//            2. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.

    public static String checkPolarity(int p) {
        if (p >= 0) {
            return "Positive";
        } else {
            return "Negative";
        }

    }

//            3. Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean checkTopsyTurvy1(int tt1) {
        return (tt1 < 0);
    }
//  Пыталась что-то сделать с нулём, но вышло то же самое,только длиннее:

    public static boolean checkTopsyTurvy2(int tt2) {
        if (tt2 < 0) {
            return true;
        }
        return false;
    }

//            4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static String typeText(String text, int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(text);
        }
        return text;
    }
}