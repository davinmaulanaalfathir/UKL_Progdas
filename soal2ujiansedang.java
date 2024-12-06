public class soal2ujiansedang {
    
    
    public static double hitungVolumeTabung(double jrjr, double tinggi) {            
        double volume = Math.PI * Math.pow(jrjr, 2) * tinggi; 
        return volume; 
    }
    public static void main(String[] args) {
        double jrjr = 10.0; 
        double tinggi = 10.0; 
        
        double volume = hitungVolumeTabung(jrjr, tinggi);
        System.out.printf("Volume tabung dengan radius "+jrjr+" dan tinggi "+tinggi+" adalah: " +volume);
    }
}

