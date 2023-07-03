package test2;

import java.io.*;

public class Practice_project7 {
    public static void main(String[] args) {
        String fileName = "newfile.txt";

        createFile(fileName);

        writeToFile(fileName, "Hello, World!");

        String content = readFromFile(fileName);
        System.out.println("File Content: " + content);

        updateFile(fileName, "Hello, OpenAI!");

        content = readFromFile(fileName);
        System.out.println("Updated File Content: " + content);

        deleteFile(fileName);
    }

    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void updateFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Content updated in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getAbsolutePath());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}





