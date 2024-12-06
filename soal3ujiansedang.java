import java.util.Random;
import java.util.Scanner;

public class soal3ujiansedang {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random acak = new Random();
      
      String lanjut;
      int benar = 0, salah = 0;
      
      do {
          int angka1 = acak.nextInt(10);
          int angka2 = acak.nextInt(10)+1;
          int itung2an = acak.nextInt(3);
          
          switch (itung2an) {
              case 0:  // Perkalian
                  System.out.println(angka1 + " x " + angka2 + " = ? ");
                  System.out.print("Jawaban Anda: ");
                  int hasilKali = input.nextInt();
                  
                  if (hasilKali == angka1 * angka2) {
                      System.out.println("Jawaban Anda BENAR!");
                      benar++;
                  } else {
                      System.out.println("Salah. Jawaban yang benar adalah " + (angka1 * angka2));
                      salah++;
                  }
                  break;
              
              case 1:  // Pembagian
                  System.out.println(angka1 + " / " + angka2 + " = ? ");
                  System.out.print("Jawaban Anda: ");
                  int hasilBagi = input.nextInt();
                  
                  if (hasilBagi == angka1 / angka2) {
                      System.out.println("Jawaban Anda BENAR!");
                      benar++;
                  } else {
                      System.out.println("Salah. Jawaban yang benar adalah " + (angka1 / angka2));
                      salah++;
                  }
                  break;
              
              case 2:  // Modulus
                  System.out.println(angka1 + " % " + angka2 + " = ? ");
                  System.out.print("Jawaban Anda: ");
                  int hasilModulus = input.nextInt();
                  
                  if (hasilModulus == angka1 % angka2) {
                      System.out.println("Jawaban Anda BENAR!");
                      benar++;
                  } else {
                      System.out.println("Salah. Jawaban yang benar adalah " + (angka1 % angka2));
                      salah++;
                  }
                  break;
          }
          
          System.out.print("Ingin main lagi? (ya/tidak): ");
          lanjut = input.next();
          
      } while (lanjut.equalsIgnoreCase("ya"));
      
      System.out.println("Terima kasih!");
      System.out.println("Jawaban Benar: " + benar);
      System.out.println("Jawaban Salah: " + salah);
      input.close();
  }
}