package ss16.bai_tap.bai_1;

import java.io.*;

public class CopyText {

    public static void main(String[] args) {
        File fileSource = new File("src\\ss16\\bai_tap\\bai_1\\source.csv");
        File fileTarget = new File("src\\ss16\\bai_tap\\bai_1\\target.csv");
        String line;
        if (!fileSource.exists()) {
            System.out.println("file nguồn chưa tồn tại");
        } else if (fileTarget.exists()) {
            System.out.println("file đích đã tồn tại");
        } else {
            try (FileReader fileReader = new FileReader(fileSource);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
                 FileWriter fileWriter = new FileWriter(fileTarget);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

