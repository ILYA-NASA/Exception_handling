package home02;

import java.util.Scanner;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            if (sc.nextLine().isEmpty()) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("Empty line cannot be input!");
        }
    }
}
