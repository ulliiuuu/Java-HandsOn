package HandsOn6;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("employees.txt");
        Path copy = Paths.get("copy_employees.txt");

        ArrayList<String> employees = new ArrayList<>();

        try {
            if (!Files.exists(path)) {
                System.out.println("File tidak ditemukan!");
                return;
            }

            try (BufferedReader br =
                         Files.newBufferedReader(path,
                                 StandardCharsets.UTF_8)) {

                String line;

                while ((line = br.readLine()) != null) {
                    employees.add(line);
                }
            }

            Files.write(copy, employees);

            System.out.println("Data karyawan:");

            for (String employee : employees) {
                System.out.println(employee);
            }

            System.out.println("File berhasil disalin!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
