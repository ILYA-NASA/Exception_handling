package home03;

import java.io.FileWriter;
import java.util.Scanner;

public class Task01 {
    String firstName;
    String lastName;
    String thirdName;
    String birthDate;
    String gender;
    int telephoneNum;

    public Task01(String firstName, String lastName, String thirdName, String birthDate, String gender, int telephoneNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.thirdName = thirdName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.telephoneNum = telephoneNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input: your first name, your last name, your third name, your birth date, "
                + "your gender and your telephone number");
        try (FileWriter writer = new FileWriter("UserData")) {
            Task01 user = new Task01(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextInt());
            writer.write(user.toString());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    @Override
    public String toString() {
        return "<" + lastName + "><" + firstName + "><" + thirdName + "><"
                + birthDate + "><" + gender + "><" + telephoneNum + '>';
    }
}
