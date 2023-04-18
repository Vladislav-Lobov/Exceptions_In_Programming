// Домашняя работа от 01 семинара (17 апреля 2023г.)
// Задание 001.
// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class J20230417_homework01 {
    public static void arithmeticException() {
        int a = 4;
        int b = 0;
        int c;
        c = a / b;
    }

    public static void arrayIndexOutOfBoundsException() {
        int a;
        int[] array = new int[]{5, 4, 3, 2, 1};
        a = array[array.length];
    }

    public static void negativeArraySizeException() {
        int[] array = new int[-4];
    }

    public static void main(String[] args) {

        System.out.println("Исключение №1: ");
        arithmeticException();

        System.out.println("Исключение №2: ");
        arrayIndexOutOfBoundsException();

        System.out.println("Исключение №3: ");
        negativeArraySizeException();

    }
}
