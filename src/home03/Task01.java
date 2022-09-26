package home03;

import java.util.Scanner;

public class Task01 {
    String firstName;
    String lastName;
    String thirdName;
    String birthDate;
    int telephoneNum;
    String gender;

    public Task01(String firstName, String lastName, String thirdName, String birthDate, int telephoneNum, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.thirdName = thirdName;
        this.birthDate = birthDate;
        this.telephoneNum = telephoneNum;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input: your first name, your last name, your third name, your birth date, " +
                "your telephone number and your gender");
        try {
            Task01 user = new Task01(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
