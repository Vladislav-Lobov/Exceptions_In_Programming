// Домашняя работа от 02 семинара (20 апреля 2023г.)
// Задание 001.

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20230420_homework01 {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите дробное число: ");
            try {
                System.out.println("Вы ввели " + input());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод данных. Вы ввели текст.");
            }
        }

    }

    public static float input() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}