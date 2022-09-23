package home02;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
пользователя ввод данных.*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        try {
            System.out.println("Input float:");
            System.out.println("You input " + userFloat());
        } catch (Exception e) {
            System.out.println("You input not float!\nPlease repeat input:");
            System.out.println("You input " + userFloat());
        }
    }

    public static float userFloat() {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
}
