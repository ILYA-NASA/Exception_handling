package Sem01;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int sizeMatr = 5;
        printMatr(initArr(sizeMatr));
    }

    public static int[][] initArr(int size) {
        int[][] matrix = new int[size][size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rnd.nextInt(10);
            }
        }
        return matrix;
    }

    public static void printMatr(int[][] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                System.out.println(args[i][j]);
            }
        }
    }

}

//    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.
//        При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
//        и в каждой ячейке может лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
