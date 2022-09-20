package home01;

import java.util.Arrays;

/*Реализуйте метод,принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив,каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class Task03 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diffElemArras(new int[]{1, 2, 3}, new int[]{3, 2, 1})));
    }

    public static int[] diffElemArras(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not equal!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
