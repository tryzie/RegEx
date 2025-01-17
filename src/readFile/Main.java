package readFile;



import java.io.*;
 import java.nio.file.*;
 import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "/home/colloh/IdeaProjects/FileHandling/src/employees/Employees.java"; // Change to your file path

        try {
            String content = Files.readString(Paths.get(filePath));

            // Simple pattern for private properties
            Pattern propertyPattern = Pattern.compile("private [a-zA-Z]+ [a-zA-Z]+;");
            Matcher propertyMatcher = propertyPattern.matcher(content);

            // Simple pattern for private methods
            Pattern methodPattern = Pattern.compile("public [a-zA-Z]+ [a-zA-Z]+\\(");
            Matcher methodMatcher = methodPattern.matcher(content);

            System.out.println("Private Properties:");
            System.out.println("------------------");
            while (propertyMatcher.find()) {
                System.out.println(propertyMatcher.group());
            }

            System.out.println("\nPrivate Methods:");
            System.out.println("---------------");
            while (methodMatcher.find()) {
                System.out.println(methodMatcher.group() + ")");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}