import java.util.Scanner;
public class hitungnilaiakhir {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        double bobotKuis = 0.20, bobotTugas = 0.15, bobotUTS = 0.30, bobotUAS = 0.35;
        System.out.println("Masukan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukan nomer absen: ");
        absen = sc.nextByte();
        System.out.println("Masukan nilai kuis (0-100): ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukan nilai tugas (0-100): ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukan nilai UTS (0-100): ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukan nilai UAS (0-100): ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = (nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);
        System.out.println("Nilai akhir adalah: " + nilaiAkhir);


    }
}