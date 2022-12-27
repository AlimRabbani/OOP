package classSchool;

import java.util.Scanner;

 
public class latihan { 
    public static void main(String[] args) {
        
        Scanner  input = new Scanner(System.in); 
        
        System.out.println("Gaji kotor : ");
        int gaji_bulanan = input.nextInt(); 
        System.out.println("Jumlah alpa: "); 
        int jumlah_alpa = input.nextInt(); 
        int potongan_alpa = 25000; 
        double potongan_pajak = 2.5 / 100; 
        
        System.out.println("Potongan pajak : " + potongan_pajak * gaji_bulanan); 
        
        
        double gaji_bersih; 
        
        if(jumlah_alpa >= 5){
            gaji_bersih = gaji_bulanan - potongan_pajak - potongan_alpa;
        }
        else {
            gaji_bersih = 0; 
        }
        
         System.out.println("Gaji bersih : " + gaji_bersih); 
         System.out.println("potongan pajak : " + potongan_pajak); 
    }
    
}
