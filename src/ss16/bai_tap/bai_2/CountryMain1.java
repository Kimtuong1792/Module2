package ss16.bai_tap.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryMain1 {
public static List<String[]> readFile(String pathFile){
    File file = new File(pathFile);
    List<String[]> list = new ArrayList<>();
    String line;
    try {
        try (FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            while( (line = bufferedReader.readLine()) !=null){
                String []arr = line.split(",");
                list.add(arr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
return list;
}

    public static void main(String[] args) {
       List<String[]> list = readFile("src\\ss16\\bai_tap\\bai_2\\list.csv");
        for (String[] item:list
             ) {
            Country country = new Country(Integer.parseInt(item[0]),item[1],item[2]);
            System.out.println( country);
            
        }

    }
}
