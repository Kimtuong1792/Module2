package ss15.thuc_hanh;

import java.io.*;

public class IOstudy {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");

        if (file.exists()) {

            System.out.println("File already exists");

            System.exit(1);

        }


        // Create a file

        PrintWriter output = new PrintWriter(file);


        // Write formatted output to the file

        output.print("John T Smith ");

        output.println(90);

        output.print("Eric K Jones ");

        output.println(85);


        // Close the file

        output.close();
    }
}
