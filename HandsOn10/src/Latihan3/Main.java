package Latihan3;

interface Vehicle {
    void bergerak();
}

interface EnginePowered {
    void startEngine();
}

interface Fuelable {
    void isiBahanBakar();
}

interface Rechargeable {
    void isiBaterai();
}

class MobilListrik implements Vehicle,
        EnginePowered, Rechargeable {

    public void bergerak() {
        System.out.println("Mobil listrik sedang berjalan.");
    }

    public void startEngine() {
        System.out.println("Menyalakan motor listrik.");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}

class MobilBensin implements Vehicle,
        EnginePowered, Fuelable {

    public void bergerak() {
        System.out.println("Mobil bensin sedang berjalan.");
    }

    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin.");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil bensin.");
    }
}

class Sepeda implements Vehicle {

    public void bergerak() {
        System.out.println("Sepeda sedang dikayuh.");
    }
}

public class Main {

    public static void main(String[] args) {

        MobilListrik listrik = new MobilListrik();

        listrik.startEngine();
        listrik.isiBaterai();
        listrik.bergerak();

        System.out.println();

        MobilBensin bensin = new MobilBensin();

        bensin.startEngine();
        bensin.isiBahanBakar();
        bensin.bergerak();

        System.out.println();

        Sepeda sepeda = new Sepeda();

        sepeda.bergerak();
    }
}