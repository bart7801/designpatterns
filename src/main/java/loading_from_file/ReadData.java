package loading_from_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class ReadData {
    public static Path file = Paths.get("file_tmp.csv");

    public static void readFile() {

        List<RealEstate> realEstateList = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}