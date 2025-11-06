import java.util.Scanner;

public class Tugas1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        double rataRata = (double) total / jumlah;
        System.out.println();
        System.out.print("Semua nilai mahasiswa: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilai[i] + " | ");
        }
        System.out.println("\nTotal nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        sc.close();
    }
}
