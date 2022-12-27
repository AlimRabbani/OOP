package uas;

import java.util.Scanner;

public class Uas2 {
    public static void main(String[] args) {
        
        float jumlahSemen; 
        float HargaSemen = 60000f; 
        double diskon = 0;
        float pot_satu = 2/100;
        float pot_dua = 5/100; 
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("jumlah semen yang nada beli = "); 
        jumlahSemen= input.nextInt(); 
        double Diskon =  diskon * jumlahSemen * HargaSemen - pot_satu ;
         double Diskon2  =  diskon * jumlahSemen *HargaSemen - pot_dua;
       
        if(jumlahSemen > 100    ){
          
        } else if (jumlahSemen > 200){ 
            
        }else { 
            diskon = 0;
        }
        
        System.out.println(" jumlah semen yang di beli = "  + jumlahSemen); 
        System.out.println("harga semen = " + HargaSemen); 
        System.out.println(" Diskon " + diskon );
        
        
    
    
    
    }
    
}
