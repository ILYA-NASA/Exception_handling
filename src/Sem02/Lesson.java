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
            fileWriter.println("РђРЅРЅР°=4");
            fileWriter.println("Р•Р»РµРЅР°=5");
            fileWriter.println("РњР°СЂРёРЅР°=6");
            fileWriter.println("Р’Р»Р°РґРёРјРёСЂ=?");


        } catch (IOException e) {
            System.out.println("РќРµ cРјРѕРіР»Рё СЃРѕР·РґР°С‚СЊ С„Р°Р№Р»");
        } finally {
            fileWriter.close();

        }

        parseFile(file);
    }

    private static void parseFile(File file) {
        Map<String, String> names = new HashMap<>();
        String temp;
        if (file != null) {

            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                System.out.println(fileReader.readLine());
                while ((temp = fileReader.readLine()) != null) {
                    System.out.println(temp);
                    if (!"".equals(temp)) {
                        System.out.println("2 " + temp);
                        names.put(temp.split("=")[0], temp.split("=")[1]);

                    }
                }

                if (names.containsValue("?")) {
                    for (Map.Entry<String, String> e : names.entrySet()) {
                        if ("?".equals(e.getValue())) {
                            e.setValue(String.valueOf(e.getKey().length()));
                        }
                    }
                }
                System.out.println(names);

            } catch (FileNotFoundException e) {
                System.out.println("РќРµ СЃРјРѕРіР»Рё РїСЂРѕС‡РёС‚Р°С‚СЊ С„Р°Р№Р»");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}