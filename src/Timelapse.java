import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Timelapse {
    private int updateInterval = 100;

    private static String[] importTimelapse(Scanner scanner) {
        String line = (scanner.nextLine()).replace("\"", "");
        String[] split = line.split("[,]", 0);
        return new String[] {split[2], split[3], split[4]};
    }

    public static void runTimelapse() {
        Scanner scanner = null;

        try {
            File file = new File("data/sorted_place.txt");
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] data = importTimelapse(scanner);
        }
        scanner.close();
    }
}
