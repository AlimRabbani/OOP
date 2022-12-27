package classSchool;

public class ck {
    
    private String nama , alamat ; 
    private int usia ; 
    private boolean status; 
    private String kehalian; 
    private float Tinggi ; 
    private char nilai_rata_rata; 
    private double berat_badan; 

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getKehalian() {
        return kehalian;
    }

    public void setKehalian(String kehalian) {
        this.kehalian = kehalian;
    }

    public float getTinggi() {
        return Tinggi;
    }

    public void setTinggi(float Tinggi) {
        this.Tinggi = Tinggi;
    }

    public char getNilai_rata_rata() {
        return nilai_rata_rata;
    }

    public void setNilai_rata_rata(char nilai_rata_rata) {
        this.nilai_rata_rata = nilai_rata_rata;
    }

    public double getBerat_badan() {
        return berat_badan;
    }

    public void setBerat_badan(double berat_badan) {
        this.berat_badan = berat_badan;
    }
    
    public static void main(String[] args) {
        
        ck alim1 = new ck();
        
        alim1.setNama("alim"); 
        System.out.println(alim1.nama);
    }
    
}
