import java.util.Scanner;

public class soal1ujiansulit {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Berapa banyak siswa? ");
       int jumlahSiswa = input.nextInt();
       
       double total = 0;
       
       for (int i = 1; i <= jumlahSiswa; i++) {
           System.out.print("Nilai siswa ke-" + i + ": ");
           double nilai = input.nextDouble();
           
           total += nilai;
       }
       
       double rataRata = total / jumlahSiswa;
       
       System.out.printf("Rata-rata nilainya:"+ rataRata);
       
       input.close();
   }
}