package classSchool;

public class data { 
    public static void main(String[] args) {
        
        ck mahasiswa1 = new ck();  
        
        mahasiswa1.setNama("alim rabbani");
        mahasiswa1.setAlamat("mamasa");
        mahasiswa1.setUsia(19); 
        mahasiswa1.setStatus(true);
        mahasiswa1.setBerat_badan(56.7);
        mahasiswa1.setKehalian("mampu menampilkan hellow word");
        mahasiswa1.setNilai_rata_rata('A');
        
        ck mahasiswa2 = new ck();  
        
        mahasiswa2.setNama("bg");
        mahasiswa1.setAlamat("mamasa");
        mahasiswa1.setUsia(19); 
        mahasiswa1.setStatus(true);
        mahasiswa1.setBerat_badan(56.7);
        mahasiswa1.setKehalian("mampu menampilkan hellow word");
        mahasiswa1.setNilai_rata_rata('A');
        
        
        System.out.println("nama saya : " + mahasiswa1.getNama()); 
        System.out.println("========================");
        System.out.println("nama : " + mahasiswa2.getNama()); 
        
        
        
        
        
        
    }
    
}
