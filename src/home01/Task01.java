package home01;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task01 {
    public static void main(String[] args) {
//        System.out.println(divide(4, 0)); //ArithmeticException: / by zero
//        System.out.println(getArrayElement(new int[10])); //ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 10
//        System.out.println(getArrayLen(new int[-1])); //NegativeArraySizeException: -1
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int getArrayElement(int[] array) {
        return array[100];
    }

    public static int getArrayLen(int[] array) {
        return array.length;
    }
}
