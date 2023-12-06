package edu.exceptions;

import java.io.*;

public class ReadFile {
    public static void readFile(String fullPath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fullPath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String tmp = null;
        while ((tmp = bufferedReader.readLine()) != null){
            System.out.println(tmp);
        }

        bufferedReader.close();
        fileInputStream.close();
    }
}
