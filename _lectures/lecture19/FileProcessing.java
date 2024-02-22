import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

class FileProcessing {
    public static void main(String[] args) throws IOException {
        String contents = Files.readString(Paths.get(args[0]));
        String[] lines = contents.split("\n");
        System.out.println(Arrays.toString(lines));
    }
}

class AverageEachLine {
    static double mean(String[] nums) {
        double total = 0;
        for(String s: nums) {
            total += Double.parseDouble(s);
        }
        return total / nums.length;
    }

    public static void main(String[] args) throws IOException {
        String contents = Files.readString(Paths.get(args[0]));
        String[] lines = contents.split("\n");

        for(String line: lines) {
            System.out.println("Average of " + line + ": " + mean(line.split(" ")));
        }
    }
}
