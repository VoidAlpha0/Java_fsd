package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {
        String filePath = "try.txt";
        
        // Write to file
        writeToFile(filePath, "Hello, World!");
        
        // Read from file
        String content = readFromFile(filePath);
        System.out.println("File content: " + content);
        
        // Append to file
        appendToFile(filePath, "\nThis is an appended line.");
        
        // Read again after appending
        content = readFromFile(filePath);
        System.out.println("File content after appending: " + content);
    }
    
    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    
    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        
        return content.toString();
    }
    
    private static void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            System.out.println("Successfully appended to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}

