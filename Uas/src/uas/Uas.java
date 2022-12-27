package uas;

import java.util.Scanner;

public class Uas {

    public static void main(String[] args) {
       
        
        System.out.println("===Biodata Mahasiswa===");
        
        String nama;
        int usia ; 
        char kelas  = ('F'); 
        short TinggiBadan;
        float beratBadan; 
        byte angkatan; 
        long IPK; 
        double nilai_rata_rata ; 
        boolean status; 
        
        Scanner  data = new Scanner(System.in); 
        
        System.out.println("Masunna nama anda = "); 
        nama= data.next(); 
        System.out.println("masukkan usia = ");
        usia = data.nextInt(); 
        System.out.println("kelas  = " + kelas); 
        System.out.println("Tinggi badan = "); 
        TinggiBadan = data.nextShort(); 
        System.out.println("berat badan =  ");
        beratBadan = data.nextShort(); 
        System.out.println("angkatan = "); 
        angkatan = data.nextByte(); 
        System.out.println("IPK = ");
        IPK = data.nextLong(); 
        System.out.println("nilai rata rata = ");
        nilai_rata_rata = data.nextDouble(); 
        System.out.println("status = "); 
        status = data.hasNextBoolean(); 
        
        System.out.println("====Data======"); 
        System.out.println(" nama = " + nama ); 
        System.out.println("usia = " + usia); 
        System.out.println("kelas = " + kelas ); 
        System.out.println("tinggi badan = " + TinggiBadan); 
        System.out.println("berat badan = " + beratBadan); 
        System.out.println("angkatan = " + angkatan); 
        System.out.println("ipk per semester = " + IPK); 
        System.out.println("nilai rata rata = " + nilai_rata_rata); 
        System.out.println("satus = " + "mahasiswa aktif" + status); 
        
        
        
        
        
        
        
        
    
            
        
   
    
    
    
    
    }
    
}
