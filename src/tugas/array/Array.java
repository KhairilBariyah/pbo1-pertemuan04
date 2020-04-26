package tugas.array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int array[], i, n;
        array = new int[100];
        float rata, total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Elemen Array: ");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + i + " : ");
            array[i] = scan.nextInt();
            total = total + array[i];
        }
        rata = total / n;
        System.out.println("Hasil Nilai Total Adalah : " + total);
        System.out.println("Hasil Rata-Rata Adalah : " + rata);
    }
}




