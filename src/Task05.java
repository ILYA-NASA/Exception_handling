import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, null, 4, 5};
        checkArray(array);
    }

    public static void checkArray(Integer[] arr) {
        List<Integer> emptyVal = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                emptyVal.add(i);
            }
        }
        System.out.println("these indexes value is null" + emptyVal);
    }
}

//    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и проверить что он не равен null.
//        А теперь реализуйте следующую логику (через коды ошибок или исключения):
//        Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//        Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

