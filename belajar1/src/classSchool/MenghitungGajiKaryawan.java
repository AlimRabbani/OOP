 
package classSchool;

import java.util.Scanner;


public class MenghitungGajiKaryawan { 
    
    public static void main(String[] args) {
        System.out.println("=======Data Karyawan=========");  
     String nama , alamat ; 
     int jum_kehadiran ;
     double Gaji ; 
     double pot_alpa = 2.5 / 100; 
     float pot_pajak = 25000;
     
     
     Scanner input = new Scanner(System.in); 
     
        System.out.println("Masukkan nama = ");
        nama = input.next();
        System.out.println("Masukkan alamat anda = ");
        alamat = input.next(); 
        System.out.println("jumlah kehadiran = ");
        jum_kehadiran = input.nextInt();
        System.out.println("Masukkan gaji perbulan = "); 
        Gaji =input.nextDouble();
        
        double pajak; 
        double gaji_kotor;
        double gaji_bersih; 
        
        if( jum_kehadiran >= 5){ 
            pajak = Gaji * pot_alpa + pot_pajak; 
            System.out.println("yang rajain makannya");
            
            
        }
        else{
            pajak = 0; 
        }
        
       gaji_kotor = Gaji * jum_kehadiran * pajak; 
       gaji_bersih = Gaji * pajak; 
       
       
        System.out.println("Nama karyawan : " + nama );
        System.out.println("alamat karyawan : " + alamat); 
        System.out.println("gaji karyawan : " + Gaji); 
        System.out.println("gaji bersih : " + gaji_bersih);
        System.out.println("gaji kotor : " + gaji_kotor);
        
        
     
        
        
                  
    }
    
}
