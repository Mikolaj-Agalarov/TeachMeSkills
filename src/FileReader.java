package Lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    String path;

    public FileReader(String path) {
        this.path = path;
    }

    public void checkFile() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(this.path)));

        List<String> validId = new ArrayList<>();
        List<String> nonvalidId = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("docnum: ")  | line.contains("contract: "))
            {
                line = line.replace("docnum:", " ");
                line = line.replace("contract:", " ");
                line = line.trim();
                if (line.length() == 15) {
                    String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
                    for (int i = 0; i < line.length(); i++) {
                        char ch = line.charAt(i);
                        if (specialCharactersString.contains(Character.toString(ch))) {
                            nonvalidId.add(line);
                            break;
                        }
                        }
                    if (!nonvalidId.contains(line))
                    {
                        validId.add(line);
                    }
                    }
                else
                {
                    nonvalidId.add(line);
                }
                } else
            {
                nonvalidId.add(line);
            }
            }
        System.out.println(validId);
        }
    }