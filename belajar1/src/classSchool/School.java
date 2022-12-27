package classSchool;

import java.util.Scanner;

public class School {

    public static void main(String[] args) {
        //  System.out.println("hellow word");  

        String nama, alamat, tempatLahir;
        double  gaji;
        int usia;
        Scanner input = new Scanner(System.in);

        System.out.println("Data karyawan UNSULBAR");
        System.out.println("Lampiran Format");

        System.out.println("nama : ");
        nama  = input.next(); 
        System.out.println("alamat : ");
        alamat = input.next(); 
        System.out.println("tempat lahir : ");
        tempatLahir = input.next(); 
        System.out.println(" gaji : ");
        gaji = input.nextDouble(); 
        System.out.println("umur : ");
        usia = input.nextInt(); 

        System.out.println("Nama karyawan :" + nama);
        System.out.println("Alamat karyawan : " + alamat);
        System.out.println("Tempat lahir karyawan : " + tempatLahir);
        System.out.println("gaji/bulan : " + gaji);
        System.out.println("Usia :" + usia); 
        System.out.println("semoga keterima amin");

    }

}
