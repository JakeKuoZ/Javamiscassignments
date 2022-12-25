import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCharacterReader {

    public static void main(String[] args) {
        System.out.println("Assignment 12.13\n");
        System.out.println("This program count number of a txt file: " +
                "\nlines, words, characters");
        System.out.println("Please select .TXT FILE wanted to check.");
        run();
    }

    public static void run() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "TXT files", "txt");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                if (!file.exists()) {
                    throw new FileNotFoundException("File is not exist");
                }
            } catch (FileNotFoundException e ) {
                System.out.println("The file you select is not exist: " + chooser.getSelectedFile().getName());
                System.out.println("Do you want to try again? \nEnter 'y' to continue other to quit");
                Scanner scanner = new Scanner(System.in);
                String flag = scanner.next();
                if (flag.equals("y")) {
                    run();
                }
                System.out.println("Program quit");
                System.exit(0);
            }
        }
        try {
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
        }catch (NullPointerException e){
            System.out.println("You have not selected any file please try again");
            System.out.println("Press 'y' to continue other to quit");
            Scanner scanner = new Scanner(System.in);
            String flag = scanner.next();
            if (flag.equals("y")) {
                run();
            }
            System.out.println("Program quit");
            System.exit(0);
        }

        File file = chooser.getSelectedFile();

        int line = 0;
        int word = 0;
        int chars = 0;
        try (
                Scanner scanner = new Scanner(file);) {
            if (!scanner.hasNext()) {
                throw new IOException("File is empty");
            }
            while (scanner.hasNext()) {
                String lines = scanner.nextLine();

                String[] wordArray = lines.split(" ");

                chars += lines.length();
                line += 1;
                word += wordArray.length;
            }

            System.out.println("File " + file.getName() + " have: \n" +
                    chars + " characters" + "\n" + word + " words" + "\n" + line + " lines");
            System.out.println("Do you want to try again? \nEnter 'y' to continue other to quit");
            Scanner scanner1 = new Scanner(System.in);
            String flag = scanner1.next();
            if (flag.equals("y")) {
                run();
            }
            System.out.println("Program quit");
            System.exit(0);
        } catch (IOException empty) {
            System.out.println("Selected file is empty.");
            System.out.println("Do you want to try another? \nEnter 'y' to continue other to quit");
            Scanner scanner = new Scanner(System.in);
            String flag = scanner.next();
            if (flag.equals("y")) {
                run();
            }
            System.out.println("Program quit");
            System.exit(0);
        }


    }
}
