import java.util.Scanner;
public class soal3ujiansulit {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Masukkan jumlah : ");

        int jumlahElemen = input.nextInt();
        int[] angka = new int[jumlahElemen];
        
        System.out.println("Masukkan :");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        int angkakmax = 0;

        for (int jum : angka) {
            if (jum > angkakmax) {
                angkakmax = jum;
            }
        }

        int[] frekuensi = new int[angkakmax + 1];
        for (int i = 0; i < angka.length; i++) {
            frekuensi[angka[i]]++;
        }
        
    
        for (int a = 0; a < frekuensi.length; a++) {
            if (frekuensi[a] > 0) {
                System.out.println( "angka "+a+ " muncul sebannyak " + frekuensi[a] + " kali");
                
            }
        }
        input.close();
   
    }

 }