package classSchool;

import java.util.Scanner;

public class operatorAritmatika {

    public static void main(String[] args) {

        int angka1;
        int angka2;
        int hasil;

        Scanner cari = new Scanner(System.in);

        System.out.println("input angka -1 = ");
        angka1 = cari.nextInt();
        System.out.println("input angka -2 = ");
        angka2 = cari.nextInt();

        //penjumlahan 1
        hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahannya adalah = " + hasil);
        
        System.out.println("input angka -1 = ");
        angka1 = cari.nextInt();
        System.out.println("input angka -2 = ");
        angka2 = cari.nextInt();

        // pengurangan 
        hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan adalah=" + hasil); 

        System.out.println("input angka -1 = ");
        angka1 = cari.nextInt();
        System.out.println("input angka -2 = ");
        angka2 = cari.nextInt();

        // perkalian 
        hasil = angka1 * angka2;
        System.out.println("Hasil perkalian adalah=" + hasil);

        System.out.println("input angka -1 = ");
        angka1 = cari.nextInt();
        System.out.println("input angka -2 = ");
        angka2 = cari.nextInt();

        //pembagian 
        hasil = angka1 / angka2;
        System.out.println("Hasil pembagian adalah=" + hasil);

        System.out.println("input angka -1 = ");
        angka1 = cari.nextInt();
        System.out.println("input angka -2 = ");
        angka2 = cari.nextInt();

        // sisa bagi 
        hasil = angka1 % angka2;
        System.out.println("Hasil sisa bagi adalah=" + hasil);

    }

}
