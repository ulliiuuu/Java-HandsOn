package Latihan2;

class StudentGrader {

    public double hitungNilaiAkhir(
            double tugas, double uts, double uas) {

        return (tugas * 0.3) +
                (uts * 0.3) +
                (uas * 0.4);
    }
}

class ReportPrinter {

    public void cetakLaporan(String nama, double nilai) {
        System.out.println(
                "Laporan Nilai Mahasiswa: " + nama + " = " + nilai
        );
    }
}

class StudentRepository {

    public void simpanDatabase(String nama, double nilai) {
        System.out.println(
                "Menyimpan ke database: " + nama + " = " + nilai
        );
    }
}

public class Main {
    public static void main(String[] args) {

        StudentGrader grader = new StudentGrader();
        ReportPrinter printer = new ReportPrinter();
        StudentRepository repository = new StudentRepository();

        double nilai = grader.hitungNilaiAkhir(80, 85, 90);

        printer.cetakLaporan("Andi", nilai);
        repository.simpanDatabase("Andi", nilai);
    }
}