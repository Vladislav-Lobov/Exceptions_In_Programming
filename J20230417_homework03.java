// Домашняя работа от 01 семинара (17 апреля 2023г.)

// Задание 003.

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class J20230417_homework03 {

    public static int[] sub(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Ошибка. Длины массивов не равны!");
        }
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] - arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 5, 0, -3, 8};
        int[] arr2 = new int[]{3, 2, 1, 3};
        System.out.println(Arrays.toString(sub(arr1, arr2)));
    }

}
