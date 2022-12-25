import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckSpace {

    public static void main(String[] args) throws IOException {


        File file = new File("aaa.txt");
        Scanner scanner = new Scanner(file);

        List lines = new ArrayList<>();
        while(scanner.hasNext()){
            lines.add(scanner.nextLine());
        }

        String slines = lines.toString();

        String nlines = slines.replaceAll("\s","");
        String clines = nlines.replaceAll(",","\n");

        FileWriter writer = new FileWriter("output.txt");

        writer.write(clines);
        writer.close();
    }
}
