// Домашняя работа от 02 семинара (20 апреля 2023г.)
// Задание 004.

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class J20230420_homework04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new RuntimeException("Сработало исключение. Пустые строки вводить нельзя!");
        } else {
            System.out.println("Вы ввели " + input);
        }

    }

}
