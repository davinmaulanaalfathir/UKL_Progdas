import java.util.Scanner;
public class soal1ujianmudah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hargajarku = 4250;
        int hargajarbih = 6000;
        int hargaberatlebih = 50000;
        int jarminimal = 10;
        int volumeminimal = 100;
        
        System.out.println(" Masukkan berat paket");
        int b = input.nextInt();
        System.out.println(" Massukan Jarak Tempuh");
        int jatem = input.nextInt();
        System.out.println(" Massukan tinggi barang ");
        int t = input.nextInt();
        System.out.println(" Massukan Lebar barang");
        int L = input.nextInt();
        System.out.println(" Massukan panjang Barang");
        int p = input.nextInt();

        int volume = p * L * t;
        int hasil;

        if (jatem <= jarminimal) {
            hasil = hargajarku * b;
            if (volume > volumeminimal) {
                hasil = hasil + hargaberatlebih;
            }
        } else {
            hasil = hargajarbih * b;
            if (volume > volumeminimal) {
                hasil = hasil + hargaberatlebih;
            }
        }
        
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Volume Barang: " + volume+ "cm3");
        System.out.println("Total Biaya: Rp. " + hasil);
        
        input.close();
    }
}







