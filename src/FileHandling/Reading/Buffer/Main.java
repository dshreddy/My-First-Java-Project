package FileHandling.Reading.Buffer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * You can read files using BufferedReader and FileReader, which are ideal for text files. 
 * The key difference is that BufferedReader’s read() method returns an integer 
 * representing the Unicode value of a character, rather than a byte. 
 * This method is useful for reading character-by-character, 
 * where each integer corresponds to a specific character.
 */

public class Main {
    public static void main(String[] args) {
        File myTest = new File("src/myTestFile.txt");
        try (BufferedReader inputStream = new BufferedReader(new FileReader(myTest))) {
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
    
}
