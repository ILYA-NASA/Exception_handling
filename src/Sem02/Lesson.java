package Sem02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Lesson {

    public static void main(String[] args) {
        File file = new File("1.txt");
        PrintWriter fileWriter = null;
        try {
            file.createNewFile();
            fileWriter = new PrintWriter(file);
            fileWriter.println("Анна=4");
            fileWriter.println("Елена=5");
            fileWriter.println("Марина=6");
            fileWriter.println("Владимир=?");



        } catch (IOException e) {
            System.out.println("Не cмогли создать файл");
        } finally{
            fileWriter.close();

        }

        parseFile(file);
    }

    private static void parseFile(File file) {
        Map<String, String> names = new HashMap<>();
        String temp;
        if (file != null){

            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                System.out.println(fileReader.readLine());
                while((temp = fileReader.readLine()) != null) {
                    System.out.println(temp);
                    if(!"".equals(temp)){
                        System.out.println("2 " + temp);
                        names.put(temp.split("=")[0], temp.split("=")[1]);

                    }
                }

                if(names.containsValue("?")){
                    for(Map.Entry<String, String> e : names.entrySet()){
                        if("?".equals(e.getValue())) {
                            e.setValue(String.valueOf(e.getKey().length()));
                        }
                    }
                }
                System.out.println(names);

            } catch (FileNotFoundException e) {
                System.out.println("Не смогли прочитать файл");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}