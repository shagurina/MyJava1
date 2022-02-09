import java.util.Scanner;

public class HomeWork7 {

  //  public static Scanner scanner = new Scanner(System.in);


    public static void main (String[] args){

//        String string1 = "Caramba!";
//        String string2 = "Caram";
//        string2 += "ba!";
//        String string3 = scanner.nextLine();
//        String string4 = "Caramba!";
//
//        System.out.println("string1 -> " + string1);
//        System.out.println("string2 -> " + string2);
//        System.out.println("string3 -> " + string3);
//        System.out.println("string4 -> " + string4);
//        System.out.println("----------");
//        System.out.println("string1 == string2 -> " + (string1 == string2));
//        System.out.println("string1 == string3 -> " + (string1 == string3));
//        System.out.println("string1 == string4 -> " + (string1 == string4));
//        System.out.println("----------");
//        System.out.println("string1 == string2 -> " + (string1.equals(string2)));
//        System.out.println("string1 == string3 -> " + (string1.equals(string3)));
//        System.out.println("string1 == string4 -> " + (string1.equals(string4)));

        String timeTest = "test1: ";

        long start = System.nanoTime();

        for (int i = 0; i <= 10000; i++) {
            timeTest += i;
        }

//      System.out.println("----------");
//      System.out.println(timeTest);

        long finish = System.nanoTime();

        System.out.println((finish-start)*0.000001f + " ms");

        StringBuilder stringBilder = new StringBuilder("test2: ");

        long start2 = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            stringBilder.append(i);
        }

//      System.out.println("----------");
//      System.out.println(stringBilder);

        long finish2 = System.nanoTime();

        System.out.println((finish2 - start2)*0.000001f + " ms");

//      или:
//      float timeBild = System.nanoTime() - start2;
//      System.out.println((timeBild)*0.000001f + " ms");















    }




}
