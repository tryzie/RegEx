package workflow;

import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        // File path
        String filePath = "/home/colloh/IdeaProjects/workflow-approval.html";

        try {
            // Read file content
            String file = Files.readString(Paths.get(filePath));

            // Pattern to match text within square brackets
            Pattern pattern = Pattern.compile("\\[[A-Z_]+]");
            Matcher matcher = pattern.matcher(file);

            System.out.println("Variables found in the file:");

            // Find and print all matches
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch (IOException  e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
