package HandsOn7;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path log = Paths.get("log.txt");

        try {
            Files.write(source,
                    List.of("Report Generated", "Status: OK"));

            if (Files.exists(source)) {
                Files.createDirectories(backup.getParent());

                Files.copy(source, backup,
                        StandardCopyOption.REPLACE_EXISTING);

                Files.writeString(log,
                        "Backup berhasil dibuat.\n",
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);

                System.out.println("Backup berhasil dibuat!");
            } else {
                Files.writeString(log,
                        "File sumber tidak ditemukan.\n",
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}