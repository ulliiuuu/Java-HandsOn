package HandsOn8;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        try (
                Scanner sc = new Scanner(System.in);
                BufferedWriter bw = Files.newBufferedWriter(
                        Paths.get("user_input.txt"))
        ) {
            while (true) {
                System.out.print("Masukkan teks: ");
                String text = sc.nextLine();

                if (text.equalsIgnoreCase("exit")) {
                    break;
                }

                String timestamp =
                        LocalDateTime.now().format(formatter);

                bw.write(timestamp + " - " + text);
                bw.newLine();
            }

            System.out.println("Data berhasil disimpan!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}