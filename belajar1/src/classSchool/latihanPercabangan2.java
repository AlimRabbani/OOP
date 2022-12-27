package classSchool;

import java.util.Scanner;

public class latihanPercabangan2 {

    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner input = new Scanner(System.in);

        // mengambil input 
        System.out.println("Masukkan nama : ");
        nama = input.next();
        System.out.println("Masukkan nilai : ");
        nilai = input.nextInt();

        if (nilai > 80) {
            System.out.println("Selamat" + nama + "  kamu lulus tes , silahkan pulkam bg lim kamu dpt nilai +++++++++++++");
        } else if (nilai > 60) {
            System.out.println("selamat " + nama + " anda tidak lulus++++++ ");

        } else if (nilai >= 50) {
            System.out.println("mohon maaf kamu mengulang tahun depan --------------");

        } else {
            System.out.println("terimakasih sebelumya , begini saja ada saranku ! berenti mki kuliah hahahhhahaha  ");

        }

    }

}
