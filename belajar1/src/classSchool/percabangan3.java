package classSchool;

import java.util.Scanner;

public class percabangan3 {

    public static void main(String[] args) {
        String nama;
        String predikat;
        int nilai;

        Scanner input = new Scanner(System.in);
        System.out.println(" masukkan nama : ");
        nama = input.next();
        System.out.println("Masukkan nilai anda wahay mahasiswaku : ");
        nilai = input.nextInt();

        if (nilai >= 90) {
            predikat = "A++";
        } else if (nilai >= 80) {
            predikat = "B+";

        } else if (nilai > 70) {
            predikat = "B--";
        } else if (nilai > 60) {
            predikat = "C--";

        } else if (nilai >= 50) {
            predikat = "D++";
        } else {
            predikat = "E+++++++++++++++++++++++++++";

        }

        System.out.println("nama mahasiswa : " + nama);
        System.out.println("predikat mahasiswa : " + predikat);

    }

}
