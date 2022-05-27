package ss16.bai_tap.bai_2;

import java.io.*;

public class CountryMain {
    public static void main(String[] args) {
        File file = new File("src/ss16/bai_tap/bai_2/list.csv");
        try {
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert fileReader != null;
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while (((line = bufferedReader.readLine()) != null)) {

                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
