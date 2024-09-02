/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktik_1;

/**
 *
 * @author ASUS
 */
public class Nilai {
    // Atribut
    String NIM;
    String Nama;
    double NilaiAbsen;
    double NilaiTugas;
    double NilaiUTS;
    double NilaiUAS;

    // Method Nilai untuk inisialisasi data
    Nilai(String nim, String nama, double absen, double tugas, double uts, double uas) {
        this.NIM = nim;
        this.Nama = nama;
        this.NilaiAbsen = absen;
        this.NilaiTugas = tugas;
        this.NilaiUTS = uts;
        this.NilaiUAS = uas;
}
    
    void CetakNilai() {
        double NilaiAkhir = (NilaiAbsen * 0.1) + (NilaiTugas * 0.2) + (NilaiUTS * 0.3) + (NilaiUAS * 0.4);
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Absen [10%] : " + NilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + NilaiTugas);
        System.out.println("Nilai UTS [30%] : " + NilaiUTS);
        System.out.println("Nilai UAS [40%] : " + NilaiUAS);
        System.out.println("Nilai Akhir : " + NilaiAkhir);
    }
}