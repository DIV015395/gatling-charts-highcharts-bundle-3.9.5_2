import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtils {

    public static void zipFolder(File folder, File zipFile) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(zipFile);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            zipFolder(folder, folder.getName(), zos);
        }
    }

    private static void zipFolder(File folder, String parentFolder, ZipOutputStream zos) throws IOException {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                zipFolder(file, parentFolder + "/" + file.getName(), zos);
                continue;
            }

            ZipEntry zipEntry = new ZipEntry(parentFolder + "/" + file.getName());
            zos.putNextEntry(zipEntry);

            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, bytesRead);
                }
            }

            zos.closeEntry();
        }
    }
}
