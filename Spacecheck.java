import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Spacecheck {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = readFile.readFileText("aaa.txt");
        System.out.println(lines);
        writefile.writeFileText("output.txt", lines);
    }
    }


 class readFile {
    public static ArrayList<String> readFileText(String filename) {

        //ArrayList to hold all the lines
        ArrayList<String> lines = null;
        //Get lines of text (Strings) as a stream
        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
            // convert stream to a List-type object
            lines = (ArrayList<String>) stream.collect(Collectors.toList());
        } catch (IOException ioe) {
            System.out.println("\nCould not read lines of text from the file.");
        } catch (SecurityException se) {
            System.out.println("Could not read the file provided." +
                    "Please check if you have permission to access it.");
        }

        return lines;
    }
}

class writefile {
    public static void writeFileText(String filename, ArrayList<String> linesOfText) {
        // Specify file location and name
        Path file = Paths.get(filename);
        // StringBuilder will be used to create ONE string of text
        StringBuilder sb = new StringBuilder();
        // Iterate over the list of strings and append them
        // to string-builder with a 'new line' carriage return.
        for (String line : linesOfText) {
            line.replaceAll(" ", ""); // Replace all whitespace with empty string
            sb.append(line).append("\n");
        }
        System.out.println(sb);
        // Get all bytes of produced string and instantly write them to the file.
        byte[] bytes = sb.toString().getBytes();
        // Write to file
        try {
            Files.write(file, bytes);
        } catch (IOException ioe) {
            System.out.println("\nCould not write to file \"" + filename + "\"");
        }

    }
}
