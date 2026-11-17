package HandsOn10;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class Produk<T, U> {

    private T nama;
    private U harga;
    private Integer stok;

    public Produk(T nama, U harga, Integer stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String toString() {
        return nama + "," + harga + "," + stok;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Produk<String, Double>> produkList = new ArrayList<>();

        produkList.add(new Produk<>("Laptop", 15000000.0, 10));
        produkList.add(new Produk<>("Mouse", 150000.0, 25));
        produkList.add(new Produk<>("Keyboard", 350000.0, 15));

        Path filePath = Paths.get("produk_output.txt");

        try {
            List<String> lines = new ArrayList<>();

            for (Produk<String, Double> p : produkList) {
                lines.add(p.toString());
            }

            Files.write(filePath, lines);

            System.out.println("Data produk berhasil disimpan");

            List<String> data = Files.readAllLines(filePath);

            System.out.println("\nData Produk:");

            for (String line : data) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + e.getMessage());
        }
    }
}