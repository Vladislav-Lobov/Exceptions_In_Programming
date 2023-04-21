// Домашняя работа от 02 семинара (20 апреля 2023г.)
// Задание 002.

// Если необходимо, исправьте данный код: https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit

// Исходный код:
// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }

public class J20230420_homework02 {

    public static void main(String[] args) {

        try {
            int[] intArray = { 5, 7, 8, 1, 1, 3, 9, 7, 4 }; // Исправленная строка
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}
