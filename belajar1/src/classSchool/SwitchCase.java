package classSchool;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        String lampu;

        Scanner input = new Scanner(System.in);
        System.out.println("lampu : ");
        lampu = input.next();

        switch (lampu) {
            case "Merah":
                System.out.println("silahkan berhenti");
                break;
            case "orange":
                System.out.println("hati hati");
                break;
            case "Hijau":
                System.out.println("silahkan jalan ");
                break;

            default:
                System.out.println("warna lampu salah brader");

        }

    }

}
