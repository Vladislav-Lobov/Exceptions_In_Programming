// Домашняя работа от 01 семинара (17 апреля 2023г.)
// Задание 002.
// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
// код приложен в виде картинки к семинару

// Ответ: программа может выдать два исключения: выход за границы массива и ошибка преобразования в числовой формат

public class J20230417_homework02 {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {                //ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]);   //NumberFormatException
                sum += val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] array = {{"5", "2", "0", "1", "4"}, {"3", "1", "4", "7", null}};
        System.out.println(sum2d(array));
    }

}